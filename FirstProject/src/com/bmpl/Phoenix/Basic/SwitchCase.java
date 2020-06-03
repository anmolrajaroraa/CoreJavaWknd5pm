package com.bmpl.Phoenix.Basic;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
//		int day = 1; //Monday
		
//		String day = "Monday";
//		
//		switch(day) {
//		case "Monday": 
//			System.out.println("Some motivational message");
//			break;
//		case "Tuesday": 
//			System.out.println("Some light-hearted talks");
//			break;
//		case "Wednesday": 
//			System.out.println("Some real-world facts");
//			break;
//		case "Thursday": 
//			System.out.println("Some joke");
//			break;
//		case "Friday": 
//			System.out.println("Some irony in the humans world");
//			break;
//		case "Saturday": 
//			System.out.println("Some travel-related motivation");
////			break;
//		case "Sunday": 
//			System.out.println("Family-related talks");
//			break;
//		default: System.out.println("Invalid day! Please try to keep the first letter capital");
//		}
		
//		BigInteger bi = BigInteger.valueOf(10);
		Scanner scanner = new Scanner(System.in);
		System.out.println("What do you want to order ?");
		String order = scanner.nextLine();
		
		order.length();
		
		switch(order) {
		case "burger":
			System.out.println("Here's your burger");
		case "soft drink":
			System.out.println("Do you want soft drink?");
			String choice = scanner.next();
			if(choice.equals("yes")) {
				System.out.println("Here's your soft drink...");
			}
			else {
				System.out.println("Thanku for your order...Please wait 5 mins...");
				break;
			}
		case "fries":
			System.out.println("Do you want to take meal instead, you will get fries for just 5Rs. extra");
			choice = scanner.next();
			if(choice.equals("yes")) {
				System.out.println("Here's your economeal...");
			}
			else {
				System.out.println("Thanku for your order...Please wait 5 mins...");
				break;
			}
			break;
		case "ice cream":
			System.out.println("Here's your ice cream");
			break;
		default:
			System.out.println("Sorry, we dont serve that yet..");
		}
		
		scanner.close();

	}

}
