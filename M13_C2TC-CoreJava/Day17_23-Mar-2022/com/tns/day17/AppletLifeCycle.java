// program to demonstrate Life cycle of applet

package com.tns.day17;

import java.awt.*;
import java.applet.Applet;

public class AppletLifeCycle extends Applet
{
	public void init()
	{
		System.out.println(" Applet initialized.");
		
		setSize(300,200); // sets the size of applet
	}
	public void start()
	{
		System.out.println(" Applet started.");
	}
	public void stop()
	{
		System.out.println(" Applet Stoped.");
	}
	public void paint(Graphics g) // paint method with Graphic class
	{
		g.drawString(" Applet started & following the life cycle.",50,50);		// method drawString(String,int,int)
	}
	public void destroy()
	{
		System.out.println(" Applet is closing & remove memory.");
	}
}
