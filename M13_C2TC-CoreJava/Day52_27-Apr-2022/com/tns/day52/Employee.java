// class Employee for class VectorDemo.

package com.tns.day52;

public class Employee
{
	int id;
	String name;
	double salary;
	
	public Employee()
	{
	}

	public Employee(int id, String name, double salary)
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
	public String toString() 
	{
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Employee)
		{
			return ((Employee)o).id == this.id;			// checks equality of employee id.
		}
		return false; 
	}
}
