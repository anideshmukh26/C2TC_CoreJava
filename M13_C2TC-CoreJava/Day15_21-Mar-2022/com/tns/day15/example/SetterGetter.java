//program to demonstrate Setter & Getter Method

package com.tns.day15.example;

class A
{
	private int x; // private- restricted access
	
	// for accessing private variable we have to use Setter & Getter method
	public int getX()
	{
		return x;
	}
	public void setX(int x) 
	{
		this.x = x;
	}
}
public class SetterGetter
{
	public static void main(String[] args)
	{
		A obj=new A();
		
		obj.setX(5); // set value for x
		System.out.println("Value of x: "+obj.getX()); // get value of x
	}
}
