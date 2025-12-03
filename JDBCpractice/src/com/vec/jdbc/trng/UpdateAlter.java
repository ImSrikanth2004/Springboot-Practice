package com.vec.jdbc.trng;

import java.sql.*;

public class UpdateAlter {

    // Update salary
    public void updateEmployeeSalary(int empId, double newSalary) {
        String sql = "UPDATE Employee_s SET salary = ? WHERE emp_id = ?";
        try (Connection con = ConnectionEst.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setDouble(1, newSalary);
            ps.setInt(2, empId);

            int rows = ps.executeUpdate();
            System.out.println(rows + " row(s) updated!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Add new column
    public void addColumnPhone() {
        String sql = "ALTER TABLE Employee_s ADD phone VARCHAR2(15)";
        try (Connection con = ConnectionEst.getConnection();
             Statement stmt = con.createStatement()) {

            stmt.executeUpdate(sql);
            System.out.println("Column 'phone' added to Employee table!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Modify column
    public void modifyColumnSalary() {
        String sql = "ALTER TABLE Employee_s MODIFY salary NUMBER(12,2)";
        try (Connection con = ConnectionEst.getConnection();
             Statement stmt = con.createStatement()) {

            stmt.executeUpdate(sql);
            System.out.println("Column 'salary' modified!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Drop column
    public void dropColumnPhone() {
        String sql = "ALTER TABLE Employee_s DROP COLUMN phone";
        try (Connection con = ConnectionEst.getConnection();
             Statement stmt = con.createStatement()) {

            stmt.executeUpdate(sql);
            System.out.println("Column 'phone' dropped!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Add unique constraint
    public void addUniqueConstraint() {
        String sql = "ALTER TABLE Employee_s ADD CONSTRAINT emp_name_unique UNIQUE(emp_name)";
        try (Connection con = ConnectionEst.getConnection();
             Statement stmt = con.createStatement()) {

            stmt.executeUpdate(sql);
            System.out.println("Unique constraint added on emp_name!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//        EmployeeTableOps ops = new EmployeeTableOps();
//
//        // Update salary
//        ops.updateEmployeeSalary(2, 75000);
//
//        // Alter table examples
//        ops.addColumnPhone();
//        ops.modifyColumnSalary();
//        ops.dropColumnPhone();
//        ops.addUniqueConstraint();
//    }


