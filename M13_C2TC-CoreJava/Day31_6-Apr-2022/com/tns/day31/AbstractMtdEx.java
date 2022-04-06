// program that demonstrates 4 ways to use abstract methods in interface.

package com.tns.day31;

public interface AbstractMtdEx
{
	// Implicitly abstract methods in interface
	public abstract void m1();		// abstract method with public & abstract keyword.
	
	public void m2();		// abstract method with public keyword only.	
	
	abstract void m4();		// abstract method with abstract keyword only.

	void m3();		// abstract method without both public & abstract keyword.		
}
