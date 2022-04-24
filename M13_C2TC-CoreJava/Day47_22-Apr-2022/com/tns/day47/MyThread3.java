

package com.tns.day47;

public class MyThread3 
{
	   public static void main(String[] args) 
	   {
		   Thread t = Thread.currentThread();
		   t.setName("Hello Thread");
		   
		   t.setPriority(1);		// set thread priority to 1
		   System.out.println("Thread = " + t);
		  
		   int priority= t.getPriority();
		   System.out.println("Thread priority= " + priority); 
		   
		   int count = Thread.activeCount();
		   System.out.println("currently active threads = " + count);
	   }
	}