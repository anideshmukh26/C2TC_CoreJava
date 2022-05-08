

package com.tns.day59;

import java.util.Vector;

public class GenericDemo
{
	public static void main(String[] args) 
	{
		Vector <Employee2> v = new Vector <Employee2>();
		String s = new String("Aniket");
		
		Employee2 e1 = new Employee2(1, "Aniket", 21000);
		
		//v.add(s);
		v.add(e1);
		//v.add(6);
		System.out.println(v);
		
	}
}
