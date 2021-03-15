package com.niit.OnlineBackend.DAO;

import com.niit.OnlineBackend.model.User;

public interface UserDAO 
{
	
	public String addUser(User user); 
	
	public User getUser(int id);
	
	public boolean blockUser(User user);
	
	public boolean reportUser(User user);
	
	public boolean unblockUser(User user);
	
	public boolean updateUser(User user);

}
