package com.solvd.laba.dao.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

public class ConnectionPool {
    private static final Logger LOGGER = LogManager.getLogger(ConnectionPool.class);
    private static final String PATH = "src/main/resources/db.properties";
    private static final int SIZE = 10;
    private static Properties properties = new Properties();
    private static String url;
    private static String user;
    private static String password;
    private static ConnectionPool instance = null;
    private Vector<Connection> conPool = new Vector<>(SIZE, 0);
    private Vector<Connection> activeConnections = new Stack<>();

    static {
        try (FileInputStream f = new FileInputStream(PATH)) {
            properties.load(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
        url = properties.getProperty("url");
        user = properties.getProperty("username");
        password = properties.getProperty("password");
    }

    private ConnectionPool() {
        for (int i = 0; i < SIZE; i++) {
            Connection connection = null;
            try {
                connection = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                LOGGER.info(e);
            }
            conPool.add(connection);
        }
    }

    public static ConnectionPool getInstance() {
        if (instance == null) instance = new ConnectionPool();
        return instance;
    }


    private Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public synchronized Connection retrieve() {
        Connection newConn = null;
        if (conPool.size() == 0) {
            newConn = getConnection();
        } else {
            newConn = (Connection) conPool.lastElement();
            conPool.removeElement(newConn);
        }
        activeConnections.addElement(newConn);
        LOGGER.info("connection established : " + newConn.toString());
        return newConn;
    }

    public synchronized void putback(Connection c) {
        if (c != null) {
            if (activeConnections.removeElement(c)) {
                conPool.addElement(c);
            } else {
                throw new NullPointerException("сonnection is not active");
            }
        }
    }
}
