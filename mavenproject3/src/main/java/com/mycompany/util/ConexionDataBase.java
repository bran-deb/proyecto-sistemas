
package com.mycompany.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDataBase {

    private static String url = "jdbc:mysql://sql10.freesqldatabase.com:3306/sql10450470?serverTimezone=UTC";
    
    private static String username = "sql10450470";

    private static String password = "y7CwwXv5Nk";
    private static Connection connection;                                         //singleton

    public static  Connection getInstance() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection(url,username,password);
        }
        return connection;
    }
}