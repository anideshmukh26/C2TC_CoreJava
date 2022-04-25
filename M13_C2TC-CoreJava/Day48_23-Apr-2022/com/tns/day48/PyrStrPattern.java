// Program to print the pyramid string pattern in Java.

package com.tns.day48;

import java.util.Scanner;

public class PyrStrPattern
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    
		System.out.print("Enter a word: ");
	    String word = sc.nextLine();
	    
	    System.out.print("Enter number of lines: ");
	    int n = sc.nextInt();
	    int len = word.length();
	    int a = 0;

	    for(int i=0; i<=n; i++)
	    {
	        for (int j=0; j<=n-i; j++)
	        {
	           System.out.print(" "); // print space
	        }
	        for(int k=0; k<=i; k++) 
	        {
	           System.out.print(word.charAt(a)+" ");		 // print character
	           a++;

	           if(a == len) a = 0;				 // if index reach end of string then again it should start from initial characters
	        }
	        System.out.println(); 
	        sc.close();
	      }
	   }
	}