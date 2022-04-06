

package com.tns.day31;

public interface Demo3 
{
	// abstract methods
	void m1();
	void m2();
	void m3();
	
	default void m4()		// default method (they are implicitly public)
	{
		System.out.println(" Hello ");
	}
}
