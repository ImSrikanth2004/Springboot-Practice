package com.vec.jdbc.trng;

import java.sql.*;

public class TableCreation {
	  public static void createTables() {
	        String deptTable = "CREATE TABLE Department_s (" +
	                "dept_id NUMBER PRIMARY KEY, " +
	                "dept_name VARCHAR2(50))";

	        String empTable = "CREATE TABLE Employee_s (" +
	                "emp_id NUMBER PRIMARY KEY, " +
	                "emp_name VARCHAR2(50), " +
	                "salary NUMBER, " +
	                "dept_id NUMBER, " +
	                "FOREIGN KEY (dept_id) REFERENCES Department_s(dept_id))";

	        try (Connection con = ConnectionEst.getConnection();
	             Statement stmt = con.createStatement()) {

	            stmt.executeUpdate(deptTable);
	            stmt.executeUpdate(empTable);
	            System.out.println("Tables created successfully!");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
