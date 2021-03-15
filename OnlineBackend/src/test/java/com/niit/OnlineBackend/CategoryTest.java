package com.niit.OnlineBackend;
import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.OnlineBackend.DAO.CategoryDAO;
import com.niit.OnlineBackend.model.Category;


public class CategoryTest 
{
	private static AnnotationConfigApplicationContext context;
	private Category category;
	static private CategoryDAO categoryDAO;
	

	@BeforeClass
	public static void init() 
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.OnlineBackend");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
	}
	

	/*
	 @Test
		public void testAddCategory() 
		{
			category = new Category();
			category.setName("Strategy");
			category.setDesc("Sample category for Strategy Games");
			category.setActive(true);
			
			assertEquals("Error adding Category",true,categoryDAO.addCategory(category));
			
			
		}
	
	@Test
	public void testActiveCategories()
	{
		
		assertEquals("Unable to return Active Categories",8,categoryDAO.getActiveCategories().size());
		
	}
	
	
	@Test
	public void testDeleteCategory()
	{
		category = categoryDAO.getSingleCategory(7);
		
		assertEquals("Error Deleting Category",true,categoryDAO.deleteCategory(category));
		
	}
	
	@Test
	public void testUnblockCategory()
	{
		
		category = categoryDAO.getSingleCategory(7);
		
		assertEquals("Error Unblocking Category",true,categoryDAO.unblockCategory(category));
	}
	
	@Test
	public void testUpdateCategory()
	{
		
		category = categoryDAO.getSingleCategory(7);
		
		category.setDesc("Sample description for Simulation Games");
		
		assertEquals("Error Updating Category",true,categoryDAO.updateCategory(category));
		
		
	}
	*/
	
	
	
	
}