package oops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		// try block tries to run our code 
		// if some exception occurs, it is thrown (a new exception object id created) to the catch block
		Scanner scanner = new Scanner(System.in);
		try{
			
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			System.out.println( num1 / num2 );
			
			int arr[] = new int[5];
			System.out.println(arr[1]);
			

		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index you entered for array is greater than its size");
		}
		catch(InputMismatchException e) {
			System.out.println("Please enter only integers...");
		}
		catch(ArithmeticException e) {
			System.out.println("Second number should not be zero");
		}
//		catch(IOException e) {
//			
//		}
		catch(Exception e) {
//			e.printStackTrace();
			System.out.println("Some exception occured.." + e.getMessage());
//			e.printStackTrace();
		}
		finally {
			System.out.println("I always execute!");
			scanner.close();
		}
		
		System.out.println("This statement will execute...");
	}

}
