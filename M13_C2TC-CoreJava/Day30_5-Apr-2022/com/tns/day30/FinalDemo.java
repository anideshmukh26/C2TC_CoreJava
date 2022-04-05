// program that demonstrates final keyword possibilities

package com.tns.day30;

final class F
{
	
}
class E extends F		// we can't inherit final class
{
	public final void speed()
	{
		
	}
}
public class FinalDemo extends E
{
	public final void speed()		// we can't override final method
	{
		
	}
	public static void main(String[]args)
	{
		final int i = 2;		// final variable with constant value
		i = 5;		//we can't change the value of i
	}

}
