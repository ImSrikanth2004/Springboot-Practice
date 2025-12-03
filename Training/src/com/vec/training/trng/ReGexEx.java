package com.vec.training.trng;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class ReGexEx {
	public void names() {
        Pattern pattern = Pattern.compile("SrIKaNtH", Pattern.CASE_INSENSITIVE);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name:");
        String userInput = input.nextLine(); 

        Matcher matcher = pattern.matcher(userInput);

        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }

        input.close(); 
	}
	public void emails() {
		Pattern p = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
		System.out.println("Enter your email:");
		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine();
		Matcher m = p.matcher(userInput);
		System.out.println(m.matches()); 
        input.close();
	}
	public void phoneNumber() {
		Pattern p = Pattern.compile("^(\\+91)?[6-9][0-9]{9}$");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your mobile number:");
		String userInput = input.nextLine();
		Matcher m = p.matcher(userInput);
		System.out.println(m.matches()); 
        input.close();
	}
	public void passwords() {
		Pattern p = Pattern.compile("^(?=.*[A-Z])(?=.*\\d).{8,}$");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your password:");
        String userInput = input.nextLine();
		Matcher m = p.matcher(userInput);
		System.out.println(m.matches());
        input.close();
	}
    public static void main(String[] args) {

    }
}
