

package com.tns.day50;

class NonSyncMethod
{
    public void printNumbers()
    {
        System.out.println("Starting to print Numbers for " + Thread.currentThread().getName());

        for (int i = 0; i < 5; i++)
        {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        System.out.println("Completed printing Numbers for " + Thread.currentThread().getName());
    }
}
class ThreadOne extends Thread 
{
	NonSyncMethod nsm;

    public ThreadOne(NonSyncMethod nsm) 
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
class ThreadTwo extends Thread 
{
	NonSyncMethod nsm;

    public ThreadTwo(NonSyncMethod nsm) 
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
public class SyncDemo2 
{
	 public static void main(String[] args)
	 {
		 NonSyncMethod nsm = new NonSyncMethod();
		 
		 new ThreadOne(nsm);
		 new ThreadTwo(nsm);
	 }
}