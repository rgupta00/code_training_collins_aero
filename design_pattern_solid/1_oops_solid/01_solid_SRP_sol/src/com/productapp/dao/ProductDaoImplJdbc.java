package com.productapp.dao;

import java.sql.*;

import com.productapp.dto.Product;

public class ProductDaoImplJdbc implements ProductDao {

	private Connection connection;

	public ProductDaoImplJdbc() {
		connection = JdbcConnnectionFactory.getConnection();
	}

	@Override
	public void addProduct(Product product) {

		try {
			PreparedStatement pstmt = connection
					.prepareStatement("insert into product(name,price) values(?,?)");
			pstmt.setString(1, product.getName());
			pstmt.setDouble(2, product.getPrice());

			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
