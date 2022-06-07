package com.solvd.laba;

import com.solvd.laba.dao.model.Customer;
import com.solvd.laba.dao.service.*;
import com.solvd.laba.dao.service.impl.*;

public class PartTwo {
    public static void main(String[] args) {
//        ICustomerDAO customerDAO = new CustomerDAOImpl();
//        Customer customer = new Customer("Solvd", "Vitali", "Molotok", "molotok.vitali@gmail.com", 210514, "BY Minsk Krasina str. 24");
//        Customer customer1 = new Customer("Solvd_laba", "Palina", "Kmit", "polina@gmail.com", 220130, "BY Minsk Radialinaia str. 63");
//        customerDAO.saveEntity(customer);
//        customerDAO.removeEntityById(8);
//        customer1.setId(1);
//        customerDAO.updateEntity(customer1);
//        System.out.println(customerDAO.getEntityById(1));
//        customerDAO.showAll();
        IAirDeliveryDAO iAirDeliveryDAO = new AirDeliveryDAOImpl();
        iAirDeliveryDAO.showAll();
        IClientOrderDAO iClientOrderDAO = new ClientOrderDAOImpl();
        iClientOrderDAO.showAll();
        IDeliveryManDAO iDeliveryManDAO = new DeliveryManDAOImpl();
        iDeliveryManDAO.showAll();
        IInternationalDeliveryDAO iInternationalDeliveryDAO = new InternationalDeliveryDAOImpl();
        iInternationalDeliveryDAO.showAll();    }
}
