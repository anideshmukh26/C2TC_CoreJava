// Program that demonstrates Thread in Application Part-5 (Lambda expression).

package com.tns.day45;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ThreadFrameP5 extends Frame
{
	TextField tf1, tf2;
	Thread th1, th2;
	int i, j;
	
	public ThreadFrameP5()
	{
		setLayout(new FlowLayout());
		
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
		
		addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new ThreadFrameP5();
	}
}
