

package com.tns.day59;

class Test<T> 						// Generic class
{
	T t;
	Test(T t)						// constructor
	{
		this.t = t; 
	} 
	public T getObject() 
	{ 
		return this.t;
	}
}
public class GenericDemo1
{
	public static void main(String[] args)
	{
		// instance of Integer type
		Test <Integer> ti= new Test<Integer>(15);
		System.out.println(ti.getObject());

		// instance of String type
		Test<String> ts = new Test<String>("Aniket");
		System.out.println(ts.getObject());
	}
}
