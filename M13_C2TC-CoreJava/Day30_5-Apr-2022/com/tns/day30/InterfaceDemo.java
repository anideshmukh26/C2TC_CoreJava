// program that demonstrates interface possibilities.

package com.tns.day30;

interface A
{
	final int i;		// final variable has to be initialize.
	final int j = 1;		// final variable value is constant.
	
	public abstract void myMethod();		// abstract method
	
	A()		// interface does't have constructor
	{

	}
}
interface B extends A
{
	interface C		// nested type
	{
		
	}
}
class D extends B		// class can't extends interface
{
	
}
interface E extends D		// interface can't extends class
{
	
}
public interface InterfaceDemo extends A,B		// multiple inheritance is allowed in interface
{
	A a = new A();		// we can't create object of interface
}
