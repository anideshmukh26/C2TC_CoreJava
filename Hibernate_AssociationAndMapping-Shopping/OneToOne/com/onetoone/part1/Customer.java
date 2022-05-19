// OneToOne Mapping.

package com.onetoone.part1;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

@Table(name = "customer")

public class Customer implements Serializable
{
	private static final long serialVersionUID =1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name =" ID")
	private int id;
	
	@Column(name = "Name")
	private String name;
	
	//private OrderDetails order_id;
	
	@Column(name = "PhoneNo")
	private String phone;
	
	@Column(name = "EmailID")
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="User_Id")
	private User userName;
	
	public Customer() {}

	public Customer(int id, String name, /*OrderDetails order_id,*/ String phone, String email) 
	{
		this.id = id;
		this.name = name;
		//this.order_id = order_id;
		this.phone = phone;
		this.email = email;
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
	
	/*public OrderDetails getOrder_id() 
	{
		return order_id;
	}

	public void setOrder_id(OrderDetails order_id) 
	{
		this.order_id = order_id;
	} */

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
	
	public User getUserName() 
	{
		return userName;
	}
	
	public void setUserName(User userName) 
	{
		this.userName = userName;
	}

	@Override
	public String toString() 
	{
		return "Customer [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}
}