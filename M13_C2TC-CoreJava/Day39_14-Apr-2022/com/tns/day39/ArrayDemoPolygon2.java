

package com.tns.day39;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ArrayDemoPolygon2 extends Frame
{
	public ArrayDemoPolygon2()
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
		int[] x = {80, 150, 95, 110, 20};
	 	int[] y = {80, 50, 120, 175, 45};
	 	int n = 5;
	 	
	 	g.setColor(Color.orange);
	 	
	 	g.drawString(" 80, 80", 80, 80);
	 	g.drawString(" 150, 50", 150, 50);
	 	g.drawString(" 95, 120", 95, 120);
	 	g.drawString(" 110, 175", 110, 175);
	 	g.drawString(" 20, 45", 20, 45);
	 	
	 	g.drawPolygon(x, y, n);
		
	}
	
	public static void main(String[] args)
	{
		new ArrayDemoPolygon2();
	}
}
