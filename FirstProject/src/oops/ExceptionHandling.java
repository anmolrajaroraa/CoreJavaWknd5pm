package oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) throws IOException {
		
//		try-catch block, try-catch-finally,  try-finally, try-with-resources
		
		// try block is like a stage for the code that can generate some exception when
		//  the code is executed. If exception occurs, we should have some exception handler
		// to salvage the situation. When some exception occurs, an object of Exception class
		// or some subclass of Exception is created, so we need to catch it and provide some
		//  way of managing the exception and allow the program to continue without stopping abruptly
//		Scanner scanner = new Scanner(System.in);
		
//		try {
//			
//			int number = scanner.nextInt();
//			
//			int number2 = scanner.nextInt();
//			
//			System.out.println(number / number2);
//			
//			System.out.println("number is " + number);
//			
//			byte b =   (byte) number;
//			
//			int arr[] = new int[5];
////		
//			System.out.println( arr[100] );
//			
////			scanner.close();
//		}
//		catch(InputMismatchException e) {
//			System.out.println("Please enter only integers");
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Please do not use 0 as second number");
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Please use only legal indexes for the array");
//		}
//		catch(Exception e) {
//			System.out.println("Catch block received exception... Something unusual happened");
////			e.printStackTrace();
//		}
//		finally {
//			//cleanup code
//			System.out.println("Thanku for visiting us!!");
//			scanner.close();
//		}
//		
////		scanner.close();
//		
//		System.out.println("Program continues even after exception occured...");
//		
		
//		try {
//			int i = 8 / 0;
//		}
//		catch(Exception e) {
//			System.out.println("Exception!!!");
//		}
		
		
		// try-with-resources block
//		try(Scanner scanner = new Scanner(System.in)){
//			scanner.nextInt();
//		}
//		catch(Exception e) {
//			System.out.println("Some error");
//		}
//		
		try(FileInputStream file = new FileInputStream("abc.txt")){
			
		}
		catch(FileNotFoundException e) {
			
		}
		catch(IOException e) {
			
		}
		catch(Exception e) {
			System.out.println("Some error");
		}
		
//		FileInputStream file = new FileInputStream("abc.txt");
//		
//		file.close();
		
		FileInputStream file ;
		
//		try {
//			file = new FileInputStream("Abc.txt");
//		}
//		catch(FileNotFoundException e) {
//			System.out.println("File not found");
//		}
//		finally {
//			file.close();
//		}
	}

}
