// Program that checks Equality between two array.

package com.tns.day46;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScan4
{
	int [] x = new int[5];
	int [] y = new int[5];
		
	public ArrayScan4()
	{
		Scanner sc = new Scanner(System.in);
		
		 x = new int[5];
		 y = new int[5];
			
		System.out.println("Enter five elemnts of first array: ");
		for(int i=0; i < x.length; i++)
		{
			x[i] = sc.nextInt();	
		}
			
		System.out.println("Enter five elemnts of second array: ");
		for(int i=0; i < y.length; i++)
		{
			 y[i] = sc.nextInt();
		}
		
		if(Arrays.equals(x,y)) 
		{
			System.out.println("Arrays Are equal");
		}
		else
		{
			System.out.println("Arrays Are not equal");
		}
		
		sc.close();
	}
	public static void main(String[] args)
	{
		new ArrayScan4();
	}
}
