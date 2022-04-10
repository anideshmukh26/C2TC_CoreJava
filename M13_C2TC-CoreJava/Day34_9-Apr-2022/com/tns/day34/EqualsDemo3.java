//  Program that demonstrates equals() Method in Java Numeric Data Types

package com.tns.day34;

public class EqualsDemo3
{
	public static void main(String[] args) 
	{
		Long lng1 = 15l;
        Long lng2 = 15l;    
        Double dbl1 = 21.5d;
        Double dbl2 = 10.0d;
         
        // This returns true as both the Long objects have the same values i.e.15l
        System.out.println("lng1 and lng2 are equal : "+(lng1.equals(lng2)));  
        
        // This returns false as the Double objects have different floating number values i.e. 21.5d and 10.0d
        System.out.println("dbl1 and dbl2 are equal : "+(dbl1.equals(dbl2)));
	}
}
