

package com.tns.day58;

public class Employee2
{
	int id;
	String name;
	double salary;
	
	public Employee2()
	{
		
	}
	public Employee2(int id, String name, double salary) 
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	public boolean equals(Object o)
	{
		if(o instanceof Employee2)
		{
			return ((Employee2)o).id==this.id;
		}
		return false;
		
	}
	public int hashcode()
	{
		return id;
	}
	
	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

	
	

}
