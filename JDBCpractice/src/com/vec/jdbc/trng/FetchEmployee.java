package com.vec.jdbc.trng;
import java.sql.*;
import java.util.*;
public class FetchEmployee {
	public void insertEmployee(Employee emp) {
        String sql = "INSERT INTO Employee_s(emp_id, emp_name, salary, dept_id) VALUES (?, ?, ?, ?)";
        try (Connection con = ConnectionEst.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, emp.id);
            ps.setString(2, emp.name);
            ps.setDouble(3, emp.getSalary());
            ps.setInt(4, emp.getDeptId());
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public List<Employee> getAllEmployees() {
        List<Employee> list = new ArrayList<>();
        String sql = "SELECT * FROM Employee_s";
        try (Connection con = ConnectionEst.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                list.add(new Employee(
                        rs.getInt("emp_id"),
                        rs.getString("emp_name"),
                        rs.getDouble("salary"),
                        rs.getInt("dept_id")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
