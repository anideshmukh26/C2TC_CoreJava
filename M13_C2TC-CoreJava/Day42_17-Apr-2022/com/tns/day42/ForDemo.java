// program that demonstrates for loop

package com.tns.day42;

public class ForDemo
{
	ForDemo()
	{
		int ages[] = {15, 18, 16, 17, 14, 12, 13, 20, 22, 25};
		int sum = 0;
		
		System.out.print("Ages of the group are : "); 
		
		for (int i = 0; i < 10 ; i++)
		{
			System.out.print(ages[i]+" ");
			sum = sum + ages[i];
		}
		System.out.println("\nAverage age of the group = " + (sum/10));
	}
	public static void main(String[] args) 
	{
		new ForDemo();
	}
}
