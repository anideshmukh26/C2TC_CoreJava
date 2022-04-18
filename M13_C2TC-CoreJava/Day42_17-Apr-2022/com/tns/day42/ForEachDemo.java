// program that demonstrates for-each loop (Enhanced loop).

package com.tns.day42;

public class ForEachDemo
{
	ForEachDemo()
	{
		int ages[] = {15, 18, 16, 17, 14, 12, 13, 20, 22, 25};
		int sum = 0;
		
		System.out.print("Ages of the group are : ");
		
		for (int x : ages)						// In for-each loop does not need the number of iterations to be specified.
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
