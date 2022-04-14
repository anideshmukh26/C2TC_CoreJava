

package com.tns.day39;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ArrayDemoPolygon1 extends Frame
{
	public ArrayDemoPolygon1()
	{	
		addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		setSize(400,300);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		int[] x = {40, 200, 70, 50, 10};
	 	int[] y = {40, 130, 100, 200, 70};
	 	int n = 5;
	 	
	 	g.setColor(Color.blue);
	 	g.drawString(" 40, 40", 40, 40);
	 	g.drawString(" 200, 130", 200, 130);
	 	g.drawString(" 70, 100", 70, 100);
	 	g.drawString(" 50, 200", 50, 200);
	 	g.drawString(" 10, 70", 10, 70);
	 	
	 	g.setColor(Color.red);
		g.drawPolygon(x, y, n);
	}
	public static void main(String[] args)
	{
		new ArrayDemoPolygon1();
	}
}
