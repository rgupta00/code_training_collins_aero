package com.productapp.service;

import com.productapp.dao.ProductDao;
import com.productapp.dao.ProductDaoImplJdbc;
import com.productapp.dto.Product;
import com.productapp.validation.DataValidator;


public class ProductServiceImpl implements ProductService{

	private ProductDao productDao;
	private DataValidator dataValidator;
	
	
	public ProductServiceImpl() {
		productDao=new ProductDaoImplJdbc();
		dataValidator=new DataValidator();
	}



	@Override
	public void addProduct(Product product) {
		if(dataValidator.productValidator(product)){
			productDao.addProduct(product);
		}else{
			System.out.println("data validation problem");
		}
	}

}
