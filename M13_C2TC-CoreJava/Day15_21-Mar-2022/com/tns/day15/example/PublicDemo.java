// program to demonstrate public access modifier

package com.tns.day15.example;

import com.tns.day15.*;

public class PublicDemo 
{
	public static void main(String[] args)
	{
		// we can access all variable & methods of another package
		Pub p=new Pub();
		
		System.out.println("Pincode: "+p.Pincode);
		System.out.println("City: "+p.City);
		
		p.show();
		p.print();
	}
}
