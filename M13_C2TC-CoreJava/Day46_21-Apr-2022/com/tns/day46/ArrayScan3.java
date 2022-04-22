// Program that Find the Largest Number in an Array.

package com.tns.day46;

import java.util.Scanner;

public class ArrayScan3 
{
	int no, max;
	int [] array;
	
	public ArrayScan3()
	{
		 Scanner sc = new Scanner(System.in);
		 
		  System.out.print("Enter number of elements in the array:");
		  no = sc.nextInt();
		  
		  array = new int[no];
		   
		  System.out.println("Enter elements of array:");
		    
		  for(int i = 0; i < no; i++)
		  {
			  array[i] = sc.nextInt();
		  }
		  max = array[0];
		  
		  for(int i = 0; i < no; i++)
		  {
			  if(max < array[i])
		      {
				  max = array[i];
		      }
		  }
		  System.out.println("Maximum value: " +max);
		  sc.close();
	}
	public static void main(String[] args) 
	{
		new ArrayScan3();
	}
}
