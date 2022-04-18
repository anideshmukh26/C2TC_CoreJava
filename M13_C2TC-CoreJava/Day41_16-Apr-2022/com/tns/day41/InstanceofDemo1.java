// Program that demonstrates  instanceof operator for check instance of parent & child class.

package com.tns.day41;

class Parent
{
	
}
public class InstanceofDemo1 extends Parent
{
	public static void main(String[] args)
	{
		InstanceofDemo1 obj = new InstanceofDemo1();
		
		// checks obj is instance of child class or not
		if(obj instanceof InstanceofDemo1)											// return true				
			System.out.println("obj is instance of child");
		else 
			System.out.println("obj is not instance of child");
		
		// checks obj is instance of parent class or not
		if(obj instanceof Parent)													// return true
			System.out.println("obj is instance of parent");
		else
			System.out.println("obj is not instance of child");
		
		// checks obj is instance of object class(super class of java) or not
		if(obj instanceof Object)													// return true
			System.out.println("obj is instance of object class");
		else
			System.out.println("obj is not instance of object class");
	}
}
