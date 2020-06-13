package oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling3 {

	public void readFromKeyboard() throws InputMismatchException {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			scanner.nextInt();
		}
		finally {
			scanner.close();
		}
	}
	
	public void readFromKeyboard2() throws InputMismatchException, IOException{
		
		for(int i = 0; i < 5; i++) {
			
		}
		
//		try(Scanner scanner = new Scanner(System.in);
//			FileInputStream file = new FileInputStream("path.txt")) {
//			scanner.nextInt();
//			scanner.nextLine();
//		}
		
		Scanner scanner = new Scanner(System.in);
		FileInputStream file = new FileInputStream("path.txt");
		scanner.nextLine();
		
		try(scanner;file) {
				scanner.nextInt();
				scanner.nextLine();
		}
	}
	
	public static void main(String[] args) {
		try {
			ExceptionHandling3 obj = new ExceptionHandling3();
			obj.readFromKeyboard();
		}
		catch(InputMismatchException e) {
			System.out.println("input error");
		}
		catch(Exception e) {
			System.out.println("error");
		}

	}

}
