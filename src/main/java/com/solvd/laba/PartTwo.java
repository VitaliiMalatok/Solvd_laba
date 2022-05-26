package com.solvd.laba;

import com.solvd.laba.dao.service.impl.CustomerDAOImpl;
import com.solvd.laba.dao.service.ICustomerDAO;

public class PartTwo {
    public static void main(String[] args){
        ICustomerDAO customerDAO = new CustomerDAOImpl();
        System.out.println(customerDAO.getEntityById(1));
    }
}
