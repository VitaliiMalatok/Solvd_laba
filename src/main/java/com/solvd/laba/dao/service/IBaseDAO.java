package com.solvd.laba.dao.service;

public interface IBaseDAO <T>{
        T getEntityById(int id);
        void saveEntity(T entity);
        void updateEntity (T entity);
        void removeEntity (T entity);
}

