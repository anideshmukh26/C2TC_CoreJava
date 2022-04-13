// Program to demonstrate Simple ArrayDemo

package com.tns.day38;

public class ArrayDemo 
{    
	ArrayDemo()
	{
		int[] array;		// Declares an array of integers
		 
		 array = new int[5];		// Create an array of size/length 5
		 
		 // Initialization of an array
		 array[0] = 10;
		 array[1] = 15;
		 array[2] = 20;
		 array[3] = 25;
		 array[4] = 30;
		 
		 System.out.println("Element 1 at index 0 : "+ array[0]);
		 System.out.println("Element 2 at index 1 : "+ array[1]);
		 System.out.println("Element 3 at index 2 : "+ array[2]);
		 System.out.println("Element 4 at index 3 : "+ array[3]);
		 System.out.println("Element 5 at index 4 : "+ array[4]); 
	}
	public static void main(String[] args) 
	{
		 new ArrayDemo();
	}
}
