// Program that demonstrates Thread in Applet.

package com.tns.day44;

import java.applet.Applet;
import java.awt.TextField;

public class ThreadDemo3 extends Applet implements Runnable
{
	TextField tf1, tf2;
	
	public void init()
	{
		add(tf1 = new TextField(20));
		add(tf2 = new TextField(20));
	}
	public void run()
	{
		
	}
}
