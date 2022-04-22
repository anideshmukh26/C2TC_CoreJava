// Program that takes input from user and print sum of elements of array.

package com.tns.day46;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScan2
{
	int [] array;
	int length, sum = 0;
	
	public ArrayScan2()
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the length of the array:");
	    
		int length = sc.nextInt();
		array = new int[length];
	    
	    System.out.println("Enter the elements of the array:");

        for(int i=0; i<length; i++ ) 
        {
        	array[i] = sc.nextInt();  
	         sum = sum + array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Sum of elements of array :"+sum);
        sc.close();
     }
	public static void main(String[] args) 
	{
		new ArrayScan2();
	}
}