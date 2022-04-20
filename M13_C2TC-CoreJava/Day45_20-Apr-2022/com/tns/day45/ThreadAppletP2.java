// Program that demonstrates Thread in Applet Part-2 (class ThreadFrameP2 implements Runnable & inner class A1 extends Thread)

package com.tns.day45;

import java.applet.Applet;
import java.awt.TextField;

public class ThreadAppletP2 extends Applet implements Runnable
{
	TextField tf1, tf2;
	Thread th1;
	int i, j;
	
	public void init()
	{
		add(tf1 = new TextField(20));
		add(tf2 = new TextField(20));
		
		th1 = new Thread(this);
		A1 a = new A1();
		
		th1.start();
		a.start();
	}
	public void run()
	{
		while(true)
		{
			tf1.setText(String.valueOf(i));
			
			if(i==100)
				i =0;
			else
				i++;
			
			try
			{
				Thread.sleep(10);
			}
			catch(Exception e)
			{	
			}
		}
	}
	
	class A1 extends Thread
	{
		public void run()
		{
			while(true)
			{
				tf2.setText(String.valueOf(j));
				if(j==100)
					j =0;
				else
					j++;
				
				try
				{
					Thread.sleep(10);
				}
				catch(Exception e)
				{	
				}
			}
		}
	}
}
