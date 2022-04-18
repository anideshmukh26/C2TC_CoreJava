// Program that demonstrates while loop.

package com.tns.day42;

public class WhileDemo 
{
	int i = 1, n = 7;
	
	WhileDemo()
	{
	    while(i <= n)				// while loop from 1 to 7
	    {
	      System.out.println(i);
	      i++;
	    }
	}
	
	public static void main(String[] args)
	{
		new WhileDemo();
	}
}
