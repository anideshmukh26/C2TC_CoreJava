// program that demonstrates final keyword possibilities

package com.tns.day30;

final class F
{
	final int i=1;		// final variable having constant value		
	i=2;		// we can't change value of final variable 		
}
class G extends F		// we can't extends final class
{
	public final void speed()
	{
		
	}
}
public class FinalDemo extends G
{	
	public final void speed()		// we can't override final method
	{
		
	}
}
