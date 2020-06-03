package com.bmpl.Phoenix.Basic;

import java.util.Scanner;

public class ArrayDemoString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of array");
		
		int size = scanner.nextInt();
		
		String arr[] = new String[size];
		
		for(int i = 0; i < size; i++) {
			
			System.out.println("Enter element for " + i + " index");
			
			String value = scanner.next();
			
			arr[i] = value;
			
		}
		
		for(String element : arr) {
			System.out.print(element + " ");
		}
		
		scanner.close();
		
	}
	
	// n -> 5
	
//	2 * n(n-1)
	
//	2 * 5 * 4  +  2 * 4 * 3  +  2 * 3 * 2  +  2 * 2 * 1

}
