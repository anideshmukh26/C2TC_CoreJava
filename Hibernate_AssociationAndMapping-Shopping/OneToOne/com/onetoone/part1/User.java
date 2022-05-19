// OneToOne Mapping.

package com.onetoone.part1;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

@Table(name = "user")

public class User implements Serializable
{
	private static final long serialVersionUID =1L;
	
	@Id
	@Column(name = "UserID")
	private int id;
	
	@Column(name = "UserName")
	private String name;
	
	@Column(name = "UserType")
	private String type;
	
	@Column(name = "Password")
	private String password;
	
	@OneToOne(mappedBy ="userName")
	private Customer customer;
	
	public User() {}
	
	public User(int id, String name, String type, String password) 
	{
		this.id = id;
		this.name = name;
		this.type = type;
		this.password = password;
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
	
	public String getType() 
	{
		return type;
	}
	
	public void setType(String type) 
	{
		this.type = type;
	}
	
	public String getPassword() 
	{
		return password;
	}
	
	public void setPassword(String password) 
	{
		this.password = password;
	}

	@Override
	public String toString() 
	{
		return "User [id=" + id + ", name=" + name + ", type=" + type + ", password=" + password + ", customer="
				+ customer + "]";
	}
}
