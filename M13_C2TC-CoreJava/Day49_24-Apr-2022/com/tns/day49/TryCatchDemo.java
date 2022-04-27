// Program to demonstrate try-catch block of Exception handling.

package com.tns.day49;

public class TryCatchDemo
{
	public static void main(String[] args)
	{
		try												//  try block
		{
			System.out.println("Inside block 1");
			
			int a = 6/0;
			System.out.println(a);
		}
		catch(Exception e) 								// catch block
		{
			System.out.println("Exception: "+e);
		}

	}
}
