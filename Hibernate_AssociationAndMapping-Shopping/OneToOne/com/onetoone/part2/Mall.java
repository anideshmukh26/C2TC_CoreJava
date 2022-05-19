 

package com.onetoone.part2;

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

@Table(name = "mall")

public class Mall implements Serializable
{
	private static final long serialVersionUID =1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name =" ID")
	private long Id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="Mall_AdminID")
	private MallAdmin mallAdmin;
	
	@Column(name ="Mall_Name")
	private String mallName;
	
	@Column(name =" Location")
	private String location;

	//private Shop shop_id;
	
	@Column(name ="Catgories")
	private String categories;
	
	public Mall() {}
	
	public Mall(long id, MallAdmin mallAdmin, String mallName, String location, /* Shop shop_id,*/ String categories) 
	{
		Id = id;
		this.mallAdmin = mallAdmin;
		this.mallName = mallName;
		this.location = location;
		//this.shop_id = shop_id;
		this.categories = categories;
	}

	public long getId() 
	{
		return Id;
	}

	public void setId(long id)
	{
		Id = id;
	}

	public MallAdmin getMallAdmin() 
	{
		return mallAdmin;
	}
	
	public void setMallAdmin(MallAdmin mallAdmin)
	{
		this.mallAdmin = mallAdmin;
	}
	
	public String getMallName()
	{
		return mallName;
	}
	
	public void setMallName(String mallName)
	{
		this.mallName = mallName;
	}
	
	public String getLocation() 
	{
		return location;
	}
	
	public void setLocation(String location)
	{
		this.location = location;
	}
	
	/*public Shop getShop_id() 
	{
		return shop_id;
	}
	
	public void setShop_id(Shop shop_id) 
	{
		this.shop_id = shop_id;
	}*/
	
	public String getCategories()
	{
		return categories;
	}
	
	public void setCategories(String categories) 
	{
		this.categories = categories;
	}

	@Override
	public String toString()
	{
		return "Mall [Id=" + Id + ", mallAdmin=" + mallAdmin + ", mallName=" + mallName + ", location=" + location
				+ ", categories=" + categories + "]";
	}
}