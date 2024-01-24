package com.wecp.progressive.config;

<<<<<<< HEAD
public class DatabaseConnectionManager {
=======
import java.sql.*;
import java.io.*;
import java.util.*;
public class DatabaseConnectionManager {
    private static final Properties properties = new Properties();

    static{
        loadProperties();
    }

    private static void loadProperties(){
        try (InputStream input = DatabaseConnectionManager.class.getClassLoader().getResourceAsStream("application.properties")) {
            if(input == null){
                throw new IllegalStateException("resource.properties not found in classpath");
            }
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Error loading properties file", e);
        }
    }

    public static Connection getConnection() throws SQLException {
        String url = properties.getProperty("spring.datasource.url");
        String user = properties.getProperty("spring.datasource.username");
        String password = properties.getProperty("spring.datasource.password");

        return DriverManager.getConnection(url, user, password);
    }
>>>>>>> 425cf6c3dd05ee760d5b51005e99e955c0d54ff9

}
