package com.bmpl.Phoenix.Basic;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
//		for(int i = 0; i < 10000; i++) {
//			for(int j = 0;j < 10000; j++) {
//				int sum = i + j;
////				System.out.println(sum);
//			}
//		}
//		
//		System.out.println("Loops finished");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("please enter some message!!");
		
//		String message = scanner.next();
//		System.out.println("Message is " + message);
//
//		message = scanner.next();
//		System.out.println("Message is " + message);
//		
//		message = scanner.next();
//		System.out.println("Message is " + message);

		String message = scanner.nextLine();
		System.out.println("Message is " + message);
	
//		message = scanner.next();
//		int number = Integer.parseInt(scanner.next());
		int number = scanner.nextInt();
		System.out.println("Number is " + number);
	
		scanner.close();
	}

}

//buffer (scanner)

//yes please continue

//scanner.next();
