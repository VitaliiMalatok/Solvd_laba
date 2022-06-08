package com.solvd.laba.dao.service.impl;

import com.solvd.laba.dao.model.AirDelivery;
import com.solvd.laba.dao.service.IAirDeliveryDAO;
import com.solvd.laba.dao.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AirDeliveryDAOImpl implements IAirDeliveryDAO {
    private static final Logger LOGGER = LogManager.getLogger(AirDeliveryDAOImpl.class);
    private AirDelivery airDelivery = new AirDelivery();
    private ConnectionPool connectionPool = ConnectionPool.getInstance();
    private Connection connection;
    private PreparedStatement pr = null;
    private ResultSet resultSet = null;

    @Override
    public void showAll() {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Select * from air_deliverys");
            pr.execute();
            resultSet = pr.getResultSet();
            while (resultSet.next()) {
                airDelivery.setId(resultSet.getInt("id"));
                airDelivery.setCountry(resultSet.getString("country"));
                airDelivery.setNameOfAirplane(resultSet.getString("name_of_airplane"));
                LOGGER.info(airDelivery);
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

    @Override
    public AirDelivery getEntityById(int id) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Select * from air_deliverys where id=?");
            pr.setInt(1, id);
            pr.execute();
            resultSet = pr.getResultSet();
            while (resultSet.next()) {
                airDelivery.setId(resultSet.getInt("id"));
                airDelivery.setCountry(resultSet.getString("country"));
                airDelivery.setNameOfAirplane(resultSet.getString("name_of_airplane"));
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
        return airDelivery;
    }

    @Override
    public void saveEntity(AirDelivery entity) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Insert into air_deliverys (country, name_of_airplane) Values (?,?)");
            pr.setString(1, entity.getCountry());
            pr.setString(2, entity.getNameOfAirplane());
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
    public void updateEntity(AirDelivery entity) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Update air_deliverys Set country=?,name_of_airplane=? where id=?");
            pr.setString(1, entity.getCountry());
            pr.setString(2, entity.getNameOfAirplane());
            pr.setInt(3, entity.getId());
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
            pr = connection.prepareStatement("Delete from air_deliverys where id=?");
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
}
