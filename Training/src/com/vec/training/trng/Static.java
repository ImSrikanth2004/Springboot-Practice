package com.vec.training.trng;

import java.util.Scanner;

public class Static{
	static {
		System.out.println("Static Block ---First executable");
	}
	public static void main(String[] args) {
		System.out.println("Main Block");
		Scanner sc = new Scanner(System.in);
		try{
            
			int n = sc.nextInt();
			int a = sc.nextInt();
			int res = a/n;
			System.out.println("The result is="+" "+res);
		}
		catch(ArithmeticException ae){
            System.out.println("Division by zero");
		}
		finally{
			System.out.println("Finally Block ---Last executable");
			sc.close();
		}
}
}