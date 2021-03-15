package com.niit.OnlineBackend;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.OnlineBackend.DAO.ProductDAO;
import com.niit.OnlineBackend.model.Product;


public class ProductTest 
{
	
	private static AnnotationConfigApplicationContext context;
	private Product product;
	static private ProductDAO productDAO;
	

	@BeforeClass
	public static void init() 
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.OnlineBackend");
		context.refresh();
		productDAO = (ProductDAO)context.getBean("productDAO");
		
	}
	
	/*
	@Test
	public void testAddProduct()
	{
	
		product = new Product();
	
		product.setName("X-PLANE");
		product.setActive(true);
		product.setCategoryId(7);
		product.setDescription("FLIGHT SIMULATOR");
		product.getCode();
		product.setPlatforms("Windows , PS4, PS5");
		product.setPrice(3199);
		
		assertEquals("Error Adding Product",true,productDAO.addProduct(product));
				
	}
	
	
	@Test
	public void testActiveProduct()
	{
		
		assertEquals("Error getting Info.",12,productDAO.getActiveProduct().size());
		
	}
	
	@Test
	public void testGetCategoryProduct()
	{
		
		assertEquals("Error Getting Count",3,productDAO.getCategoryProduct(5).size());
		
	}
	
	@Test
	public void testSingleProduct()
	{
		
		assertEquals("Error fetching Product","NBA",productDAO.getSingleProduct(34).getName());
		
	}
	
	@Test
	public void testUpdateProduct()
	{
		
		product = productDAO.getSingleProduct(41);
		
		product.setPrice(999);
		
		assertEquals("Error Updating Product",true,productDAO.updateProduct(product));
		
	}
	
	@Test
	public void testDeleteProduct()
	{
		
		product = productDAO.getSingleProduct(41);
		
		assertEquals("Error Deleting Product",true,productDAO.deleteProduct(product));
		
	}
	*/
	
	@Test
	public void testUnblockProduct()
	{
			
		product = productDAO.getSingleProduct(41);
		
		assertEquals("Error Unblocking Product",true,productDAO.unblockProduct(product));
		
	}


}
