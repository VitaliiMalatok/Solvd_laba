USE `mobile_store` ;

/*statements for insertion*/
insert into castomers(organization, first_name, last_name, e_mail, address, postcode)
values ("IDT", "Mark", "Anderson", "idt_anderson@idtsoft.com","UK Lonndon Green str. 54", 220109);
insert into castomers(organization, first_name, last_name, e_mail, address, postcode)
values ("Softeco", "Bob", "Marli", "bob_marli@softeco.com","CH Taibey Yellow str. 2", 115206);
insert into castomers(organization, first_name, last_name, e_mail, address, postcode)
values ("Godel", "Ilon", "Marks", "ilon@godel.com","RUS Sochi Lenina str. 104", 102223);
insert into castomers(organization, first_name, last_name, e_mail, address, postcode)
values ("ItechArt", "Make", "Groch", "make@itechart.com","GR Berlin Red str. 15", 144562);
insert into castomers(organization, first_name, last_name, e_mail, address, postcode)
values ("Wargeiming", "Teo", "Preston", "teo@wargeiming.com","FR Paris Blue str. 544", 632555);
insert into air_deliverys(name_of_airplane, country) values ("Amazon", "USA");
insert into deliverymans(first_name, last_name, age) values ("Filip", "Bondi", 19);
insert into deliverymans(first_name, last_name, age) values ("Mark", "Brown", 18);
insert into deliverymans(first_name, last_name, age) values ("Nency", "Pilosi", 17);
insert into iphones(color, model, price) values("red", "12 pro", 399);
insert into local_deliverys(first_name, last_name, employment_date, work_shift)
values ("Artur", "Smith", "11/04/2017", 1);
insert into local_deliverys(first_name, last_name, employment_date, work_shift)
values ("Bro", "Michel", "09/12/2019", 2);
insert into local_deliverys(first_name, last_name, employment_date, work_shift)
values ("Filip", "Bondi", "15/01/2021", 3);
insert into product_codes(name_of_product, price, manufacturer)
values ("Power Bank", 255, "Maxim Integreted");
insert into product_codes(name_of_product, price, manufacturer)
values ("Solenoid", 2500, "Traco Power");
insert into product_codes(name_of_product, price, manufacturer)
values ("Magnetic switch", 1856, "Texas Instruments");
insert into samsungs(color, model, price) values ("red", "14", 599);
insert into ship_deliverys(name_of_airplane, country) value ("Maersk", "China");
insert into train_deliverys(name_of_train, country) value ("RGD", "RUS");
insert into xiaomi(color, model, price) values ("blue", "11 lite", 299);
insert into international_deliverys(deliverymans_id, train_deliverys_id, air_deliverys_id, ship_deliverys_id)
values (1, 1, 1, 1);
insert into client_orders(order_date, delivery_date, form_of_payment, delivery_id,castomer_id, product_code_id, international_delivery_id)
values ("11/04/2017", "18/04/2015", "cash", 1, 2, 1, 1);
insert into client_orders(order_date, delivery_date, form_of_payment, delivery_id,castomer_id, product_code_id, international_delivery_id)
values ("11/05/2017", "19/04/2007", "cash", 1, 1, 3, 2);
insert into client_orders(order_date, delivery_date, form_of_payment, delivery_id,castomer_id, product_code_id, international_delivery_id)
values ("11/07/2017", "28/04/2007", "cash", 1, 2, 1, 1);

/*statements for insertion*/
update castomers 
set organization = "IDT inc."
where organization = "IDT";

update castomers
set organization = "Softeco corp.",
first_name = "Vitali"
where organization = "Softeco";

update xiaomi
set color = "red",
model = "12 lite",
price = price + 99
where color = "blue";

update air_deliverys
set name_of_airplane = "Vostok service",
country = "RUS"
where name_of_airplane = "Amazon";

update client_orders
set order_date = "22.02.2022",
delivery_date = "22.03.2022",
form_of_payment = "card"
where form_of_payment = "cash";

update deliverymans
set first_name = "Vitali",
last_name = "Molotok",
age = age +10
where age >= 19;

update deliverymans
set first_name = "Polina",
last_name = "Kmit",
age = age + 3
where age = 19;

update iphones
set color = "pink",
model = "13 pro",
price = price + 199
where model = "12 pro";

update local_deliverys
set first_name = "Piter",
last_name = "Parker",
employment_date = "22/02/2022"
where work_shift = 3;

update product_codes
set name_of_product = "NVIDIA",
price = 199,
manufacturer = "TURKEY"
where price = 1856;

/*statements for deletions*/
delete from product_codes
where price > 2499;

delete from local_deliverys
where work_shift = 2;

delete from iphones
where color = "red";

delete from deliverymans
where last_name = "Kmit" and age = 21;

delete from deliverymans
where first_name = "Fili";

delete from client_orders
where order_date = "22.02.2022";

delete from client_orders
where delivery_date = "18/04/2015";

delete from castomers
where organization = "Wargeiming";

delete from castomers
where e_mail = "ilon@godel.com";

delete from air_deliverys
where country = "USA";

/*alter table*/
alter table air_deliverys
add address VARCHAR(50) NULL;

alter table air_deliverys
drop column address;

alter table air_deliverys
add address VARCHAR(50) NULL;

alter table air_deliverys
alter column address set default "CH Taibey Yellow str. 2";

alter table air_deliverys
drop column address;

alter table xiaomi
modify column model varchar(20) NULL;

/*big statement to join all tables in the database*/
select client_orders.order_date, client_orders.delivery_date, client_orders.form_of_payment,
castomers.organization, castomers.address, castomers.e_mail, castomers.first_name, castomers.last_name,
deliverymans.first_name, deliverymans.last_name, deliverymans.age,
product_codes.manufacturer, product_codes.name_of_product, product_codes.price,
international_deliverys.deliverymans_id, international_deliverys.ship_deliverys_id, international_deliverys.train_deliverys_id,
air_deliverys.country, air_deliverys.name_of_airplane,
local_deliverys.first_name, local_deliverys.last_name, local_deliverys.work_shift
from client_orders 
join castomers on castomers.id = client_orders.castomer_id
join deliverymans on deliverymans.id = client_orders.delivery_id
join product_codes on product_codes.id = client_orders.product_code_id
join international_deliverys on international_deliverys.id = client_orders.international_delivery_id
join air_deliverys on air_deliverys.id = client_orders.international_delivery_id
join local_deliverys on local_deliverys.id = client_orders.international_delivery_id;

/*statements with left, right, inner, outer joins*/
select international_deliverys.air_deliverys_id, international_deliverys.deliverymans_id, deliverymans.first_name, deliverymans.last_name, deliverymans.age
from international_deliverys
left join deliverymans on deliverymans.id = international_deliverys.deliverymans_id;

select international_deliverys.air_deliverys_id, international_deliverys.deliverymans_id, deliverymans.first_name, deliverymans.last_name, deliverymans.age
from international_deliverys
right join deliverymans on deliverymans.id = international_deliverys.deliverymans_id;

select international_deliverys.air_deliverys_id, international_deliverys.deliverymans_id, deliverymans.first_name, deliverymans.last_name, deliverymans.age
from international_deliverys
right join deliverymans on deliverymans.id = international_deliverys.deliverymans_id
where international_deliverys.air_deliverys_id is null;

select products.phones_id , product_codes.manufacturer, product_codes.name_of_product, product_codes.price
from products
right join product_codes on product_codes.id = products.product_codes_id
where manufacturer = "TURKEY";

select products.phones_id , product_codes.manufacturer, product_codes.name_of_product, product_codes.price
from products
right join product_codes on product_codes.id = products.product_codes_id
where price = 199;

/*statements with aggregate functions and group by and without having*/
select * from product_codes
where price >= 500;

select organization from castomers;

select distinct organization from castomers;

select * from castomers
where organization in ("Solvd_laba", "Godel");

select * from castomers
where organization not in ("Solvd_laba");

select * from castomers
order by organization;

select e_mail, postcode, address
from castomers
order by postcode desc, e_mail asc;

/*statements with aggregate functions and group by and with having*/
select manufacturer, count(*) as count
from product_codes
group by manufacturer
having count(*) > 1
order by count;

select name_of_product, count(*) as count
from product_codes
group by name_of_product
having count(*) > 1
order by name_of_product;

select name_of_product, count(*) as count
from product_codes
group by name_of_product
having count(*) > 1
order by name_of_product;

select name_of_product, count(*) as count
from product_codes
where price > 100
group by name_of_product
having count(*) > 1
order by name_of_productc desc;

select manufacturer, sum(price) as total
from product_codes
group by manufacturer
having sum(price) > 500
order by total;

select organization, count(*) as count
from castomers
group by organization
having count(*) > 1
order by organization;

select organization, count(*) as count
from castomers
where organization = "Godel"
group by organization
having count(*) > 1
order by organization;


























