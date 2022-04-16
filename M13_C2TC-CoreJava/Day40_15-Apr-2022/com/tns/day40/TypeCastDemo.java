

package com.tns.day40;

class Car
{
	Car car;
	public void start()
	{
		System.out.println(" I am in start method of Car ");
	}
	public Car getCar() 
	{
		System.out.println(" I want car object ");
		return car;
	}
	public void stop()
	{
		System.out.println(" I am in stop method of Car ");
	}
}
class Maruti extends Car
{
	Maruti m;
	
	@Override
	public void start()
	{
		System.out.println(" I am in start method of maruti Car ");
	}
	public Maruti getCar1()
	{
		System.out.println(" I want maruti car object ");
		return m;
	}
}
class Duster extends Car
{
	Duster d;
	public Duster getCar()
	{
		System.out.println(" I am duster ");
		return d;
	}
}
public class TypeCastDemo 
{
	public static void main(String[] args) 
	{
		//Maruti m = new Maruti();
		Car c = new Maruti();		// Up casting
		Maruti m = (Maruti) c;		// down casting
	
		Car x = new Duster();
		c.start();
		x.start();
		m.getCar1();
	}
}
