package com.niit.test;
/*package com.spring.test;

	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;
	import org.springframework.context.annotation.ComponentScan;

import com.spring.config.DBConfig;
import com.spring.dao.CartDAO;
import com.spring.model.Cart;

import static org.junit.Assert.*;

	import org.junit.BeforeClass;
	import org.junit.Ignore;
	import org.junit.Test;

	@ComponentScan("com.backend")
	public class CartTest {
		@Autowired
		private static CartDAO cartDAO;
		
		
		@BeforeClass
		public static void initialize()
		{
			AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
			context.register(DBConfig.class);
			context.scan("com.niit.*");
			context.refresh();
			cartDAO=(CartDAO)context.getBean("cartDAO");
		}
		@Test
		public void createCart()
		{
			Cart cart=new Cart();
			
			cart.setPrice(100.23);
			cart.setProductid(23);
			cart.setProductname("ice cream");
			cart.setQuantity(10);
			cart.setStatus("y");
			cart.setUsername("Manikantat");

			boolean flag=cartDAO.createCart(cart);
			assertEquals("creatCartTestCase",true,flag);
		}
		@Ignore
		@Test
		
		public void updateCart()
		{
			Cart cart = new Cart();
			boolean flag=cartDAO.updateCart(cart);
			assertEquals("createCartTestCase", true, flag);
		}
		@Ignore
		@Test
		public void deleteCart()
		{
			Cart cart = new Cart();
			cart.setCartid(10);
			cart.setPrice(100.23);
			cart.setProductid(23);
			cart.setProductname("ice cream");
			cart.setQuantity(10);
			cart.setStatus("y");
			cart.setUsername("Anuroop");
			boolean flag=cartDAO.deletecart(34);
			assertEquals("createCartTestCase", true, flag);
		}
		

		

	}	

*/