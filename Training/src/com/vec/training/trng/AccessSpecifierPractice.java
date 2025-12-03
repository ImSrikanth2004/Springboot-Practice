package com.vec.training.trng;

class AccessDemo {
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30; 
    private int privateVar = 40;

    public void showAll() {
        System.out.println("Inside Parent class:");
        System.out.println("Public: " + publicVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Private: " + privateVar);
    }
}

class OtherClass {
    void test() {
        AccessDemo obj = new AccessDemo();
        System.out.println("Inside other class:");
        System.out.println("Public: " + obj.publicVar);
        System.out.println("Protected: " + obj.protectedVar);
        System.out.println("Default: " + obj.defaultVar);     
        // System.out.println("Private: " + obj.privateVar);  
    }
}

public class AccessSpecifierPractice extends AccessDemo {
    public static void main(String[] args) {
        AccessSpecifierPractice mainObj = new AccessSpecifierPractice();
        OtherClass helper = new OtherClass();
        
       
        System.out.println("Inside Main class:");
        System.out.println("Public: " + mainObj.publicVar);
        System.out.println("Protected: " + mainObj.protectedVar); 
        System.out.println("Default: " + mainObj.defaultVar);     
       // System.out.println("Private: " + obj.privateVar);  

   
        helper.test();

        
        mainObj.showAll();
    }
}

