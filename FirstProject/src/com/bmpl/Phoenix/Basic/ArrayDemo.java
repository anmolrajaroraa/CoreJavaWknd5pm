package com.bmpl.Phoenix.Basic;

public class ArrayDemo {

	public static void main(String[] args) {
		
		// array is a fixed size collection of same type of elements
		// array is an object of some internal class
		// we get only two properties out of class that is length property
		// and clone fn
		// array is a contiguous allocation of memory
		
		int arr[];
		int []arr2;
		int[] arr3 = { 1, 2, 3, 4, 5 };
		System.out.println(arr3.length);
		
		String s = "hello";
		System.out.println( s );
		
		System.out.println( arr3 );
		
		// traditional for loop
		for(int i = 0; i < arr3.length; i+=2) {
			System.out.println( arr3[i] );
			arr3[i]++;
		}
		
//		int element = arr3[5];
		
		System.out.println("****************");
		
		//enhanced for loop
		for(int element : arr3) {
			System.out.println(element);
		}
		
		int sum = 0;
		
		for(int element : arr3) {
//			sum = sum + element;
			sum += element;
			element++;
		}
		
		System.out.println("Sum is " + sum);
		
		for(int element : arr3) {
			System.out.println(element);
		}
			
	}

}
