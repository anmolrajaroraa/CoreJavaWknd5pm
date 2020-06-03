package com.bmpl.Phoenix.Basic;

import java.util.Scanner;

public class ScannerDemo3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter names of the students participating in the competition : ");
		
//		boolean dataExists = scanner.hasNextLine();
//		
//		System.out.println("Data Exists - " + dataExists);
		
		while(scanner.hasNextLine()) {
			
			String name = scanner.nextLine();
			
			System.out.println("Student's name is - " + name);
			
		}

		scanner.close();
	}

}
