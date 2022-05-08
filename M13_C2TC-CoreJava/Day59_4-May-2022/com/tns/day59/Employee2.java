

package com.tns.day59;

import java.util.Comparator;

public class Employee2 implements Comparable
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

	public int getId() {
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
	
	@Override
	public int compareTo(Object o)
	{
		/* if(this.id < ((Employee2)o).id)
			return -1;
		
		if(this.id > ((Employee2)o).id)
			return 1;
		else
			return 0;  */
		
		return(this.id - ((Employee2)o).id);
	} 

	/* @Override
	public int hashCode()
	{
		return (int)id;
	} */

	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Employee2)
		{
			return ((Employee2)o).id == this.id;		
		}
		return false; 
	}
}

