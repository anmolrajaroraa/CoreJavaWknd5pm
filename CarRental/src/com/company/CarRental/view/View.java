package com.company.CarRental.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.company.CarRental.controller.CarOperations;

public class View {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		CarOperations operations = new CarOperations();
		System.out.println(operations.addCar("DL2CAR0001", "hyundai verna 2020", 5, 1000));
		System.out.println(operations.addCar("DL2CAR0002", "mercedes benz gla", 5, 5000));
		System.out.println(	operations.bookCar("DL2CAR0001", "Ram Kumar", "1234123412", "2020-06-07", "2020-06-10"));
		System.out.println(operations.bookCar("DL2CAR0002", "Shyam Kumar", "99999", "2020-06-15", "2020-06-20"));
		
		// 6 - 10 June
		// 15 - 20 June
		// 5 - 10 June - done
		// 8 - 9 June
		// 8 - 12 June
		// 11 - 12 June
		
		while(true) {
			System.out.println("\n1. Add a new car to the fleet");
			System.out.println("2. Show all cars in the fleet");
			System.out.println("3. Check details of a car");
			System.out.println("4. Remove a car from the fleet");
			System.out.println("5. Book a car based on date availability");
			System.out.println("6. Book a car based on seating capacity");
			System.out.println("7. Book a car based on rent per day");
			System.out.println("8. Book a car based on date availability, seat capacity and rent per day");
			
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
			case 5:
				System.out.print("Enter customer name: ");
				String customerName = scanner.nextLine();
				System.out.print("Enter customer phone no: ");
				String customerPhoneNo = scanner.nextLine();
				System.out.print("Enter issue date (YYYY-MM-DD): ");
				String issueDate = scanner.nextLine();
				System.out.print("Enter return date (YYYY-MM-DD): ");
				String returnDate = scanner.nextLine();
				// Dictionary -> VehicleNumber : CarModel
				HashMap<String, String> carsAvailable = operations.showCarsAvailableForBooking(issueDate, returnDate);
				if(carsAvailable.size() == 0) {
					System.out.println("No cars available for the dates provided");
					break;
				}
				System.out.println("\nAvailable cars:\n");
				int counter = 1;
				for(String value : carsAvailable.values()) {
					System.out.println(counter + ". " + value);
					counter++;
				}
				System.out.println("Which car do you want to book?");
				choice = scanner.nextInt();
				scanner.nextLine();
				vehicleNumber = (String) carsAvailable.keySet().toArray()[choice - 1];
				System.out.println(operations.bookCar(vehicleNumber, customerName, customerPhoneNo, issueDate, returnDate));
				break;
			default:
				System.out.println("Invalid choice...");
			}
			
		}
		
		scanner.close();

	}

}
