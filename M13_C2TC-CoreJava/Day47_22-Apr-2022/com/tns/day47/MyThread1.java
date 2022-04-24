// Program that demonstrates setName & getName method of Thread.

package com.tns.day47;


public class MyThread1
{
   public static void main (String [] args)
   {
      MyThread mt;
      if (args.length == 0)
          mt = new MyThread ("MyThreadName");		// Returns thread name as MyThreadName
      else
          mt = new MyThread (args [0]);				// Returns thread name as Thread-0
      mt.start ();
   }
}
class MyThread extends Thread
{
   MyThread ()
   {
      // The compiler creates the byte code equivalent of super ();
   }
   MyThread (String name)
   {
      setName (name);			// Pass name to Thread superclass
   }
   public void run ()
   {
      System.out.println ("My name is: " + getName ());
   }
}

