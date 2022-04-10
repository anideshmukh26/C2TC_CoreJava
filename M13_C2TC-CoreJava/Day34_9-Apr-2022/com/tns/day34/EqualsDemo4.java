//  Program that demonstrates equals() method in Java Boolean Data Type

package com.tns.day34;

public class EqualsDemo4 
{
	public static void main(String[] args) 
	{
		Boolean b1 = true;
        Boolean b2 = new Boolean(true);    
        Boolean b3 = false;
         
        
        // This returns true as Boolean objects both b1 and b2 have the same boolean value i.e. true
        System.out.println("bln1 and bln2 are equal : "+(b1.equals(b2)));  
        
        //  This returns true as Boolean objects b1 and b3 have different boolean values i.e. true and false
        System.out.println("bln1 and bln3 are equal : "+(b1.equals(b3)));
        
        // This returns true as Boolean objects b1 and b3 have different boolean values i.e. true and false
        System.out.println("bln2 and bln3 are equal : "+(b2.equals(b3)));
	}
}