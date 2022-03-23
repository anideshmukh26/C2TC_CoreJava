// program to demonstrate protected access modifier

package com.tns.day15;

public class Prot 
{
	public int Pincode= 400601;  
	public String City= "Thane";
	
	protected void show()
	{
		System.out.println("Welcome");
	}
	protected void print()
	{
		System.out.println("To My City");
	}
}
