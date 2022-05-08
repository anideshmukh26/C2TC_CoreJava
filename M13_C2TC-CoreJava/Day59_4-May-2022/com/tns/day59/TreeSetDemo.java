
package com.tns.day59;

import java.util.TreeSet;

public class TreeSetDemo 
{
	public static void main(String[] args) 
	{
		TreeSet ts1 = new TreeSet();
		
		Employee2 e1 = new Employee2(1, "Aniket", 21000);
		Employee2 e2 = new Employee2(1, "Aniket", 21000);
		Employee2 e3 = new Employee2(2, "Roshan", 11000);
		Employee2 e4 = new Employee2(3, "Chetan", 19000);
		Employee2 e5 = new Employee2(4, "Jyoti", 25000);
		Employee2 e6 = new Employee2(5, "Naseer", 20000);
		Employee2 e7 = new Employee2(6, "Rushi", 26000);
		Employee2 e8 = new Employee2(7, "Siddhu", 15000);
		Employee2 e9 = new Employee2(8, "Bhavesh", 10000);
		
		ts1.add(e6);
		ts1.add(e4);
		ts1.add(e1);
		ts1.add(e8);
		ts1.add(e2);
		
		System.out.println(ts1);	
	}
}
