package com.solvd.laba.dao.service.impl;

import com.solvd.laba.dao.model.ClientOrder;
import com.solvd.laba.dao.service.IClientOrderDAO;
import com.solvd.laba.dao.connection.ConnectionPool;
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
    public ClientOrder getEntityById(int id) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Select * from client_orders where id=?");
            pr.setInt(1, id);
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
            }
        } catch (SQLException e) {
            LOGGER.info(e);
        } finally {
            try {
                if (connection != null) connectionPool.putback(connection);
                if (resultSet != null) resultSet.close();
                if (pr != null) pr.close();
            } catch (SQLException e) {
                LOGGER.info(e);
            }
        }
        return clientOrder;
    }

    @Override
    public void saveEntity(ClientOrder entity) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Insert into client_orders (castomer_id, delivery_date, delivery_id, form_of_payment, international_delivery_id, order_date, product_code_id) Values (?,?,?,?,?,?,?)");
            pr.setInt(1, entity.getCustomerId());
            pr.setString(2, entity.getDeliveryDate());
            pr.setInt(3, entity.getDeliveryId());
            pr.setString(4, entity.getFormOfPayment());
            pr.setInt(5, entity.getInternationalDeliveryId());
            pr.setString(6, entity.getOrderDate());
            pr.setInt(7, entity.getProductCodeId());
            pr.executeUpdate();
        } catch (SQLException e) {
            LOGGER.info(e);
        } finally {
            try {
                if (connection != null) connectionPool.putback(connection);
                if (pr != null) pr.close();
            } catch (SQLException e) {
                LOGGER.info(e);
            }
        }
    }

    @Override
    public void updateEntity(ClientOrder entity) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Update client_orders Set castomer_id=?, delivery_date=?, delivery_id=?, form_of_payment=?, international_delivery_id=?, order_date=?, product_code_id=? where id=?");
            pr.setInt(1, entity.getCustomerId());
            pr.setString(2, entity.getDeliveryDate());
            pr.setInt(3, entity.getDeliveryId());
            pr.setString(4, entity.getFormOfPayment());
            pr.setInt(5, entity.getInternationalDeliveryId());
            pr.setString(6, entity.getOrderDate());
            pr.setInt(7, entity.getProductCodeId());
            pr.setInt(8, entity.getId());
            pr.executeUpdate();
        } catch (SQLException e) {
            LOGGER.info(e);
        } finally {
            try {
                if (connection != null) connectionPool.putback(connection);
                if (pr != null) pr.close();
            } catch (SQLException e) {
                LOGGER.info(e);
            }
        }
    }

    @Override
    public void removeEntityById(int id) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Delete from client_orders where id=?");
            pr.setInt(1, id);
            pr.executeUpdate();
        } catch (SQLException e) {
            LOGGER.info(e);
        } finally {
            try {
                if (connection != null) connectionPool.putback(connection);
                if (pr != null) pr.close();
            } catch (SQLException e) {
                LOGGER.info(e);
            }
        }
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
