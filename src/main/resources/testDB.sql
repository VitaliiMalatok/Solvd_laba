CREATE TABLE castomer (
castomer_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
organization TEXT(255) NOT NULL,
first_name TEXT(255) NOT NULL,
last_name TEXT(255) NOT NULL,
e_mail TEXT(255) NOT NULL,
address TEXT(255) NOT NULL,
postcode TEXT(255) NOT NULL
);

CREATE TABLE delivery (
delivery_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
first_name TEXT(255) NOT NULL,
last_name TEXT(255) NOT NULL,
employment_date TEXT(255) NOT NULL,
work_shift INTEGER NOT NULL
);

CREATE TABLE product_code (
product_code_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
name_of_product TEXT(255) NOT NULL,
price INTEGER NOT NULL,
manufacturer TEXT(255) NOT NULL
);

CREATE TABLE order_basket (
order_basket_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
quantity_of_goods INTEGER NOT NULL,
product_code INTEGER NOT NULL REFERENCES product_code(product_code_id)
);

CREATE TABLE client_orders (
client_orders_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
order_date TEXT(255) NOT NULL,
delivery_date TEXT(255) NOT NULL,
form_of_payment TEXT(255) NOT NULL,
castomer INTEGER NOT NULL REFERENCES castomer(castomer_id),
delivery INTEGER NOT NULL REFERENCES delivery(delivery_id),
order_basket INTEGER NOT NULL REFERENCES order_basket(order_basket_id)
);
/*castomer */
INSERT INTO castomer(organization, first_name, last_name, e_mail, address, postcode)
VALUES ("IDT", "Mark", "Anderson", "idt_anderson@idtsoft.com","UK Lonndon Green str. 54", 220109);
INSERT INTO castomer(organization, first_name, last_name, e_mail, address, postcode)
VALUES ("Softeco", "Bob", "Marli", "bob_marli@softeco.com","CH Taibey Yellow str. 2", 115206);
INSERT INTO castomer(organization, first_name, last_name, e_mail, address, postcode)
VALUES ("Godel", "Ilon", "Marks", "ilon@godel.com","RUS Sochi Lenina str. 104", 102223);
INSERT INTO castomer(organization, first_name, last_name, e_mail, address, postcode)
VALUES ("ItechArt", "Make", "Groch", "make@itechart.com","GR Berlin Red str. 15", 144562);
INSERT INTO castomer(organization, first_name, last_name, e_mail, address, postcode)
VALUES ("Wargeiming", "Teo", "Preston", "teo@wargeiming.com","FR Paris Blue str. 544", 632555);
/*delivery*/
INSERT INTO delivery(first_name, last_name, employment_date, work_shift)
VALUES ("Artur", "Smith", "11/04/2017", 1);
INSERT INTO delivery(first_name, last_name, employment_date, work_shift)
VALUES ("Bro", "Michel", "09/12/2019", 2);
INSERT INTO delivery(first_name, last_name, employment_date, work_shift)
VALUES ("Filip", "Bondi", "15/01/2021", 3);
INSERT INTO delivery(first_name, last_name, employment_date, work_shift)
VALUES ("Gregor", "Resting", "19/05/2015", 1);
INSERT INTO delivery(first_name, last_name, employment_date, work_shift)
VALUES ("Vitas", "Wrongel", "29/09/2017", 2);
/*product_code*/
INSERT INTO product_code(name_of_product, price, manufacturer)
VALUES ("Power Bank", 255, "Maxim Integreted");
INSERT INTO product_code(name_of_product, price, manufacturer)
VALUES ("A frequency converter", 1999, "Arrow corp");
INSERT INTO product_code(name_of_product, price, manufacturer)
VALUES ("Solenoid", 2500, "Traco Power");
INSERT INTO product_code(name_of_product, price, manufacturer)
VALUES ("Magnetic switch", 1856, "Texas Instruments");
INSERT INTO product_code(name_of_product, price, manufacturer)
VALUES ("Silicon processor", 555, "Silicon Labs");
/*order_basket*/
INSERT INTO order_basket(quantity_of_goods, product_code) VALUES (1, 1);
INSERT INTO order_basket(quantity_of_goods, product_code) VALUES (1, 1);
INSERT INTO order_basket(quantity_of_goods, product_code) VALUES (2, 1);
INSERT INTO order_basket(quantity_of_goods, product_code) VALUES (3, 2);
INSERT INTO order_basket(quantity_of_goods, product_code) VALUES (4, 2);
INSERT INTO order_basket(quantity_of_goods, product_code) VALUES (2, 3);
INSERT INTO order_basket(quantity_of_goods, product_code) VALUES (3, 4);
INSERT INTO order_basket(quantity_of_goods, product_code) VALUES (4, 5);
/*client_orders*/
INSERT INTO client_orders(order_date, delivery_date, form_of_payment, castomer, delivery, order_basket)
VALUES ("11/04/2017", "18/04/2017", "cash", 1, 5, 3);
INSERT INTO client_orders(order_date, delivery_date, form_of_payment, castomer, delivery, order_basket)
VALUES ("12/05/2018", "11/05/2018", "cash", 1, 5, 3);
INSERT INTO client_orders(order_date, delivery_date, form_of_payment, castomer, delivery, order_basket)
VALUES ("13/05/2019", "18/06/2018", "cash", 2, 1, 1);
INSERT INTO client_orders(order_date, delivery_date, form_of_payment, castomer, delivery, order_basket)
VALUES ("15/06/2019", "17/07/2019", "cash", 2, 3, 1);
INSERT INTO client_orders(order_date, delivery_date, form_of_payment, castomer, delivery, order_basket)
VALUES ("19/07/2019", "18/08/2019", "cash", 1, 1, 4);
INSERT INTO client_orders(order_date, delivery_date, form_of_payment, castomer, delivery, order_basket)
VALUES ("21/08/2020", "13/09/2021", "cash", 3, 3, 4);
INSERT INTO client_orders(order_date, delivery_date, form_of_payment, castomer, delivery, order_basket)
VALUES ("23/09/2020", "22/04/2021", "cash", 3, 1, 4);
INSERT INTO client_orders(order_date, delivery_date, form_of_payment, castomer, delivery, order_basket)
VALUES ("24/10/2021", "08/04/2022", "cash", 1, 2, 2);
INSERT INTO client_orders(order_date, delivery_date, form_of_payment, castomer, delivery, order_basket)
VALUES ("28/11/2021", "11/04/2022", "cash", 4, 2, 1);
INSERT INTO client_orders(order_date, delivery_date, form_of_payment, castomer, delivery, order_basket)
VALUES ("30/12/2021", "12/04/2022", "cash", 5, 1, 2);
/*requests(simple)*/
SELECT * FROM client_orders;
/**/
SELECT form_of_payment, delivery_date FROM client_orders;
/*sort by castomer*/
SELECT organization, first_name, last_name, e_mail, address, postcode 
FROM castomer
ORDER BY postcode ASC;
/*JOIN*/
SELECT quantity_of_goods, product_code.manufacturer AS product_code
FROM order_basket
JOIN product_code ON order_basket.product_code = product_code.product_code_id;

SELECT order_date, delivery_date, form_of_payment, castomer.address AS castomer,
delivery.last_name AS delivery,
order_basket.quantity_of_goods AS order_basket 
FROM client_orders
JOIN castomer ON client_orders.castomer = castomer.castomer_id
JOIN delivery ON client_orders.delivery = delivery.delivery_id
JOIN order_basket ON client_orders.order_basket = order_basket.order_basket_id;

/*COUNT*/
SELECT product_code.manufacturer AS product_code, COUNT(*)
FROM order_basket
JOIN product_code ON order_basket.product_code = product_code.product_code_id
GROUP BY product_code.manufacturer;

SELECT product_code.manufacturer AS product_code, COUNT(*)
FROM order_basket
JOIN product_code ON order_basket.product_code = product_code.product_code_id
GROUP BY product_code.manufacturer
HAVING COUNT(product_code.manufacturer) > 1;









