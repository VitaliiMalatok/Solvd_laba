package com.solvd.laba.dao.service;

import com.solvd.laba.dao.model.ClientOrder;
import com.solvd.laba.dao.model.Customer;

public interface IClientOrderDAO extends IBaseDAO<ClientOrder> {
    void showAll();
}
