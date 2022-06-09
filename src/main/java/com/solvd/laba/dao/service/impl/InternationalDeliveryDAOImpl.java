package com.solvd.laba.dao.service.impl;

import com.solvd.laba.dao.model.ClientOrder;
import com.solvd.laba.dao.model.InternationalDelivery;
import com.solvd.laba.dao.service.IInternationalDeliveryDAO;
import com.solvd.laba.dao.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InternationalDeliveryDAOImpl implements IInternationalDeliveryDAO {
    private static final Logger LOGGER = LogManager.getLogger(InternationalDeliveryDAOImpl.class);
    private InternationalDelivery internationalDelivery = new InternationalDelivery();
    private ConnectionPool connectionPool = ConnectionPool.getInstance();
    private Connection connection;
    private PreparedStatement pr = null;
    private ResultSet resultSet = null;

    @Override
    public InternationalDelivery getEntityById(int id) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Select * from international_deliverys where id=?");
            pr.setInt(1, id);
            pr.execute();
            resultSet = pr.getResultSet();
            while (resultSet.next()) {
                internationalDelivery.setId(resultSet.getInt("id"));
                internationalDelivery.setAirDeliveryId(resultSet.getInt("air_deliverys_id"));
                internationalDelivery.setDeliverymanId(resultSet.getInt("deliverymans_id"));
                internationalDelivery.setShipDeliveryId(resultSet.getInt("ship_deliverys_id"));
                internationalDelivery.setTrainDeliveryId(resultSet.getInt("train_deliverys_id"));
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
        return internationalDelivery;
    }

    @Override
    public void saveEntity(InternationalDelivery entity) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Insert into international_deliverys (air_deliverys_id, deliverymans_id, ship_deliverys_id, train_deliverys_id) Values (?,?,?,?)");
            pr.setInt(1, entity.getAirDeliveryId());
            pr.setInt(2, entity.getDeliverymanId());
            pr.setInt(3, entity.getShipDeliveryId());
            pr.setInt(4, entity.getTrainDeliveryId());
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
    public void updateEntity(InternationalDelivery entity) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Update international_deliverys Set air_deliverys_id=?, deliverymans_id=?, ship_deliverys_id=?, train_deliverys_id=? where id=?");
            pr.setInt(1, entity.getAirDeliveryId());
            pr.setInt(2, entity.getDeliverymanId());
            pr.setInt(3, entity.getShipDeliveryId());
            pr.setInt(4, entity.getTrainDeliveryId());
            pr.setInt(5, entity.getId());
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
            pr = connection.prepareStatement("Delete from international_deliverys where id=?");
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
            pr = connection.prepareStatement("Select * from international_deliverys");
            pr.execute();
            resultSet = pr.getResultSet();
            while (resultSet.next()) {
                internationalDelivery.setId(resultSet.getInt("id"));
                internationalDelivery.setAirDeliveryId(resultSet.getInt("air_deliverys_id"));
                internationalDelivery.setDeliverymanId(resultSet.getInt("deliverymans_id"));
                internationalDelivery.setShipDeliveryId(resultSet.getInt("ship_deliverys_id"));
                internationalDelivery.setTrainDeliveryId(resultSet.getInt("train_deliverys_id"));
                LOGGER.info(internationalDelivery);
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
