// try to access default scope method from another package

package com.tns.day15.example;

import com.tns.day15.*; // import another package

class DefaultDemo
{
	public static void main(String[] args)
	{
		DefaultDemo dd= new DefaultDemo();
		
		dd.msg();  // we can't access msg() method from outside package
	}
}
