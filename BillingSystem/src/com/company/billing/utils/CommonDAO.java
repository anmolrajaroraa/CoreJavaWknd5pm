package com.company.billing.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CommonDAO {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String emailID = "ram@gmail.com";
		String password = "ram1234";
		Connection connection = null;
		String dbUserID = "root";
		String dbPassword = null;
		String connectionString = "jdbc:mysql://localhost:3306/billingdb?serverTimezone=IST";
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		connection = DriverManager.getConnection(connectionString, dbUserID, dbPassword);
	}
}
