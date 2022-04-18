//Program that demonstrates a simple enum example where enum is declared outside any class.

package com.tns.day43;

// we use enum keyword instead of class keyword
enum Color
{
	RED,
	YELLOW,
	BLACK;
}
public class EnumDemo
{
	public static void main(String[] args) 
	{
		Color c1 = Color.RED;
		System.out.println(c1);
		
		Color c2 = Color.YELLOW;
		System.out.println(c2);
	}
}
