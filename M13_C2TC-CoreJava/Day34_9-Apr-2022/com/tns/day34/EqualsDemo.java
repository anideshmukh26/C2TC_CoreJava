// Program that demonstrates == operator.

package com.tns.day34;

public class EqualsDemo
{
	public static void main(String[] args)
	{
		int num1 = 11;
		int num2 = -6;
		int num3 = 11;
		
		if(num1 == num2)		// == (equals) operator
		{
			System.out.println(" num1 & num2 are equal. ");
		}else
		{
			System.out.println(" num1 & num2 are not equal. ");
		}
		if(num3 == num1)
		{
			System.out.println(" num3 & num1 are equal. ");
		}else
		{
			System.out.println(" num1 & num3 are not equal. ");
		}
	}
}
