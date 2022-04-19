// Program that demonstrates Thread by extending Thread class.

package com.tns.day44;

public class ThreadDemo1 extends Thread
{
	public void run()
	{
		System.out.println("My name is Aniket");
	}
	public static void main(String[] args)
	{
		ThreadDemo1 th = new ThreadDemo1();	
		th.start();
		System.out.println(th.getName());		// To get name of thread
	}
}
