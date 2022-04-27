

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
		
		v1.add(s1);
		v2.add(e1);
		
		// checks logical equality. (Content) 
		System.out.println(v1.contains(s2));		// returns true.			
		System.out.println(v1.contains(e2));
	}
}
 