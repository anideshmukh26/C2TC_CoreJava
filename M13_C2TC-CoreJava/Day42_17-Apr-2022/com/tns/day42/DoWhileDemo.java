// Program that demonstrates do while loop.

package com.tns.day42;

public class DoWhileDemo 
{
	int i = 1, n = 10;
	
	DoWhileDemo()
	{
	    do								// do while loop from 1 to 10
	    {
	      System.out.println(i);
	      i++;
	    } while(i >= n);			// if condition fails then it only executed loop once
	}
	public static void main(String[] args) 
	{
		new DoWhileDemo();
	}
}
