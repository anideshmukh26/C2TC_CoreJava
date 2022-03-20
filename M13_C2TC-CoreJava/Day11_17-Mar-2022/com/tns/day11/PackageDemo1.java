// program to demonstrate Package & Explicit import

package com.tns.day11; // user defined package

//Built-in package we import one class at a time from the package i.e Explicit import (Industry Recommended).
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PackageDemo1
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your name: "); 
		
		String name= br.readLine(); 
		
		System.out.println("Your name is "+name);
	}

}
