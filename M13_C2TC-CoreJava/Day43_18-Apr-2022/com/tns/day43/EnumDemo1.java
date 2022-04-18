// Program that demonstrates enum declaration inside a class.

package com.tns.day43;

public class EnumDemo1 
{
		enum Color 
		{
			RED,
			YELLOW,
			BLACK;
		}
		
		public static void main(String[] args)
		{
			Color c3 = Color.BLACK;
			System.out.println(c3);
		}
}
