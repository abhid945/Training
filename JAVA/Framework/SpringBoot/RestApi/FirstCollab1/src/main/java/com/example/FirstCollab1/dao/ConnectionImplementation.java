package com.example.FirstCollab1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionImplementation {
    static Connection connection=null;
    private ConnectionImplementation(){}

public static Connection getConnection() {
        if(connection ==null){

            try {
                Class.forName(ConnectionDetails.DRIVER);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            try {
                connection = DriverManager.getConnection(ConnectionDetails.URL,ConnectionDetails.USERNAME,ConnectionDetails.PASSWORD);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
        return connection;
}

}


