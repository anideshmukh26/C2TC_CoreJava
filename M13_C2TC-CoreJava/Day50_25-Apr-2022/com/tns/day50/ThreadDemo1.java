// Program to demonstrate priorities in multi-threading  using getPriority() & setPriority() method

package com.tns.day50;

public class ThreadDemo1 extends Thread
{
	public void run()
	{
		System.out.println("Inside run method");
	}
	public static void main(String[] args)
	{
		ThreadDemo1 t1 = new ThreadDemo1();
		ThreadDemo1 t2 = new ThreadDemo1();
		ThreadDemo1 t3 = new ThreadDemo1();
		
		
		// Default priority for the main thread is always 5
		System.out.println("t1 thread priority : "+ t1.getPriority());		// Display the priority of thread 1.

		System.out.println("t2 thread priority : "+ t2.getPriority());		// Display the priority of thread 2.

		System.out.println("t3 thread priority : "+ t3.getPriority());		// Display the priority of thread 3.

		// Setting priorities of threads by passing integer arguments
		t1.setPriority(2);
		t2.setPriority(5);
		t3.setPriority(8);

		System.out.println("\nt1 thread priority set is: "+ t1.getPriority());

		System.out.println("t2 thread priority sey is: "+ t2.getPriority());

		System.out.println("t3 thread priority set is: "+ t3.getPriority());
		
		// Displays the name of currently executing Thread
		System.out.println("\nCurrently Executing Thread : "+ Thread.currentThread().getName());
		
		System.out.println("Main thread priority : "+ Thread.currentThread().getPriority());

		Thread.currentThread().setPriority(10);		// Main thread priority is set to 10

		System.out.println("Main thread priority set is : "+ Thread.currentThread().getPriority());
	}
}

