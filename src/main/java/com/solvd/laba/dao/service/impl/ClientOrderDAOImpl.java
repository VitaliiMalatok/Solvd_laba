package com.solvd.laba.dao.service.impl;

import com.solvd.laba.dao.model.AirDelivery;
import com.solvd.laba.dao.model.ClientOrder;
import com.solvd.laba.dao.model.Customer;
import com.solvd.laba.dao.service.IClientOrderDAO;
import com.solvd.laba.dao.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientOrderDAOImpl implements IClientOrderDAO {
    private static final Logger LOGGER = LogManager.getLogger(ClientOrderDAOImpl.class);
    private ClientOrder clientOrder = new ClientOrder();
    private ConnectionPool connectionPool = ConnectionPool.getInstance();
    private Connection connection;
    private PreparedStatement pr = null;
    private ResultSet resultSet = null;
    @Override
    public Customer getEntityById(int id) {
        return null;
    }

    @Override
    public void saveEntity(Customer entity) {

    }

    @Override
    public void updateEntity(Customer entity) {

    }

    @Override
    public void removeEntityById(int id) {

    }

    @Override
    public void showAll() {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Select * from client_orders");
            pr.execute();
            resultSet = pr.getResultSet();
            while (resultSet.next()) {
                clientOrder.setId(resultSet.getInt("id"));
                clientOrder.setCustomerId(resultSet.getInt("castomer_id"));
                clientOrder.setDeliveryDate(resultSet.getString("delivery_date"));
                clientOrder.setDeliveryId(resultSet.getInt("delivery_id"));
                clientOrder.setFormOfPayment(resultSet.getString("form_of_payment"));
                clientOrder.setInternationalDeliveryId(resultSet.getInt("international_delivery_id"));
                clientOrder.setOrderDate(resultSet.getString("order_date"));
                clientOrder.setProductCodeId(resultSet.getInt("product_code_id"));
                LOGGER.info(clientOrder);
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
