package com.company.billing.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
		statement = connection.prepareStatement("insert into product_mst (id, name, description, price, imgpath, quantity) values (?,?,?,?,?,?)");
		for(Product product : productsList) {
			statement.setInt(1, product.getId());
			statement.setString(2, product.getName());
			statement.setString(3, product.getDescription());
			statement.setDouble(4, product.getPrice());
			statement.setString(5, product.getPath());
			statement.setInt(6, product.getQuantity());
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
}
