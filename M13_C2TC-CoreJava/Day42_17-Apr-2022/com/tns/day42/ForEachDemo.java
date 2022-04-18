// program that demonstrates for-each loop (Enhanced loop).

package com.tns.day42;

public class ForEachDemo
{
	ForEachDemo()
	{
		int ages[] = {15, 18, 16, 17, 14, 12, 13, 20, 22, 25};
		int sum = 0;
		
		System.out.print("Ages of the group are : ");
		
		// for-each loop doesn't need the number of iterations to be specified. It counted automatically as per length of array.
		for (int x : ages)						
		{
			System.out.print(x+" ");
			sum = sum + x;
		}
		System.out.println("\n Average age of the group = " + (sum/10));
	}
	public static void main(String args[])
	{
		new ForEachDemo();
	}
}
