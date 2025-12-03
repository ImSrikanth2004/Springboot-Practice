package com.vec.stdanl.trng;

//Student.java
public class Student extends Person {
 private int studentId;
 private String department;

 public Student(int studentId, String name, int age, String department) {
     super(name, age);
     this.studentId = studentId;
     this.department = department;
 }

 public int getStudentId() { return studentId; }
 public String getDepartment() { return department; }

 @Override
 public String toString() {
     return "Student[ID=" + studentId + ", " + super.toString() + ", Dept=" + department + "]";
 }
}
