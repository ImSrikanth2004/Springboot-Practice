package com.vec.training.trng;
class Immutable{
	void Merge() {
		String s1 ="Data";
		String s2 ="Base";
		s1 = s1+s2;
		s2 = s2.concat(s1);
		System.out.println(s1);
	}
}
public class StringsPractice {
       public static void main(String[] args) {
    	   Immutable i= new Immutable();
    	   i.Merge();
    	   String s1 = "Gun", s2="tur";
    	   String s3 =s1.concat(s2);
    	   System.out.println("Concatenated: "+ s3);
    	   System.out.println("CharAt: 2 with uppercase"+ s1.toUpperCase().charAt(2));
    	   String s4 = "Hi, Good Morning!";
    	   System.out.println(s4.substring(0,7));
    	   System.out.println("The string is "+s4+" is "+s4.length()+" characters long");
    	   System.out.println(s1.equals(s3.substring(0,3)));
       }
}