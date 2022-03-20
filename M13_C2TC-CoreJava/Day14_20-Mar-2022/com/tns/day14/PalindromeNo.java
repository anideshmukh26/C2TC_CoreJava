// program to check given no. is a palindrome or not.

package com.tns.day14;

import java.util.Scanner;

public class PalindromeNo
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num= sc.nextInt();
		sc.close();
		
		int reverse=0, x, remainder;
		x=num;
		
		while(num!=0)
		{
			remainder=num %10;
			reverse=(reverse*10) + remainder;
			num= num/10;
		}
		if(x==reverse)
		{
			System.out.println("\nIt is a palindrome.");
		}
		else
		{
			System.out.println("\nIt is not a palindrome.");
		}
	}

}
