// program that prints fibonacci series by taking input from user

package com.tns.day14;

import java.util.Scanner;

public class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number: ");
		int count= sc.nextInt();
		sc.close();
		
		System.out.println("\nFibonacci Series prints till "+count+"th position");
		int n1=0, n2=1, n3,i;
		System.out.print(n1 + " " + n2 );
		for(i=2; i<count; i++)
		{
			n3= n1+n2;
			System.out.print(" "+ n3);
			n1=n2;
			n2=n3;
		}
	}
}