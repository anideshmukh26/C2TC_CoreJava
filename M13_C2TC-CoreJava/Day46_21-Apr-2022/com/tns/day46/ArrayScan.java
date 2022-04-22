// Program that takes input from user and print 1D array.

package com.tns.day46;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScan
{
	int [] array;
	int length;
	
	public ArrayScan()
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the length of the array:");
	    
		length = sc.nextInt();
	    array = new int[length];
	    
	    System.out.println("Enter the elements of the array:");

        for(int i=0; i<length; i++ ) 
        {
	         array[i] = sc.nextInt();   
        }
        System.out.println(Arrays.toString(array));
        sc.close();
     }
	public static void main(String[] args) 
	{
		new ArrayScan();
	}
}
