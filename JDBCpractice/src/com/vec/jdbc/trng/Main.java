package com.vec.jdbc.trng;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create Tables
        TableCreation.createTables();

        // Step 2: Insert Sample Data
        FetchDepartment fdo = new FetchDepartment();
        fdo.insertDepartment(new Department(101, "HR"));
        fdo.insertDepartment(new Department(102, "IT"));
        fdo.insertDepartment(new Department(103, "Infrastructure"));
        fdo.insertDepartment(new Department(104, "Accounting"));
        
        
        FetchEmployee dao = new FetchEmployee();
        dao.insertEmployee(new Employee(1, "Alice", 50000, 101));
        dao.insertEmployee(new Employee(2, "Bob", 60000, 102));
        dao.insertEmployee(new Employee(3, "Charlie", 55000, 101));
        dao.insertEmployee(new Employee(4, "David", 70000, 103));

        // Step 3: Fetch Data
        List<Department> departments = fdo.getAllDepartments();
        List<Employee> employees = dao.getAllEmployees();

        // Step 4: Display all employees
        employees.forEach(Employee::displayInfo);
        departments.forEach(Department::displayInfo);
        // Step 5: Streams Examples
        employees.stream()
                 .max(Comparator.comparing(Employee::getSalary))
                 .ifPresent(e -> System.out.println("Highest Paid: " + e.name));

        Map<Integer, List<Employee>> groupByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDeptId));
        groupByDept.forEach((dept, empList) ->
                System.out.println("Dept " + dept + ": " + empList.size() + " employees"));

        Map<Integer, Double> avgSalary = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDeptId,
                        Collectors.averagingDouble(Employee::getSalary)
                ));
        System.out.println("Average Salary per Dept: " + avgSalary);
    }
}

