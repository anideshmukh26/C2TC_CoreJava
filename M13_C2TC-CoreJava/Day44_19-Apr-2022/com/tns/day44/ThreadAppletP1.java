// program that demonstrates Thread in Applet Part-1 (class ThreadAppletP1 implements Runnable, one object with two Thread).

package com.tns.day44;

import java.applet.Applet;
import java.awt.TextField;

public class ThreadAppletP1 extends Applet implements Runnable
{
	TextField tf1, tf2;
	Thread th1, th2;
	int i, j;
	
	public void init()
	{
		add(tf1 = new TextField(20));
		add(tf2 = new TextField(20));
		
		th1 = new Thread(this);
		th2 = new Thread(this);
		
		th1.start();
		th2.start();
	}
	public void run()
	{
		while(true)
		{
			Thread th = Thread.currentThread();
			if(th.equals(th1))
			{
				tf1.setText(String.valueOf(i));
				if(i==100)
					i =0;
				else
					i++;
			}
			if(th.equals(th2))
			{
				tf2.setText(String.valueOf(j));
				if(j==100)
					j =0;
				else
					j++;
			}
			
			try
			{
				Thread.sleep(15);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}
