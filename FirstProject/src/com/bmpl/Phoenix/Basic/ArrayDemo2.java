package com.bmpl.Phoenix.Basic;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of array");
		
		int size = scanner.nextInt();
		
		int arr[] = new int[size];
		
		for(int i = 0; i < size; i++) {
			
			System.out.println("Enter element for " + i + " index");
			
			int value = scanner.nextInt();
			
			arr[i] = value;
			
		}
		
//		scanner.nextLine();
//		
//		String name = scanner.nextLine();
		
		for(int element : arr) {
			System.out.print(element + " ");
		}
		
		scanner.close();
		
	}

}
