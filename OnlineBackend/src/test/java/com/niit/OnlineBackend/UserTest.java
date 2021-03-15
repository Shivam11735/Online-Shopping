package com.niit.OnlineBackend;
import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.OnlineBackend.DAO.UserDAO;
import com.niit.OnlineBackend.model.User;

public class UserTest 
{
	private static AnnotationConfigApplicationContext context;
	private User user;
	static private UserDAO userDAO;
	

	@BeforeClass
	public static void init() 
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.OnlineBackend");
		context.refresh();
		userDAO = (UserDAO)context.getBean("userDAO");
	}
	
	/*
	@Test
	public void testAddUser() 
	{
		
		user = new User();
		user.setFirstName("Sagnik");	
		user.setEmail("sagnik@gmail.com");
		user.setPassword("Sagnik123");
		user.setEnabled(true);
		user.setRole("User");
		user.setFlag(12);
		assertEquals("Error adding user","User Added Successfully",userDAO.addUser(user));
		
		
	}
	
	@Test
	public void testBlockUser()
	{
		
		user = userDAO.getUser(1);
		
		assertEquals("Error blocking user",true,userDAO.blockUser(user));
		
	}
	
	@Test
	public void testReportUser()
	{
		
		user = userDAO.getUser(1);
		
		assertEquals("Error Reporting User",true,userDAO.reportUser(user));
		
	}
	
	
	@Test
	public void testUnblockUser()
	{
		
		
		user = userDAO.getUser(1);
		
		assertEquals("Error Unblocking User",true,userDAO.unblockUser(user));
		
		
	}
	
	
	@Test
	public void testUpdateUser()
	{
	
		user = userDAO.getUser(1);
		
		user.setEmail("sagnik123@gmail.com");
		
		assertEquals("Error Updating User",true,userDAO.updateUser(user));
		
		
	}
	*/
	
	
	
}