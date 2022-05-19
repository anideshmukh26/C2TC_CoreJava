package com.onetoone.part2;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

@Table(name = "mall_admin")

public class MallAdmin implements Serializable
{
	private static final long serialVersionUID =1L;
	
	@Id
	@Column(name =" ID")
	private int id;
	
	@Column(name =" Name")
	private String name;
	
	@Column(name ="Password")
	private String password;
	
	@OneToOne(mappedBy ="mallAdmin")
	private Mall mall;
	
	@Column(name ="PhoneNo")
	private String phone;
	
	public MallAdmin() {}
	
	public MallAdmin(int id, String name, String password, Mall mall, String phone) 
	{
		this.id = id;
		this.name = name;
		this.password = password;
		this.mall = mall;
		this.phone = phone;
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
	
	public String getPassword() 
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public Mall getMall() 
	{
		return mall;
	}
	
	public void setMall(Mall mall)
	{
		this.mall = mall;
	}
	
	public String getPhone()
	{
		return phone;
	}
	
	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	@Override
	public String toString()
	{
		return "MallAdmin [id=" + id + ", name=" + name + ", password=" + password + ", mall=" + mall + ", phone="
				+ phone + "]";
	}
}

