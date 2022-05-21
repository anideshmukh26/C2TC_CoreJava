

package com.hibernate.shopping.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

@Table(name = "shop_owner")

public class ShopOwner implements Serializable
{
	private static final long serialVersionUID =1L;
	
	@Id
	@Column(name ="ShopOwner_ID")
	private int id;
	
	@Column(name ="ShopOwner_Name")
	private String name;
	
	@Column(name ="ShopOwner_DOB")
	private LocalDate dob;
	
	@Column(name ="ShopOwner_Address")
	private String address;
	
	@Column(name ="Shop_Id")
	private Shop shop_id;
	
	@OneToOne(mappedBy ="shopowner")
	private MallAdmin mallAdmin;
	
	public ShopOwner() {}
	
	public ShopOwner(int id, String name, LocalDate dob, String address, Shop shop_id, MallAdmin mallAdmin) 
	{
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.shop_id = shop_id;
		this.mallAdmin = mallAdmin;
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
	
	public LocalDate getDob() 
	{
		return dob;
	}
	public void setDob(LocalDate dob)
	{
		this.dob = dob;
	}
	
	public String getAddress() 
	{
		return address;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public Shop getShop_id() 
	{
		return shop_id;
	}
	
	public void setShop_id(Shop shop_id) 
	{
		this.shop_id = shop_id;
	}

	public MallAdmin getMallAdmin()
	{
		return mallAdmin;
	}

	public void setMallAdmin(MallAdmin mallAdmin)
	{
		this.mallAdmin = mallAdmin;
	}

	@Override
	public String toString() 
	{
		return "ShopOwner [id=" + id + ", name=" + name + ", dob=" + dob + ", address=" + address + ", shop_id="
				+ shop_id + ", mallAdmin=" + mallAdmin + "]";
	}
}
