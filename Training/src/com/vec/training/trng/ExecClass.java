package com.vec.training.trng;

public class ExecClass{
     public static void main(String[] args) {
    	 Greetings person = new Person("Srikanth");
    	 person.greet();  
    	 System.out.println("------------------------------------------------");
    	 Greetings student = new Student("Srikanth", "Bsc");
    	 student.greet(); 
    	 System.out.println("------------------------------------------------");
    	 Greetings lecturer = new Lecturer("Suneetha", "Java", "Vignan");
    	 lecturer.greet(); 
    	 System.out.println("------------------------------------------------");
    	 Greetings engineer = new Engineer("Srikanth", "Java", "intern");
    	 engineer.greet(); 
    	 System.out.println("------------------------------------------------");
     } 
}
