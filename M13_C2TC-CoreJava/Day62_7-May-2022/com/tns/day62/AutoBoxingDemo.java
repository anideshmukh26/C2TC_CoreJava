// Program that demonstrates Auto-boxing in wrapper class

package com.tns.day62;

public class AutoBoxingDemo 
{
	public static void main(String args[])
	{
		int num = 7; 							// primitive data type- int
		
	    Integer obj = Integer.valueOf(num); 	// creating a wrapper class object (Auto-boxing)
	    System.out.println(num + " " + obj); 
	}
}
