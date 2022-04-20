// Program that demonstrates Thread in Application Part-2 (class ThreadFrameP2 implements Runnable & inner class A extends Thread)

package com.tns.day45;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ThreadFrameP2 extends Frame implements Runnable
{
	TextField tf1, tf2;
	Thread th1;
	int i, j;
	
	public ThreadFrameP2()
	{
		setLayout(new FlowLayout());
		
		add(tf1 = new TextField(20));
		add(tf2 = new TextField(20));
		
		th1 = new Thread(this);
		A a = new A();
		
		th1.start();
		a.start();
		
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
	public static void main(String[] args)
	{
		new ThreadFrameP2();
	}
	
	class A extends Thread
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
