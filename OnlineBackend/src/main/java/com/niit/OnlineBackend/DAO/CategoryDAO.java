package com.niit.OnlineBackend.DAO;

import java.util.List;

import com.niit.OnlineBackend.model.Category;

public interface CategoryDAO 
{
	
	public boolean addCategory(Category category);
	
	public List<Category> getActiveCategories();
	
	public Category getSingleCategory(int id);
	
	public boolean deleteCategory(Category category);
	
	public boolean unblockCategory(Category category);
	
	public boolean updateCategory(Category category);
	
	
}
