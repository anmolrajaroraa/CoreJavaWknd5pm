package com.company.CarRental.view;

import java.util.Scanner;

import com.company.CarRental.controller.CarOperations;

public class View {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		CarOperations operations = new CarOperations();
		operations.addCar("DL2CAR0001", "hyundai verna 2020", 5, 1000);
		operations.addCar("DL2CAR0002", "mercedes benz gla", 5, 5000);
		
		while(true) {
			System.out.println("\n1. Add a new car to the fleet");
			System.out.println("2. Show all cars in the fleet");
			System.out.println("3. Check details of a car");
			System.out.println("4. Remove a car from the fleet");
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
				scanner.nextLine();
				System.out.println( operations.addCar(vehicleNumber, model, seatingCapacity, rentPerDay) );
				break;
			case 2:
				System.out.println( operations.showCars() );
				break;
			case 3:
				System.out.print("Enter vehicle number for which you want to see details: ");
				vehicleNumber = scanner.nextLine().toUpperCase();
				System.out.println( operations.showDetailsForCar(vehicleNumber) );
				break;
			case 4:
				System.out.print("Enter vehicle number for the car which you want to remove: ");
				vehicleNumber = scanner.nextLine().toUpperCase();
				System.out.println( operations.showDetailsForCar(vehicleNumber));;
				if(operations.getCar(vehicleNumber) != null) {
					System.out.println("Are you sure to delete this car?");
					String userChoice = scanner.next().toLowerCase();
					if(userChoice.equals("y") || userChoice.equals("yes"))
						System.out.println( operations.deleteCar(vehicleNumber) );
				}
				break;
			default:
				System.out.println("Invalid choice...");
			}
			
		}
		
		scanner.close();

	}

}
