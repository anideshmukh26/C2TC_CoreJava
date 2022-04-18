// Program that demonstrates instanceof with a Variable that has a Null Value.

package com.tns.day41;

public class InstanceofDemo3
{
	public static void main(String[] args)
	{
		InstanceofDemo3 id = null;		// variable with null value
		
		System.out.println(id instanceof InstanceofDemo3);		// return false.
	}
}
