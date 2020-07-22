package com.company.billing.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.company.billing.utils.CommonDAO;

public class UserDAO {
	
	public boolean register(String name, String emailID, String password) throws SQLException, ClassNotFoundException {
		Connection connection = null;
		Statement statement = null;
		
		try {
			connection = CommonDAO.getConnection();
			statement = connection.createStatement();
			int rowCount = statement.executeUpdate("insert into user_mst (name, email, password) values ('" + name + "', '" + emailID + "', '" + password + "')");
			if(rowCount == 1) {
				return true;
			}
			else {
				return false;
			}
		} 
		finally {
			statement.close();
			connection.close();
		}
	}
	
	public boolean isUserExist(String emailID) throws ClassNotFoundException, SQLException {
		ResultSet resultSet = null;
		Connection connection = null;
		Statement statement = null;
		try {
			connection = CommonDAO.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select email from user_mst where email='" + emailID + "'");
			if(resultSet.next()) {
				return true;
			}
			else {
				return false;
			}
		} 
		finally {
			resultSet.close();
			statement.close();
			connection.close();
		}
	}
	
	public String loginCheck(String emailID, String password) throws ClassNotFoundException, SQLException {
		ResultSet resultSet = null;
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = CommonDAO.getConnection();
			statement = connection.prepareStatement("select name from user_mst where email=? and password=?");
			statement.setString(1, emailID);
			statement.setString(2, password);
			resultSet = statement.executeQuery();
			if(resultSet.next()) {
				return resultSet.getString("name");
			}
			else {
				return null;
			}
		} 
		finally {
			resultSet.close();
			statement.close();
			connection.close();
		}
	}
}
