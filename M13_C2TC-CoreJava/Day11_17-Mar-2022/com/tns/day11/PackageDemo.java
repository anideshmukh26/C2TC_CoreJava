// program to demonstrate Package & Implicit import

package com.tns.day11;  // user defined package

import java.io.*; // Built-in package by using * we can import many classes from the package i.e Implicit import.

// java.lang is default package in java, which is automatically imported by compiler if not imported by programmer

public class PackageDemo
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your name: "); 
		
		String name= br.readLine(); 
		
		System.out.println("Your name is "+name);
	}

}
