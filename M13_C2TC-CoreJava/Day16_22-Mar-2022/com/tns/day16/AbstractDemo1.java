// program to demonstrate an abstract class & method.

package com.tns.day16;

abstract class Demo  // abstract class 
{	
	abstract void myMethod1(); // abstract method
	
	void myMethod2()
	{
		System.out.println("Everyone");
	}
	abstract void myMethod3();
}
class Ex extends Demo     // inherit the parent abstract class to provide implementation to its abstract methods
{
	// override abstract methods of abstract class 
	void myMethod1()  
	{
		System.out.println("Hello");
	}
	void myMethod3()
	{
		System.out.println("My name is Aniket");
	}
}
public class AbstractDemo1
{
	public static void main(String[] args)
	{
		Ex obj= new Ex(); // instantiate object of subclass EX
		
		// object reference for methods
		obj.myMethod1();
		obj.myMethod2();
		obj.myMethod3();
	}

}
