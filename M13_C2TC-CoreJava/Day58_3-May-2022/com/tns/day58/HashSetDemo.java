

package com.tns.day58;

import java.util.HashSet;

public class HashSetDemo 
{
	public static void main(String[] args)
	{
		Employee2 e1 = new Employee2(1,"Aniket",15000);
		Employee2 e2 = new Employee2(1,"Roshan",15000);
		
		HashSet hs = new HashSet();
		hs.add(e1);
		
		System.out.println(hs.contains(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}
}
