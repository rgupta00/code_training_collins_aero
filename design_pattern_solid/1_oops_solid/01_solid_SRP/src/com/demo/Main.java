package com.demo;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		Product product=new Product("water jug",700.00);
		product.addProduct();
		System.out.println("------------------");
	}
}
