

package com.tns.day60;

abstract class Car1
{
	public void m1() 
	{
		System.out.println("This is Car");
	}
	abstract void m2();
}
abstract class Honda1 extends Car1
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

abstract class Duster1 extends Car1
{
	@Override
	void m2()
	{
		
	}
}
public class AbstractCastDemo1
{
	public static void main(String[] args)
	{
		Car c = new Car();					// we can't create object of abstract class.
		Car c1 = new Honda1();				// up casting is not possible 
		Car c2 = new Duster1(); 
		
		Honda1 h = (Honda1)c1;					// down casting is not possible	
		Duster1 d = (Duster1)c1;
		
		h.m1();
		c.m1();
	}
}
