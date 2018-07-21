package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Author: Afif Al Mamun
 * Written on: 7/22/2018
 * Project: TeslaRentalInventory
 **/
public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/teslarentalinventory?autoReconnect=yes&useSSL=no";
    public static Connection getConnection() {
        Connection con;
        try {
            con = DriverManager.getConnection(URL, "root", "3267");
        } catch (SQLException e) {
            if (e.getErrorCode() == 0) { //Error Code 0: database server offline
                new sample.Dialog("Error!", "Database server is offline!");

            }
            return null;
        }
        return con;
    }
}
