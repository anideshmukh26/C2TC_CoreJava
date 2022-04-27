// Program to demonstrate the ArithmeticException (Unchecked Exception).

package com.tns.day51;

public class ArithmeticExceptionDemo
{
	public static void main(String args[])
	{
        try
        {
            int p = 11, q = 0;
            int r = p/q;  								// It cannot be divided by zero
            System.out.println ("Result = " +r);
        } 
        catch(ArithmeticException e) 
        {
            System.out.println ("Number cannot be divided by 0 "+e);
        }
    }
}
