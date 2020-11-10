/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.utils;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HiGien
 */
public class DBUtils implements Serializable{
    private static final String SERVER_NAME = "DESKTOP-9S60601";
    private static final String DATABASE_NAME = "ShoppingCartOnline";

    public static Connection getConnect() {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionLogEntry = "jdbc:sqlserver://" + SERVER_NAME + ":1433;databaseName=" + DATABASE_NAME;
            String user = "sa";
            String pass = "123456";
            conn = DriverManager.getConnection(connectionLogEntry, user, pass);
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.toString());
        } catch (ClassNotFoundException cE) {
            System.out.println("Class Not Found Exception: " + cE.toString());
        }
        return conn;
    }
}
