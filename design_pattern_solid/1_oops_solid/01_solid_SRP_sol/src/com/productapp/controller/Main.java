package com.productapp.controller;

import java.sql.SQLException;

import com.productapp.dto.Product;
import com.productapp.service.ProductService;
import com.productapp.service.ProductServiceImpl;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		ProductService productService=
				new ProductServiceImpl();
		Product product=new Product("rich data poor dad", 300.00);
		
		productService.addProduct(product);
		
		System.out.println("product is added to data");
	}
}
