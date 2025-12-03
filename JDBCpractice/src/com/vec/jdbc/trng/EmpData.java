package com.vec.jdbc.trng;

abstract class Person {
    protected int id;
    protected String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void displayInfo();
}

class Employee extends Person {
    private double salary;
    private int deptId;

    public Employee(int id, String name, double salary, int deptId) {
        super(id, name);
        this.salary = salary;
        this.deptId = deptId;
    }

    @Override
    public void displayInfo() {
        System.out.println("Employee ID: " + id + ", Name: " + name +
                           ", Salary: " + salary + ", Dept: " + deptId);
    }

    public double getSalary() { return salary; }
    public int getDeptId() { return deptId; }
}

