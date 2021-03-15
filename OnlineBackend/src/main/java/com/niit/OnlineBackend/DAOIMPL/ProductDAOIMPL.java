package com.niit.OnlineBackend.DAOIMPL;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.niit.OnlineBackend.DAO.ProductDAO;
import com.niit.OnlineBackend.model.Product;


@Repository("productDAO")
@Transactional
public class ProductDAOIMPL implements ProductDAO 
{
	
	@Autowired
	private SessionFactory sessionFactory;

	public boolean addProduct(Product product) 
	{
	
		try
		{
			sessionFactory.getCurrentSession().persist(product);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
	}

	public List<Product> getActiveProduct() 
	{
	
		String selectActiveProduct = "FROM Product WHERE active = :active";

		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveProduct);

		query.setParameter("active", true);

		return query.getResultList();
		
	}

	public List<Product> getCategoryProduct(int categoryId) 
	{
	
		String selectActiveProduct = "FROM Product WHERE active = :active and categoryId = :categoryId";

		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveProduct);

		query.setParameter("active", true);
		query.setParameter("categoryId", categoryId);

		return query.getResultList();
		
	}

	public Product getSingleProduct(int id) 
	{

		return sessionFactory.getCurrentSession().get(Product.class, id);
		
	}

	public boolean updateProduct(Product product) 
	{
		
		try
		{
			sessionFactory.getCurrentSession().update(product);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
		
	}

	public boolean deleteProduct(Product product) 
	{
	
		product.setActive(false);
		
		try
		{
			sessionFactory.getCurrentSession().update(product);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
	}

	public boolean unblockProduct(Product product) 
	{
	
		product.setActive(true);
		
		try
		{
			sessionFactory.getCurrentSession().update(product);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
	}
	
	
	

}
