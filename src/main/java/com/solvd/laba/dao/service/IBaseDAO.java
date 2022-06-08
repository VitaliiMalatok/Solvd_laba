package com.solvd.laba.dao.service;

import com.solvd.laba.dao.model.ClientOrder;

public interface IBaseDAO <T>{
        T getEntityById(int id);
        void saveEntity(T entity);
        void updateEntity (T entity);
        void removeEntityById(int id);
}

