

package com.tns.day50;

class NonSyncMethod1
{
    public synchronized void printNumbers()
    {
        System.out.println("Starting to print Numbers for " + Thread.currentThread().getName());

        for (int i = 0; i < 5; i++)
        {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        System.out.println("Completed printing Numbers for " + Thread.currentThread().getName());
    }
}
class ThreadOne1 extends Thread 
{
	NonSyncMethod1 nsm;

    public ThreadOne1(NonSyncMethod1 nsm) 
    {
        this.nsm = nsm;
       
        setName("ThreadOne");
        start();
    }
    public void run() 
    {
        nsm.printNumbers();
    }
}
class ThreadTwo2 extends Thread 
{
	NonSyncMethod1 nsm;

    public ThreadTwo2(NonSyncMethod1 nsm) 
    {
        this.nsm = nsm;
        
        setName("ThreadTwo");
        start();
    }
    public void run()
    {
       nsm.printNumbers();
    }
}
public class SyncDemo3 
{
	 public static void main(String[] args)
	 {
		 NonSyncMethod1 nsm = new NonSyncMethod1();
		 
		 new ThreadOne1(nsm);
		 new ThreadTwo2(nsm);
	 }
}