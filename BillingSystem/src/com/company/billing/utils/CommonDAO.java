package com.company.billing.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface CommonDAO extends ConfigReader{
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection connection = null;
		Class.forName(rb.getString(DRIVER));
		System.out.println("Driver loaded...");
		connection = DriverManager.getConnection(rb.getString(DBURL), rb.getString(USERID), rb.getString(PWD));
		return connection;
	}
	
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		getConnection();
//	}
	
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		String emailID = "ram3@gmail.com";
//		String password = "ram1234";
//		Connection connection = null;
//		String dbUserID = "root";
//		String dbPassword = null;
//		String connectionString = "jdbc:mysql://localhost:3306/billingdb?serverTimezone=IST";
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		System.out.println("Driver loaded");
//		connection = DriverManager.getConnection(connectionString, dbUserID, dbPassword);
//		System.out.println("Connection created...");
//		Statement statement = connection.createStatement();
//		ResultSet resultSet = statement.executeQuery("select name, email, password from user_mst where email = '" + emailID + "' and password = '"+ password + "'");
//		if(resultSet.next()) {
//			System.out.println("Welcome " + resultSet.getString("name"));
//		}
//		else {
//			System.out.println("Invalid email or password");
//		}
////		select email, password from user_mst where email = 'ram@gmail.com' and password = 'ram1234'
//		resultSet.close();
//		statement.close();
//		connection.close();
//	}
}
