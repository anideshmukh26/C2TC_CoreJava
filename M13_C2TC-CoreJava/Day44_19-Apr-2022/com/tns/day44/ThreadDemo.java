// Program that demonstrates Thread by implementing Runnable interface.

package com.tns.day44;

public class ThreadDemo implements Runnable//extends Thread
{
	public void run()
	{
		System.out.println("My name is Aniket");
	}
	public static void main(String[] args)
	{
		//ThreadDemo th = new ThreadDemo();	
		Thread t = new Thread(new ThreadDemo());  // Using the constructor Thread(Runnable r)  
		t.start();
		System.out.println(t.getName());		// To get name of thread
	}
}
