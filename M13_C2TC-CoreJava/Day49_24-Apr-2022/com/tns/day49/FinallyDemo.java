// Program to demonstrate finally block of Exception handling.

package com.tns.day49;

public class FinallyDemo
{
	public static void main(String[] args)
	{
		try 
		{
			System.out.println("Inside block 1");
			int a= 21/0;
			System.out.println(a);	
		}
		catch(Exception e)
		{
				System.out.println("Exception: " +e);
		}
		finally												// finally block - Exception is handled or not, finally block is always executed. 
		{
			System.out.println("Finally block is executed");	
		}
	}
}
