

package com.hibernate.shopping.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

@Table(name = "customer")

public class Customer implements Serializable
{
	private static final long serialVersionUID =1L;
	
	@Id
	@Column(name ="Cust_ID")
	private int id;
	
	@Column(name ="Cust_Name")
	private String name;
	
	@Column(name ="Cust_PhoneNo")
	private String phone;
	
	@Column(name ="Cust_EmailID")
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="User_Id")
	private User user;
	
	//@OneToMany(mappedBy ="customer")
	private OrderDetails orderdetails;
	
	public Customer() {}

	public Customer(int id, String name, String phone, String email, User user,
			OrderDetails orderdetails) 
	{
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.user = user;
		this.orderdetails = orderdetails;
	}

	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getPhone() 
	{
		return phone;
	}
	
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}
	
	public String getEmail() 
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}

	public User getUser()
	{
		return user;
	}

	public void setUser(User user)
	{
		this.user = user;
	}
	
	public OrderDetails getOrderdetails() 
	{
		return orderdetails;
	}

	public void setOrderdetails(OrderDetails orderdetails)
	{
		this.orderdetails = orderdetails;
	}

	@Override
	public String toString() 
	{
		return "Customer [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", user=" + user
				+ ", orderdetails=" + orderdetails + "]";
	}
}
