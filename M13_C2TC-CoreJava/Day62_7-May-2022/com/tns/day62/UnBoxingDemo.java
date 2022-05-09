// Program that demonstrates Unboxing in wrapper class

package com.tns.day62;

public class UnBoxingDemo
{
	public static void main(String args[]) 
	{
		Integer obj = new Integer(7); 				// Creating Wrapper class object
		
		int num = obj.intValue(); 					// Converting the wrapper object to primitive datatype
		
	    System.out.println(num + " " + obj);
	}
}