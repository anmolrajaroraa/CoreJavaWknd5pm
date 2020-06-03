package com.company.CarRental.view;

import java.util.Scanner;

import com.company.CarRental.controller.CarOperations;

public class View {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		CarOperations operations = new CarOperations();
		
		while(true) {
			System.out.println("\n1. Add a new car to the fleet");
			System.out.println("9. Exit\n");
			
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();  
			scanner.nextLine();
			
			if(choice == 9) {
				System.out.println("Thanks for visiting us...");
				break;
			}
			
			switch(choice) {
			case 1:
				System.out.println("Enter details for the new car...");
				System.out.print("Enter vehicle number: ");
				String vehicleNumber = scanner.nextLine().toUpperCase();
				System.out.print("Enter model: ");
				String model = scanner.nextLine();
				System.out.print("Enter seating capacity: ");
				int seatingCapacity = scanner.nextInt();
				System.out.print("Enter rent per day: ");
				int rentPerDay = scanner.nextInt();
				System.out.println( operations.addCar(vehicleNumber, model, seatingCapacity, rentPerDay) );
				System.out.println( operations.showCars() );
				break;
			default:
				System.out.println("Invalid choice...");
			}
			
		}
		
		scanner.close();

	}

}
