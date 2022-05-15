// Hibernate - Joined Two Tables Inheritance.

package com.tns.day70.hibernate.inheritance.joinedinheritance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

@Table(name = "manager2")

public class Manager extends Employee
{
	private static final long serialVersionUID =1L;
	
	@Column(name = "Department_Name")
	private String deptName;
	
	public Manager() {}
	
	public Manager(String deptName) 
	{
		this.deptName = deptName;
	}

	public String getDepartmentName() 
	{
		return deptName;
	}

	public void setDepartmentName(String deptName)
	{
		this.deptName = deptName;
	}
}
