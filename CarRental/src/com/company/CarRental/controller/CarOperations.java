package com.company.CarRental.controller;

import com.company.CarRental.model.Car;

public class CarOperations {

	// CRUD
	// Create, Read, Update, Delete
	// Add a new car to our fleet
	// Show details of car
	// Show bookings for a particular car
	// Update car details
	// Delete car from our fleet
	
	/**
	 * 
	 * This function can add a new car to your fleet
	 * 
	 * @param vehicleNumber
	 * @param model
	 * @param seatingCapacity
	 * @param rentPerDay
	 * @return
	 */
	public String addCar(String vehicleNumber, String model, int seatingCapacity, int rentPerDay) {
		
		if(Car.getCars().add( new Car(vehicleNumber, model, seatingCapacity, rentPerDay) )) {
			return "Car added to the fleet...";
		}
		return "Car couldn't be added...";
	}
	
	/**
	 * 
	 * This function can print details for all your cars
	 * 
	 * @return
	 */
	public String showCars() {
		String details = "";
		for( Car car : Car.getCars() ) {
			details += showDetails(car);
		}
		return details;
	}
	
	/**
	 * 
	 * @param car
	 * @return
	 */
	private String showDetails( Car car ) {
		String carDetails = "\n";
		carDetails += "\nVehicle Number: " + car.getVehicleNumber();
		carDetails += "\nModel: " + car.getModel();
		carDetails += "\nSeating capacity: " + car.getSeatingCapacity();
		carDetails += "\nRent per day: " + car.getRentPerDay();
		return carDetails;
	}
	
}
