// Program to demonstrate throw keyword in Exception Handling.

package com.tns.day49;

public class ThrowDemo
{
	public static void divideByZero()
	{
		throw new ArithmeticException("Trying to divide by 0");			// throw an exception
	}
	public static void main(String[] args) 
	{
		divideByZero();
	}
}
