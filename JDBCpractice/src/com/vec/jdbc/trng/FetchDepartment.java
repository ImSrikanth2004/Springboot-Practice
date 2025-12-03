package com.vec.jdbc.trng;

import java.sql.*;
import java.util.*;

public class FetchDepartment {

    public void insertDepartment(Department dep) {
        String sql = "INSERT INTO Department_s(dept_id, dept_name) VALUES (?, ?)";
        try (Connection con = ConnectionEst.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setInt(1, dep.id);
            ps.setString(2, dep.name);
            
            
            ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Department> getAllDepartments() {
        List<Department> list = new ArrayList<>();
        String sql = "SELECT * FROM Department_s";
        try (Connection con = ConnectionEst.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                list.add(new Department(
                        rs.getInt("dept_id"),
                        rs.getString("dept_name")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list; 
    }
}
