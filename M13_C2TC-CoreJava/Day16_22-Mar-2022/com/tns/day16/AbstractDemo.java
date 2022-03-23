// Program to demonstrate applicability of an abstract keyword.

package com.tns.day16;

//abstract keyword in java applicable only for class & method 
abstract class X  // abstract class
{
	abstract a=10; // abstract keyword can't applicable for variables.

	abstract void m1();  // abstract method which don't have any implementation(no body),followed by semi-colon

	void m2() // non-abstract method 
	{
		System.out.println("Hello");
	}
	
	abstract final void m3();   // we can't use final keyword with abstract method
	abstract static void m4();    // we can't use static keyword with abstract method                 
	
	abstract public void m5(); // only public & protected modifier is use with abstract method
	
	abstract X()  //can't define constructor with abstract keyword
	{
		
	}
}
public class AbstractDemo 
{
	public static void main(String[] args)
	{
		X obj= new X(); // we can't instantiate object of abstract class 
		
	}
}
