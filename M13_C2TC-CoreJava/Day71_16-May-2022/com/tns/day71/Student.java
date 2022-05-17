

package com.tns.day71;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "Student")

public class Student 
{
	@Id
	@Column(name ="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	
	@Column(name ="Name")
	private String studentName;
	
	@Column(name ="Marks")
	private int studentMarks;
	
	public Student() {}

	public Student(int studentId, String studentName, int studentMarks)
	{
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}

	public int getStudentId() 
	{
		return studentId;
	}

	public void setStudentId(int studentId) 
	{
		this.studentId = studentId;
	}

	public String getStudentName() 
	{
		return studentName;
	}

	public void setStudentName(String studentName)
	{
		this.studentName = studentName;
	}

	public int getStudentMarks() 
	{
		return studentMarks;
	}

	public void setStudentMarks(int studentMarks) 
	{
		this.studentMarks = studentMarks;
	}
}
