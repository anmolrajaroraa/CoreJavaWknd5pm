package com.bmpl.Phoenix.Basic;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		
//		for(initialize iterator; condition for iterator; increment expression) {}
			
//		for(int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
//		
//		for(int i = 0; i < 10; ++i) {
//			System.out.println(i);
//		}
//		
//		for(int i = 0; i < 10; i = i + 1) {
//			System.out.println(i);
//		}
//		
//		for(int i = 0; i < 10; i = i + 2) {
//			System.out.println(i);
//		}
		
//		int i;
//		for(i = 0; i < 10; i+=2) {
//			System.out.println(i);
//		}
		
//		int i = 0;
//		for(; i < 10; i+=2) {
//			System.out.println(i);
//		}
		
		// infinite loop
//		int i = 0;
//		for(; ; i+=2) {
//			System.out.println(i);
//		}
		
//		int i = 0;
//		for(; ; i+=2) {
//			System.out.println(i);
//			if(i >= 10) break;
//		}
		
//		int i = 0;
//		for(;;) {
//			System.out.println(i);
//			if(i >= 10) break;
//			i += 2;
//		}
//		
//		System.out.println(i);
		
		Scanner scanner = new Scanner(System.in);
		String userInput = "scissors";
		
//		while(true) {
//			System.out.println("Enter your choice : ");
//			userInput = scanner.next();
//			if(userInput.equals("scissors") || userInput.equals("paper") || 
//					userInput.equals("stone") ) {
//				break;
//			}
//		}
//		
//		System.out.println("User input is " + userInput);
//		
//		scanner.close();
		
		// entry controlled loop
		// for, while
		
		// exit controlled loop
		// do-while
		
		do {
			System.out.println("Enter your choice : ");
			userInput = scanner.next();
		}while(  !userInput.equals("scissors") );
		
		// userinput = "scissors"
		// userinput = "scisors"
		// while(  true )
		// userinput = "scissors"
		// while(  false )

		System.out.println("User input is " + userInput);
		
	}

}
