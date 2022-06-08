package com.solvd.laba.dao.service.impl;

import com.solvd.laba.dao.model.ClientOrder;
import com.solvd.laba.dao.model.DeliveryMan;
import com.solvd.laba.dao.service.IDeliveryManDAO;
import com.solvd.laba.dao.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeliveryManDAOImpl implements IDeliveryManDAO {
    private static final Logger LOGGER = LogManager.getLogger(DeliveryManDAOImpl.class);
    private DeliveryMan deliveryMan = new DeliveryMan();
    private ConnectionPool connectionPool = ConnectionPool.getInstance();
    private Connection connection;
    private PreparedStatement pr = null;
    private ResultSet resultSet = null;

    @Override
    public DeliveryMan getEntityById(int id) {
        return deliveryMan;
    }

    @Override
    public void saveEntity(DeliveryMan entity) {

    }

    @Override
    public void updateEntity(DeliveryMan entity) {

    }

    @Override
    public void removeEntityById(int id) {

    }

    @Override
    public void showAll() {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Select * from deliverymans");
            pr.execute();
            resultSet = pr.getResultSet();
            while (resultSet.next()) {
                deliveryMan.setId(resultSet.getInt("id"));
                deliveryMan.setAge(resultSet.getInt("age"));
                deliveryMan.setFirstName(resultSet.getString("first_name"));
                deliveryMan.setLastName(resultSet.getString("last_name"));
                LOGGER.info(deliveryMan);
            }
        } catch (SQLException e) {
            LOGGER.info(e);
        } finally {
            try {
                if (connection != null) connection.close();
                if (resultSet != null) resultSet.close();
                if (pr != null) pr.close();
            } catch (SQLException e) {
                LOGGER.info(e);
            }
        }
    }
}
