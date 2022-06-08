package com.solvd.laba;

import com.solvd.laba.dao.model.AirDelivery;
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
//        IAirDeliveryDAO iAirDeliveryDAO = new AirDeliveryDAOImpl();
//        iAirDeliveryDAO.showAll();
//        System.out.println(iAirDeliveryDAO.getEntityById(13));
//        AirDelivery airDelivery1 = new AirDelivery("GB", "AirBus");
//        AirDelivery airDelivery2 = new AirDelivery("GB update", "AirBus update");
//        iAirDeliveryDAO.saveEntity(airDelivery1);
//        System.out.println(iAirDeliveryDAO.getEntityById(14));
//        airDelivery2.setId(14);
//        iAirDeliveryDAO.updateEntity(airDelivery2);
//        System.out.println(iAirDeliveryDAO.getEntityById(14));
//        iAirDeliveryDAO.removeEntityById(15);



        IClientOrderDAO iClientOrderDAO = new ClientOrderDAOImpl();
//        iClientOrderDAO.showAll();
        System.out.println(iClientOrderDAO.getEntityById(33));

//        IDeliveryManDAO iDeliveryManDAO = new DeliveryManDAOImpl();
//        iDeliveryManDAO.showAll();
//        IInternationalDeliveryDAO iInternationalDeliveryDAO = new InternationalDeliveryDAOImpl();
//        iInternationalDeliveryDAO.showAll();
    }
}
