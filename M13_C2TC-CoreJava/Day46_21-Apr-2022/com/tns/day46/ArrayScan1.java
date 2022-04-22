// Program that takes input from user and print 2D array.

package com.tns.day46;

import java.util.Scanner;

public class ArrayScan1 
{
	int row, col, i, j;
	int [][] array;
	
	public ArrayScan1() 
	{      
		Scanner sc=new Scanner(System.in);   
		
		System.out.print("Enter the number of rows: ");    
		row = sc.nextInt();   
		
		System.out.print("Enter the number of columns: ");    
		col = sc.nextInt();   
		
		array = new int[row][col];   
		  
		System.out.println("Enter the elements of the array: ");   
 
		for (i = 0; i < row; i++)   
		{
			for (j = 0; j < col; j++)   
			array[i][j] = sc.nextInt(); 
		}
		  
		System.out.println("Elements of the array are: ");   
		for (i = 0; i < row; i++)   
		{   
			for (j = 0; j < col; j++)   
			  
			System.out.print(array[i][j] + " ");     
			System.out.println();   
		}   
	}   
	public static void main(String[] args) 
	{
		new ArrayScan1();
	}
}
