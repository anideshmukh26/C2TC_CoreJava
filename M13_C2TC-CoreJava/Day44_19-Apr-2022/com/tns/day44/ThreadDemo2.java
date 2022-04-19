// Program that demonstrates Thread in Application.

package com.tns.day44;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ThreadDemo2 extends Frame implements Runnable
{
	TextField tf1, tf2;
	
	public ThreadDemo2()
	{
		setLayout(new FlowLayout());
		
		add(tf1 = new TextField(20));
		add(tf2 = new TextField(20));
		
		
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
		
	}
	public static void main(String[] args)
	{
		new ThreadDemo2();
	}

}
