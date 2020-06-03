package com.bmpl.Phoenix.Basic;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		
		System.out.println("Do you want to continue?");
		String userChoice = "yes";
		
//		Scanner scanner =new Scanner(System.in);
//		String userChoice = scanner.next();
		
//		if(userChoice == "yes") System.out.println("Ok, we will continue!!");

		if(userChoice.equalsIgnoreCase("yes") || 
				userChoice.equalsIgnoreCase("y")) {
			System.out.println("Ok, we will continue!!");
			System.out.println("So, what do you want to see now?");
		}
		else if(userChoice.equalsIgnoreCase("no")) System.out.println("Ok, see you soon !!");
		else System.out.println("Didn't understand");
		
		
		String password = "abc1234";
		int otp = 123456;
		
		// nested if-else blocks
		if(password.equals("abc123")) {
			if(otp == 123456) {
				System.out.println("Login successful!!");
			}
			else {
				System.out.println("OTP is invalid!!");
			}
		}
		else {
			System.out.println("Invalid credentials!!");
		}
//		if(password.equals("abc123") && otp == 123456) {
//			System.out.println("Login successful!!");
//		}
		
		
		int a = 20;
		int b = 20;
		
		if(a > b) {
			System.out.println("A is greater than B");
		}
		else if(a == b) {
			System.out.println("A and B are equal");
		}
		else{
			System.out.println("A is smaller than B");
		}
		
		// if block
		// if-else block
		// nested if-else blocks
		// if-else if-else block
		// if-else if block
	}

}






