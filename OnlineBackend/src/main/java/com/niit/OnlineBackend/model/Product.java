package com.niit.OnlineBackend.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Product 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
		
	private String code;
	
	private String name;

	@JsonIgnore
	private String description;

	private double price;
	
	private String platforms;
	
	@JsonIgnore
	@Column(name = "is_active")
	private boolean active;

	@JsonIgnore
	@Column(name = "category_id")
	private int categoryId;

	
	@JsonIgnore
	private int purchases;
	
	@JsonIgnore
	private int views;
	
	public Product() 
	{	
		code = "PRDN" + UUID.randomUUID().toString().substring(26);
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getCode() 
	{
		return code;
	}

	public void setCode(String code) 
	{
		this.code = code;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getDescription() 
	{
		return description;
	}

	public void setDescription(String description) 
	{
		this.description = description;
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}

	public String getPlatforms() 
	{
		return platforms;
	}

	public void setPlatforms(String platforms) 
	{
		this.platforms = platforms;
	}

	public boolean isActive() 
	{
		return active;
	}

	public void setActive(boolean active) 
	{
		this.active = active;
	}

	public int getCategoryId() 
	{
		return categoryId;
	}

	public void setCategoryId(int categoryId) 
	{
		this.categoryId = categoryId;
	}

	public int getPurchases() 
	{
		return purchases;
	}

	public void setPurchases(int purchases) 
	{
		this.purchases = purchases;
	}

	public int getViews() 
	{
		return views;
	}

	public void setViews(int views) 
	{
		this.views = views;
	}
	


}
