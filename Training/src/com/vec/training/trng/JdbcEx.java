package com.vec.training.trng;


import java.sql.*;


public class JdbcEx {
   public static void main(String[] args) {
	   try {
           // 1. Load the driver
           Class.forName("oracle.jdbc.driver.OracleDriver");
           String dbURL = "jdbc:oracle:thin:@ 150.136.134.100:1521/pdb";
           String username = "metricstream";
           String password = "password";
           // 2. Establish connection (DB URL, username, password)
           Connection con = DriverManager.getConnection(dbURL, username, password);
        		   
           // 3. Creating Statements 
           Statement stmt = con.createStatement();
        
           // 4. Execute query
           ResultSet rs = stmt.executeQuery("SELECT * FROM MS_FFF_ISSUES");

           // 5. Process results
           
           while (rs.next()) {
               System.out.println(rs.getString("ISSUE_ID") + " " + rs.getString("ISSUE_TITLE"));
           }

           // 6. Close connection
           con.close();

       } catch (Exception e) {
           e.printStackTrace();
       }
   }
}
