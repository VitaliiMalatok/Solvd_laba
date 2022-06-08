package com.solvd.laba.dao.service.impl;


import com.solvd.laba.dao.model.ClientOrder;
import com.solvd.laba.dao.model.Customer;
import com.solvd.laba.dao.service.ICustomerDAO;
import com.solvd.laba.dao.utils.ConnectionPool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;

public class CustomerDAOImpl implements ICustomerDAO {
    private static final Logger LOGGER = LogManager.getLogger(CustomerDAOImpl.class);
    private Customer customer = new Customer();
    private ConnectionPool connectionPool = ConnectionPool.getInstance();
    private Connection connection;
    private PreparedStatement pr = null;
    private ResultSet resultSet = null;

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
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Insert into castomers (organization,first_name,last_name,e_mail,postcode,address) Values (?,?,?,?,?,?)");
            pr.setString(1, entity.getOrganization());
            pr.setString(2, entity.getFirstName());
            pr.setString(3, entity.getLastName());
            pr.setString(4, entity.getEmail());
            pr.setInt(5, entity.getPostcode());
            pr.setString(6, entity.getAddress());
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
    public void updateEntity(Customer entity) {
        try {
            connection = connectionPool.retrieve();
            pr = connection.prepareStatement("Update castomers Set organization=?,first_name=?,last_name=?,e_mail=?,postcode=?,address=? where id=?");
            pr.setString(1, entity.getOrganization());
            pr.setString(2, entity.getFirstName());
            pr.setString(3, entity.getLastName());
            pr.setString(4, entity.getEmail());
            pr.setInt(5, entity.getPostcode());
            pr.setString(6, entity.getAddress());
            pr.setInt(7, entity.getId());
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
            pr = connection.prepareStatement("Delete from castomers where id=?");
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
            pr = connection.prepareStatement("Select * from castomers");
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
                LOGGER.info(customer);
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



