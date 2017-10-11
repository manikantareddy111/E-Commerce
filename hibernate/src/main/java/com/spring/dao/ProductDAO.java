package com.spring.dao;

import java.util.List;

import com.spring.model.Product;


public interface ProductDAO 
{
	public boolean createProduct(Product product);
	
	public boolean getProduct(int id);
	
	//public List<Product1> retrieveProduct1();
	
	public boolean updateProduct(Product product);
	
	public boolean deleteProduct(int id);

}

