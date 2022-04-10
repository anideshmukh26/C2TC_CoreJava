// Program that demonstrates equals() method.

package com.tns.day34;

public class EqualsDemo1
{
	public static void main(String[] args)
	{
		String s1 = new String(" ANIKET ");
        String s2 = new String(" ANIKET ");        
        
        // this returns false because == operator is comparing reference of objects.
        System.out.println("s1 and s2 are equal : "+(s1==s2));		
        
        // this returns true because equals() method compares content of the objects.
        System.out.println("s1 and s2 are equal : "+(s1.equals(s2))); 
 
        s1 = s2;		// this returns true because both are have the same reference.
        System.out.println("s1 and s2 are equal : "+(s1==s2));
	}
}
