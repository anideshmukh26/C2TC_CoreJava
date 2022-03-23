// program to demonstrate an abstract class & method.

package com.tns.day16;

abstract class A
{
	private int y;
	
	// getter & setter method to access private variable y
	public int getY()
	{
		return y;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	
	abstract void m1();
	
	void m2()
	{
		System.out.print("Welcome to...");
	}
}
class B extends A
{
	void m1()
	{
		System.out.print("C2TC program on ");
	}
}
public class AbstractDemo2
{
	public static void main(String[] args) 
	{
		B obj= new B();
		obj.m2();
		obj.m1();
		
		obj.setY(16);  // object reference to setter method for set value of y
		System.out.print("day "+obj.getY()); // object reference to getter method to print the value of y 
	}
}
