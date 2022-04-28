// Program that demonstrates Vector of Collection Framework.

package com.tns.day52;

import java.util.Vector;

public class VectorDemo
{
	public static void main(String[] args)
	{
		Vector v1 = new Vector();
		Vector v2 = new Vector();
		
		String s1 = new String("Aniket");
		String s2 = new String("Aniket");
		
		Employee e1 = new Employee(1, "Aniket", 21000);
		Employee e2 = new Employee(1, "Aniket", 21000);
		Employee e3 = new Employee(2, "Rushi", 15000);
		
		v1.add(s1);
		v2.add(e1);
		
		// Vector checks logical equality (Content/ data). 
		System.out.println(v1.contains(s2));		// return true.			
		System.out.println(v2.contains(e2));		// return true.
		System.out.println(v2.contains(e3));		// return false.
	}
}
 