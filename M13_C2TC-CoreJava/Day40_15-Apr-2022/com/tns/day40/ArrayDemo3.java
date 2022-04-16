// Program that demonstrates simple Array Matrix

package com.tns.day40;

public class ArrayDemo3
{
	int a [][];
	
	public ArrayDemo3()
	{
		a = new int [3][3];
		
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				System.out.print(""+i+""+j+""+" \t");
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) 
	{
		new ArrayDemo3();
	}
}
