package com.niit.OnlineBackend.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Wishlist 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@JsonIgnore
	@Column(name = "U_ID")
	private int userID;
	
	@JsonIgnore
	@Column(name = "P_Code")
	private String productCode;
	
	@Column(name = "W_ID")
	private String wishID;
	
	@Column(name = "P_Name")
	private String productName;
	
	
	private int price;
	
	
	@Column(name = "")
	private String categoryName;
	
	
	private String desc;


	public Wishlist()
	{
		
		wishID = "LIST" + UUID.randomUUID().toString().substring(26);
		
	}
	
	public int getId() 
	{
		return id;
	}


	public void setId(int id) 
	{
		this.id = id;
	}


	public int getUserID() 
	{
		return userID;
	}


	public void setUserID(int userID) 
	{
		this.userID = userID;
	}


	public String getProductCode() 
	{
		return productCode;
	}


	public void setProductCode(String productCode) 
	{
		this.productCode = productCode;
	}


	public String getProductName() 
	{
		return productName;
	}


	public void setProductName(String productName) 
	{
		this.productName = productName;
	}


	public int getPrice() 
	{
		return price;
	}


	public void setPrice(int price) 
	{
		this.price = price;
	}


	public String getCategoryName() 
	{
		return categoryName;
	}


	public void setCategoryName(String categoryName) 
	{
		this.categoryName = categoryName;
	}


	public String getDesc() 
	{
		return desc;
	}


	public void setDesc(String desc) 
	{
		this.desc = desc;
	}
	


}
