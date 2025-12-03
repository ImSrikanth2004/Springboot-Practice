package com.vec.training.trng;

public class Lecturer extends Student{
      String college;
      public Lecturer(String name, String course, String college) {
    	  super(name, course);
    	  this.college = college;
      }
      @Override
      public void greet() {
    	  super.greet();
    	  System.out.println("As a lecturer at "+ college);
      }
}
