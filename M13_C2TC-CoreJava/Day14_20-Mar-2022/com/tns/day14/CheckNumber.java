// program to check user's given number is positive number or negative number.

package com.tns.day14;

import java.util.Scanner;

public class CheckNumber
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number to check: ");
		int num= sc.nextInt();
		sc.close();
		
		if(num>0)
		{
			System.out.println(num+" is Positive Number.");
		}else if(num<0)
		{
			System.out.println(num+" is Negative Number.");
		}else
		{
			System.out.println(num+" is equal to Zero");
		}
	}
}
