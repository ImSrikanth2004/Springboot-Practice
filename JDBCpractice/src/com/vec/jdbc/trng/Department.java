package com.vec.jdbc.trng;

public class Department {
    int id;
    String name;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Optional: for debugging/printing
    @Override
    public String toString() {
        return "Department{id=" + id + ", name='" + name + "'}";
    }
    
    public void displayInfo() {
        System.out.println("DeptId: " + id + ", DeptName: " + name);
    }

}
