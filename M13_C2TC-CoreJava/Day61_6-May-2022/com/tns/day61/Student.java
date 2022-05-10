

package com.tns.day61;

public class Student
{
	int id;
	String name;
	double marks;
	
	public Student() {}

	public Student(int id, String name, double marks) 
	{
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public boolean equals(Object o) 
	{
		if(o instanceof Student)
		{
			return ((Student)o).id ==this.id;
		}
		return false;	
	}

	@Override
	public String toString()
	{
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}	
}
