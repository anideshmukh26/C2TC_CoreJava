// Program to demonstrate an ArrayIndexOutOfBoundException (Unchecked Exception).

package com.tns.day51;

public class ArrayIndexOutOfBoundExceptionDemo 
{
	public static void main(String args[])
	{
        try 
        {
            int b[] = new int[6];
            b[8] = 2; 							// we are trying to access 9th element in an array of size 7.
        } 
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println ("The array index is out of bound: " +e);
        }
    }
}
