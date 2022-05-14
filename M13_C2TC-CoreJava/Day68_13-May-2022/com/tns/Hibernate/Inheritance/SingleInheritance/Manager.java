

package com.tns.Hibernate.Inheritance.SingleInheritance;

public class Manager extends Employee
{
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
