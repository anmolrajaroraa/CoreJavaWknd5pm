package com.company.billing.user;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDAO {
	
	public boolean register(String name, String emailID, String password) {
		ResultSet resultSet = null;
		Connection connection = null;
		Statement statement = null;
		
		return false;
	}
	
	public boolean isUserExist(String emailID) {
		return false;
	}
	
	public boolean loginCheck(String emailID, String password) {
		return false;
	}
}
