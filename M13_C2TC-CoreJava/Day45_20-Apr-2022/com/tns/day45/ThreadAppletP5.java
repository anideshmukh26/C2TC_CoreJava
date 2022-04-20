// Program that demonstrates Thread in Applet Part-5 (Lambda expression).

package com.tns.day45;

import java.applet.Applet;
import java.awt.TextField;

public class ThreadAppletP5 extends Applet
{
	TextField tf1, tf2;
	Thread th1, th2;
	int i, j;
	
	public void init()
	{
		add(tf1 = new TextField(20));
		add(tf2 = new TextField(20));
		
		th1 = new Thread(()->
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
		});
		
		
		th2 = new Thread(()->
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
		});
		
		th1.start();
		th2.start();
	}
}
