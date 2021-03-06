package com.niit.OnlineBackend.DAO;

import java.util.List;

import com.niit.OnlineBackend.model.Product;


public interface ProductDAO 
{
	
	public boolean addProduct(Product product);
	
	public List<Product> getActiveProduct();
	
	public List<Product> getCategoryProduct(int categoryId);
	
	public Product getSingleProduct(int id);
	
	public boolean updateProduct(Product product);
	
	public boolean deleteProduct(Product product);
	
	public boolean unblockProduct(Product product);

}
