package com.vec.training.trng;

public class Student extends Person{
	String course;
    public  Student(String name, String course){
    	  super(name);
    	  this.course = course;
      }
      @Override
       public void greet() {
    	  super.greet();
    	  System.out.println("I am doing "+course);
      }
}
