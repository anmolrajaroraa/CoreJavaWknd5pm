package com.company.billing.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.company.billing.utils.CommonDAO;

public interface ProductDAO {
	public static boolean bulkUpload(ArrayList<Product> productsList) throws ClassNotFoundException, SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		if(productsList == null || productsList.size() == 0) {
			return false;
		}
		connection = CommonDAO.getConnection();
		connection.setAutoCommit(false);
		statement = connection.prepareStatement("insert into product_mst (id, name, description, price, imgpath, brand, category ) values (?,?,?,?,?,?,?)");
		for(Product product : productsList) {
			statement.setString(1, product.getId());
			statement.setString(2, product.getName());
			statement.setString(3, product.getDescription());
			statement.setDouble(4, product.getPrice());
			statement.setString(5, product.getPath());
			statement.setString(6,  product.getBrand());
			statement.setString(7, product.getCategory());
			statement.addBatch();
		}
		
		int results[] = statement.executeBatch();
		boolean rollback = false;
		for(int result : results) {
			if(result == 0) {
				rollback = true;
				break;
			}
		}
		if(rollback) {
			connection.rollback();
			return false;
		}
		else {
			connection.commit();
			return true;
		}
	}
	
	public static ArrayList<String> getProductNames() throws SQLException, ClassNotFoundException {
		ArrayList<String> productNames = new ArrayList<>();
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			connection = CommonDAO.getConnection();
			statement = connection.prepareStatement("select name from product_mst");
			resultSet = statement.executeQuery();
			while(resultSet.next()) {
				productNames.add( resultSet.getString("name") );
			}
		}
		finally {
			resultSet.close();
			statement.close();
			connection.close();
		}
		
		return productNames;
	}
	
	public static Product getProductByName(String name) throws SQLException, ClassNotFoundException {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		Product product = new Product();
		try {
			connection = CommonDAO.getConnection();
			statement = connection.prepareStatement("select * from product_mst where name = ?");
			statement.setString(1, name);
			resultSet = statement.executeQuery();
			if(resultSet.next()) {
				product.setId(resultSet.getString("id"));
				product.setName(resultSet.getString("name"));
				product.setDescription(resultSet.getString("description"));
				product.setPrice(resultSet.getDouble("price"));
				product.setPath(resultSet.getString("imgpath"));
				product.setBrand(resultSet.getString("brand"));
				product.setCategory(resultSet.getString("category"));
			}
		}
		finally {
			resultSet.close();
			statement.close();
			connection.close();
		}
		
		return product;	
	}
}
