// program to demonstrate default method example

package com.tns.day31;

public class InterfaceDemo1 implements Demo3		// Inheriting interface Demo3
{
	// overrides abstract methods m1, m2, m3 of Demo3.
	@Override
	public void m1()
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void m2()
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void m3() 
	{
		// TODO Auto-generated method stub
	}
	public void m4()	// default method of Demo2
	{
		
	}
}
interface A
{
	public default void m1()
	{
		System.out.println(" Hello");
	}
}
interface B extends A
{
	public default void m1()
	{
		System.out.println(" Hello Everyone");
	}
}
interface C extends A
{
	public default void m1()
	{
		System.out.println(" Hello Students");
	}
}
interface D extends B,C
{
	public default void m1() 
	{
		B.super.m1();		// call to super method m1 of interface B
	}
}