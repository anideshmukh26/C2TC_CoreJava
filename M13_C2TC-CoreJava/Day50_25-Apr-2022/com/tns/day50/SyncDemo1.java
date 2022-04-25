// Program that demonstrates synchronization problem solution.

package com.tns.day50;

class TContent1
{
	public synchronized void m1(String s)			// using synchronized keyword.
	{
		System.out.println("{");
		System.out.println(s);
		
		// delay
		try
		{
			Thread.sleep(200);
		}
		catch(Exception e)
		{
		}
		System.out.println("}");
	}
}
class ThreadJob1 extends Thread
{
	TContent1 tc;
	String s;
	
	public ThreadJob1(TContent1 tc, String s)
	{
		this.tc = tc;
		this.s = s;
		
		start();
	}
	public void run()
	{
		tc.m1(s);
	}
}
public class SyncDemo1
{
	public static void main(String[] args) 
	{
		TContent1 tc = new TContent1();
		
		new ThreadJob1(tc, "Hello");		
		new ThreadJob1(tc, "World");
	}
}