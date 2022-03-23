// program to demonstrate protected access modifier can access outside package using inheritance

package com.tns.day15.example;

import com.tns.day15.*;

class ProtectedDemo extends Prot
{
	public static void main(String[] args)
	{
		ProtectedDemo pd= new ProtectedDemo();
		
		System.out.println(pd.Pincode);
		System.out.println(pd.City);
		
		pd.show();
		pd.print();
	}
}
