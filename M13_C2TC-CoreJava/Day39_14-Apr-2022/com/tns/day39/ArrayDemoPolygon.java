// Program that demonstrates Array by drawing polygon.

package com.tns.day39;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ArrayDemoPolygon extends Frame
{
	int [] x;
	int [] y;
	
	public ArrayDemoPolygon()
	{
		x = new int[7];
		y = new int[7];
		
		for(int i = 0; i <x.length; i++)
		{
			x[i] = (int) (300*Math.random());
			y[i] = (int) (300*Math.random());
		}
		
		addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		setSize(500,400);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		g.drawPolygon(x, y, 5);
	}
	public static void main(String[] args) 
	{
		new ArrayDemoPolygon();
	}
}
