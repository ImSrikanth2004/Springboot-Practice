package com.vec.training.trng;

public class Person implements Greetings{
	 String name;
     public Person(String name) {
    	 this.name = name;
     }
     @Override
     public void greet() {
    	 System.out.println("Hi! my name is: " + name);
     }
}
