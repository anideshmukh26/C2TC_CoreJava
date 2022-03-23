// program to demonstrate private scope can't access from outside package

package com.tns.day15.example;

import com.tns.day15.*;

public class PrivateDemo
{
	public static void main(String[] args)
	{
		Pvt pv=new Pvt();
		
		// we can't access private variables & methods outside class & package
		System.out.println("Pincode: "+pv.Pincode);
		System.out.println("City: "+pv.City);
		
		pv.show();
	}
}
