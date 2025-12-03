package com.vec.jdbc.trng;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionEst {
    public static Connection getConnection() throws Exception {
        String url = "jdbc:oracle:thin:@//150.136.134.100:1521/pdb"; // use service name
        String user = "fresher";
        String pass = "Vecmaster";

        Class.forName("oracle.jdbc.driver.OracleDriver"); // optional in newer JDBC
        return DriverManager.getConnection(url, user, pass);
    }
}
