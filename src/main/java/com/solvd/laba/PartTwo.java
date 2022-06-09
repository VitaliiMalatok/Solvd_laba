package com.solvd.laba;

import com.solvd.laba.dao.model.AirDelivery;
import com.solvd.laba.dao.model.ClientOrder;
import com.solvd.laba.dao.model.Customer;
import com.solvd.laba.dao.model.DeliveryMan;
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

//        IClientOrderDAO iClientOrderDAO = new ClientOrderDAOImpl();
//        iClientOrderDAO.showAll();
//        System.out.println(iClientOrderDAO.getEntityById(33));
//
//        ClientOrder clientOrder1 = new ClientOrder(1, "11/11/2011", 1, "card", 1, "12/12/2012", 1);
//        ClientOrder clientOrder2 = new ClientOrder(1, "11/11/2011 update", 1, "card update", 1, "12/12/2012 update", 1);
//        iClientOrderDAO.saveEntity(clientOrder1);
//        System.out.println(iClientOrderDAO.getEntityById(35));
//        clientOrder2.setId(35);
//        iClientOrderDAO.updateEntity(clientOrder2);
//        System.out.println(iClientOrderDAO.getEntityById(35));



        IDeliveryManDAO iDeliveryManDAO = new DeliveryManDAOImpl();
//        iDeliveryManDAO.showAll();
        System.out.println(iDeliveryManDAO.getEntityById(30));
        DeliveryMan deliveryMan1 = new DeliveryMan(1,"Pavel", "Black");
        DeliveryMan deliveryMan2 = new DeliveryMan(1,"Pavel update", "Black update");
        iDeliveryManDAO.saveEntity(deliveryMan1);
        deliveryMan2.setId(31);
        iDeliveryManDAO.updateEntity(deliveryMan2);
        System.out.println(iDeliveryManDAO.getEntityById(31));
//        IInternationalDeliveryDAO iInternationalDeliveryDAO = new InternationalDeliveryDAOImpl();
//        iInternationalDeliveryDAO.showAll();
    }
}
