// Program that demonstrates Thread in Applet Part-3 (outside class B1 & C1 extends Thread respectively).

package com.tns.day45;

import java.applet.Applet;
import java.awt.TextField;

public class ThreadAppletP3 extends Applet
{
	TextField tf1, tf2;
	int i, j;
	
	public void init()
	{
		add(tf1 = new TextField(20));
		add(tf2 = new TextField(20));
		
		B1 b = new B1(this);
		C1 c = new C1(this);
		
		b.start();
		c.start();
	}
}
class B1 extends Thread
{
	ThreadAppletP3 tha1;
	
	B1(ThreadAppletP3 tha1)
	{
		this.tha1 = tha1;
	}
	public void run()
	{
		while(true)
		{
			tha1.tf1.setText(String.valueOf(tha1.i));
			
			if(tha1.i==100)
				tha1.i =0;
			else
				tha1.i++;
			
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
class C1 extends Thread
{
	ThreadAppletP3 tha2;
	
	C1(ThreadAppletP3 tha2)
	{
		this.tha2 = tha2;
	}
	public void run()
	{
		while(true)
		{
			tha2.tf2.setText(String.valueOf(tha2.j));
			if(tha2.j==100)
				tha2.j =0;
			else
				tha2.j++;
			
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