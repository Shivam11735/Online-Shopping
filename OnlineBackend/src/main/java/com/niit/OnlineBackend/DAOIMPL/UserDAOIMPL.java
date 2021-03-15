package com.niit.OnlineBackend.DAOIMPL;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.niit.OnlineBackend.DAO.UserDAO;
import com.niit.OnlineBackend.model.User;


@Repository("userDAO")
@Transactional
public class UserDAOIMPL implements UserDAO 
{
	@Autowired
	private SessionFactory sessionFactory;

	
	public String addUser(User user) 
	{
		
		try 
		{
			sessionFactory.getCurrentSession().persist(user);
			
			return "User Added Successfully";
			
		}
		catch(Exception e)
		{
			System.out.print(e);
			
			return "Error Adding User";
		}
		
		
	}
	
	public User getUser(int id) 
	{
		
		return sessionFactory.getCurrentSession().get(User.class, id);
		
	}


	public boolean blockUser(User user) 
	{
	
		int flag = user.getFlag();
		
		if(flag >= 10)
		{
			user.setEnabled(false);
			System.out.print(flag);
		}
		
		try
		{
			sessionFactory.getCurrentSession().update(user);	
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
		
	}

	public boolean reportUser(User user) 
	{

		int flag = user.getFlag();
		
		int temp = flag+1;
		
		user.setFlag(temp);
		
		try
		{
			sessionFactory.getCurrentSession().update(user);	
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
		
	}

	public boolean unblockUser(User user) 
	{
		
		user.setFlag(0);
		
		user.setEnabled(true);
		
		try
		{
			sessionFactory.getCurrentSession().update(user);	
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
	}

	public boolean updateUser(User user) 
	{
	
		
		try
		{
			sessionFactory.getCurrentSession().update(user);	
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	
	}


}
