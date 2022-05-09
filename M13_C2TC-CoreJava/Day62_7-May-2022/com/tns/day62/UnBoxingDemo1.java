// Program that demonstrates Unboxing in wrapper class in ArrayList

package com.tns.day62;

import java.util.ArrayList;

public class UnBoxingDemo1 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(7);											// Autoboxing
		
		int num = (int) arrayList.get(0);				    		// Unboxing because get method returns an Integer object
		System.out.println(num);
	}
}
	
