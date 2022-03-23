// program to demonstrate public access modifier can access from anywhere 

package com.tns.day15;

public class Pub //public class
{
	// variables & methods declare as public
	public int Pincode= 400601;  
	public String City= "Thane";
	
	public void show()
	{
		System.out.println("Welcome");
	}
	public void print()
	{
		System.out.println("To My City");
	}
}
