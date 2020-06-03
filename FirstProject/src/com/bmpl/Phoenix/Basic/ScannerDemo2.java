package com.bmpl.Phoenix.Basic;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please fill out the details : ");
		
		int en_no = scanner.nextInt();
		
		System.out.println("Student's enrollment no is - " + en_no);
		
		scanner.nextLine(); // to consume the extra \n that is left out of the scanner
		
		String name = scanner.nextLine();
		
		System.out.println("Student's name is - " + name);
		
		String courseName = scanner.nextLine();
		
		System.out.println("Student is enrolled in - " + courseName);
		
		int courseDuration = 0;
		
		if(scanner.hasNextInt()) {
			courseDuration = scanner.nextInt();
		}
		else {
			System.out.println("Number was not found....");
		}
		
		System.out.println("Course duration is - " + courseDuration);
		
		scanner.close();

	}
	
	// 101\n
	// en_no = 101
	// name = Ram Kumar

}
