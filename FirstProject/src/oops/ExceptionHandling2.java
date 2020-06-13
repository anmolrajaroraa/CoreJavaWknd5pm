package oops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling2 {
	
	public static int divide(int number1, int number2) {
		
		return number1/number2;
	}
	
	public static void main(String[] args) {
		
		int arr[] = new int[5];
		
		Scanner scanner = new Scanner(System.in);
		
		try {
		
			for(int i = 0; i <= arr.length; i++) {
				
				System.out.println("Enter first number..");
				int number1 = scanner.nextInt();
				System.out.println("Enter second number..");
				int number2 = scanner.nextInt();
				
				arr[i] = divide(number1, number2);
			}
			
			for(int value : arr) {
				System.out.println(value);
			}
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index is not legal...");
		}
		catch(InputMismatchException e) {
			System.out.println("only integers allowed ...");
		}
		catch(ArithmeticException e) {
			System.out.println("Divide by zero is not allowed...");
		}
		catch(Exception e) {
			System.out.println("error");
		}
		finally {
			scanner.close();
		}
		
	}
	
}
