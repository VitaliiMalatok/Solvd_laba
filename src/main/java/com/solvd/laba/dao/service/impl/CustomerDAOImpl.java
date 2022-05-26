package com.solvd.laba.dao.service.impl;


import com.solvd.laba.dao.model.Customer;
import com.solvd.laba.dao.service.ICustomerDAO;
import com.solvd.laba.dao.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class CustomerDAOImpl implements ICustomerDAO {
    private static final Logger LOGGER = LogManager.getLogger(CustomerDAOImpl.class);
    private static final String PATH = "src/main/resources/db.properties";
    private static Properties properties = new Properties();
    private Customer customer = new Customer();
    private ConnectionPool connectionPool = ConnectionPool.getInstance();
    private Connection connection;
    private PreparedStatement pr = null;
    private ResultSet resultSet = null;
    private static String userName;
    private static String url;
    private static String password;

    static {
        try (FileInputStream f = new FileInputStream(PATH)) {
            properties.load(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
        url = properties.getProperty("url");
        userName = properties.getProperty("username");
        password = properties.getProperty("password");
    }

    @Override
    public Customer getEntityById(int id) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Select * from castomers where id=?");
            pr.setInt(1, id);
            pr.execute();
            resultSet = pr.getResultSet();
            while (resultSet.next()) {
                customer.setId(resultSet.getInt("id"));
                customer.setOrganization(resultSet.getString("organization"));
                customer.setFirstName(resultSet.getString("first_name"));
                customer.setLastName(resultSet.getString("last_name"));
                customer.setEmail(resultSet.getString("e_mail"));
                customer.setPostcode(resultSet.getInt("postcode"));
                customer.setAddress(resultSet.getString("address"));
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
        return customer;
    }

    @Override
    public void saveEntity(Customer entity) {
//        try {
//            connection = connectionPool.retrieve();
//            pr = connection.prepareStatement("Insert into cars (manufacture,year) Values (?,?)");
//            pr.setString(1, entity.getManufacture());
//            pr.setInt(2, entity.getYear());
//            pr.executeUpdate();
//        } catch (SQLException e) {
//            LOGGER.info(e);
//        } finally {
//            try {
//                if (connection != null) connectionPool.putback(connection);
//                if (pr != null) pr.close();
//            } catch (SQLException e) {
//                LOGGER.info(e);
//            }
//        }
    }

    @Override
    public void updateEntity(Customer entity) {
//        try {
//            connection = connectionPool.retrieve();
//            pr = connection.prepareStatement("Update cars Set manufacture=?,`year`=? where id=?");
//            pr.setString(1, entity.getManufacture());
//            pr.setInt(2, entity.getYear());
//            pr.setInt(3, entity.getId());
//            pr.executeUpdate();
//        } catch (SQLException e) {
//            LOGGER.info(e);
//        } finally {
//            try {
//                if (connection != null) connectionPool.putback(connection);
//                if (pr != null) pr.close();
//            } catch (SQLException e) {
//                LOGGER.info(e);
//            }
//        }
    }

    @Override
    public void removeEntity(Customer entity) {
//        try {
//            connection = connectionPool.retrieve();
//            pr = connection.prepareStatement("Delete from cars where id=?");
//            pr.setInt(1, entity.getId());
//            pr.executeUpdate();
//        } catch (SQLException e) {
//            LOGGER.info(e);
//        } finally {
//            try {
//                if (connection != null) connectionPool.putback(connection);
//                if (pr != null) pr.close();
//            } catch (SQLException e) {
//                LOGGER.info(e);
//            }
//        }
    }

    @Override
    public void showAll() {
//        try {
//            connection = DriverManager.getConnection(url, userName, password);
//            pr = connection.prepareStatement("Select * from cars");
//            pr.execute();
//            resultSet = pr.getResultSet();
//            while (resultSet.next()) {
//                car.setId(resultSet.getInt("id"));
//                car.setManufacture(resultSet.getString("manufacture"));
//                car.setYear(resultSet.getInt("year"));
//                LOGGER.info(car);
//            }
//        } catch (SQLException e) {
//            LOGGER.info(e);
//        } finally {
//            try {
//                if (connection != null) connection.close();
//                if (resultSet != null) resultSet.close();
//                if (pr != null) pr.close();
//            } catch (SQLException e) {
//                LOGGER.info(e);
//            }
//        }
    }
}
//            while (resultSet.next()) {


