package com.company.CarRental.model;

import java.util.ArrayList;

/**
 * 
 * Car class is the model class for all the cabs in our fleet.
 * It uses another model class - BookingStatus
 * 
 * @author Anmol
 *
 */
public class Car {

	private static ArrayList<Car> cars = new ArrayList<>();
	
	private String vehicleNumber;
	private String model;
	private byte seatingCapacity;
	private short rentPerDay;
	private ArrayList<BookingStatus> bookings = new ArrayList<>();
	
	/**
	 * 
	 * Don't use this constructor directly.
	 * If you want to add a new car to the fleet then use CarOperations' addNewCar()
	 * 
	 * @param vehicleNumber
	 * @param model
	 * @param seatingCapacity
	 * @param rentPerDay
	 */
	public Car(String vehicleNumber, String model, int seatingCapacity, int rentPerDay) {
		this.vehicleNumber = vehicleNumber;
		this.model = model;
		this.seatingCapacity = (byte)seatingCapacity;
		this.rentPerDay = (short)rentPerDay;
	}
	
	public ArrayList<BookingStatus> getBookings(){
		return bookings;
	}
	
	public byte getSeatingCapacity() {
		return seatingCapacity;
	}
	
	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = (byte)seatingCapacity;
	}
	
	public short getRentPerDay() {
		return rentPerDay;
	}
	
	public void setRentPerDay(int rentPerDay) {
		this.rentPerDay = (short)rentPerDay;
	}
	
	public static ArrayList<Car> getCars() {
		return cars;
	}
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	
	public String getModel() {
		return model;
	}
	
}
