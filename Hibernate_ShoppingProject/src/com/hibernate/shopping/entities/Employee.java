

package com.hibernate.shopping.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

@Table(name = "employee")

public class Employee implements Serializable
{
	private static final long serialVersionUID =1L;
	
	@Id
	@Column(name ="Emp_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name ="Emp_Name")
	private String name;
	
	@Column(name ="Emp_DOB")
	private LocalDate dob;
	
	@Column(name ="Emp_salary")
	private float salary;
	
	@Column(name ="Emp_Address")
	private String address;
	
	@Column(name ="Designation")
	private String designation;
	
	//@ManyToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name ="ShopEmp_Id")
	private Shop shop;
	
	public Employee() {}
	
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
	
	public float getSalary() 
	{
		return salary;
	}
	
	public void setSalary(float salary) 
	{
		this.salary = salary;
	}
	
	public String getAddress() 
	{
		return address;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public String getDesignation() 
	{
		return designation;
	}
	
	public void setDesignation(String designation)
	{
		this.designation = designation;
	}

}
