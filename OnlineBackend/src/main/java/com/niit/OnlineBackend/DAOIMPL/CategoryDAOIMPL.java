package com.niit.OnlineBackend.DAOIMPL;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.niit.OnlineBackend.DAO.CategoryDAO;
import com.niit.OnlineBackend.model.Category;


@Transactional
@Repository("categoryDAO")
public class CategoryDAOIMPL implements CategoryDAO 
{

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean addCategory(Category category) 
	{
		try
		{
			sessionFactory.getCurrentSession().persist(category);	
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
	}

	public List<Category> getActiveCategories() 
	{
	
		String selectActiveCategory = "FROM Category WHERE active = :active";
		
		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
				
		query.setParameter("active", true);
						
		return query.getResultList();
	
	}

	public Category getSingleCategory(int id) 
	{
		
		return sessionFactory.getCurrentSession().get(Category.class, id);
		
	}

	public boolean deleteCategory(Category category)
	{
	
		category.setActive(false);
		
		try
		{
			sessionFactory.getCurrentSession().update(category);	
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
	}

	public boolean unblockCategory(Category category) 
	{
		category.setActive(true);
		
		try
		{
			sessionFactory.getCurrentSession().update(category);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
		
	}

	public boolean updateCategory(Category category) 
	{
		
		
		
		try
		{
			sessionFactory.getCurrentSession().update(category);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
	}

	
	
	

	
	

}
