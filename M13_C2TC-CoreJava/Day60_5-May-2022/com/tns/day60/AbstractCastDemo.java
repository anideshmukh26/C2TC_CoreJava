

package com.tns.day60;

abstract class Car
{
	public void m1() 
	{
		System.out.println("This is Car");
	}
	abstract void m2();
}
class Honda extends Car
{
	void start()
	{
		System.out.println("Honda car is start.");
	}
	public void m1() 
	{
		System.out.println("This is Honda Car");
	}
	@Override
	void m2() 
	{
		
	}
}

class Duster extends Car
{
	@Override
	void m2()
	{
		
	}
}
public class AbstractCastDemo
{
	public static void main(String[] args)
	{
		// Car c = new Car();					// we can't create object of abstract class.
		Car c1 = new Honda();				// up casting	
		Car c2 = new Duster();
		
		Honda h = (Honda)c1;					// down casting 	
		Duster d = (Duster)c1;
		
		h.m1();
		c1.m1();
	}
}
