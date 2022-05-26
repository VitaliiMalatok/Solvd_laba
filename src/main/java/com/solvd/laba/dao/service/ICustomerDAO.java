package com.solvd.laba.dao.service;

import com.solvd.laba.dao.model.Customer;

public interface ICustomerDAO extends IBaseDAO<Customer> {
    void showAll();
}
