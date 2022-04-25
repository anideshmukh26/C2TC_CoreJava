// Program that demonstrates synchronization problem.

package com.tns.day50;

class TContent
{
	public void m1(String s)
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
class ThreadJob extends Thread
{
	TContent tc;
	String s;
	
	public ThreadJob(TContent tc, String s)
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
public class SyncDemo
{
	public static void main(String[] args) 
	{
		TContent tc = new TContent();
		
		new ThreadJob(tc, "Hello");
		new ThreadJob(tc, "World");
	}
}
