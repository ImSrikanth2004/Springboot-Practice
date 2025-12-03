package com.vec.training.trng;

public class Engineer extends Student{
       String position;
       public Engineer(String name, String course, String position) {
    	   super(name, course);
    	   this.position = position;
       }
       @Override
       public void greet() {
    	   super.greet();
    	   System.out.println("As " + position);
       }
}
