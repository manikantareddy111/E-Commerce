package com.spring.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import com.spring.config.DBConfig;
import com.spring.dao.ProductDAO;
import com.spring.model.Product;



@ComponentScan("com.spring")
public class ProductTest {
	
	
	//@Autowired
	//private static Product product;
	

	@Autowired
	private static ProductDAO productDAO;
	
	@SuppressWarnings("resource")
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.spring.*");
		context.refresh();
		
	//t	product=(Product) context.getBean("product");
		productDAO=(ProductDAO) context.getBean("productDAO");
	
	}
	@Ignore
	@Test
	public void createProduct()
	{
	Product product=new Product();
		product.setName("Perk");
		product.setQuantity(6);
		product.setPrice(250.12);
		
		boolean 
		flag=productDAO.createProduct(product);
		
		assertEquals("createProductTestCase", true, flag);
		
		
	}
	@Test
	 public void deleteProduct()
	 {
		 Product product=new Product();
		 
		 product.setName("Perk");
			product.setQuantity(6);
			product.setPrice(250.12);
			
			boolean flag=productDAO.deleteProduct(5);
			
			assertEquals("deleteProductTestCase", true, flag);
			 
	 }
	
	
	
	
	

}