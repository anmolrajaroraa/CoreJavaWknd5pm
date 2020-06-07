package com.company.CarRental.model;

import java.time.LocalDate;

/**
 * 
 * List of objects of this class is embedded inside Car class to keep track of all the bookings done for a particular car
 * 
 * @author Anmol
 *
 */
public class BookingStatus {

	private String customerName;
	private long customerPhoneNo;
	private LocalDate issueDate;
	private LocalDate returnDate;
	
	/**
	 * 
	 * Dont use this constructor directly.
	 * It is meant only for Car class to keep track of bookings 
	 * 
	 * @param customerName
	 * @param customerPhoneNo
	 * @param issueDate
	 * @param returnDate
	 */
	public BookingStatus(String customerName, String customerPhoneNo, String issueDate, String returnDate) {
		this.customerName = customerName;
		this.customerPhoneNo = Long.parseLong(customerPhoneNo);
		this.issueDate = LocalDate.parse(issueDate);
		this.returnDate = LocalDate.parse(returnDate);
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getCustomerPhoneNo() {
		return customerPhoneNo;
	}

	public void setCustomerPhoneNo(long customerPhoneNo) {
		this.customerPhoneNo = customerPhoneNo;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	
	
	
	
	
}
