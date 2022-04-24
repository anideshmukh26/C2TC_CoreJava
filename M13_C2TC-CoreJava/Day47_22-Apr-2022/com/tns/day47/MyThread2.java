

package com.tns.day47;

public class MyThread2
{
   public static void main (String [] args)
   {

      Thread currentThread = Thread.currentThread();		// Returns the instance reference of the currently executing thread.
      System.out.println(currentThread);

      MyThread mt1 = new MyThread ();
      mt1.setName("MyThreadNo1");
     
      MyThread mt2 = new MyThread();
      mt1.setName("MyThreadNo2");
      
      
      //getState() - returns the state of the thread. 
      System.out.println("Thread State of MyThreadNo1 before calling start: "+mt1.getState());  
      mt1.start ();
      mt2.start();
     
      System.out.println("Thread State of MyThreadNo1 in Main method before Sleep: " + mt1.getState());  
      System.out.println("Thread State of MyThreadNo2 in Main method before Sleep: " + mt2.getState());  
      
      try
      {
         Thread.sleep (1000);
      }
      catch (InterruptedException e)
      {
      }
      System.out.println("Thread State of MyThreadNo1 in Main method after Sleep: " + mt1.getState());  
      System.out.println("Thread State of MyThreadNo2 in Main method after Sleep: " + mt2.getState()); 
   }
}
class MyThread2i extends Thread
{
   public void run ()
   {
      System.out.println ("Run by " + Thread.currentThread().getName());
      try
      {
         Thread.sleep (100);
      }
      catch (InterruptedException e)
      {
      }
      System.out.println("Thread State of: "+ Thread.currentThread().getName()+ " - "+Thread.currentThread().getState()); 
 
      System.out.println("Exit of Thread: " + Thread.currentThread().getName());  

   }
}
