// Program that demonstrates Array of Button type.

package com.tns.day41;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ArrayDemo4 extends Frame implements ActionListener
{
	Button [][] btn;		// 2-Dimensional Array
	
	public ArrayDemo4() 
	{
		setLayout(new GridLayout(3, 3));
		
		btn = new Button[3][3];
		
		for(int i=0; i<btn.length; i++)
		{
			for(int j=0; j < btn[i].length; j++)	
			{
				if(Math.random()<0.5)
					add(btn [i][j] = new Button("X"));
				else 
					add(btn [i][j] = new Button("O"));
				
				btn [i][j].addActionListener(this);
			}
		}
		
		addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		setSize(500, 500);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object o= e.getSource();
		if(o instanceof Button)						// used instanceof for downcasting.
		{
			String s = ((Button)o).getLabel();		// down casting
			
			if(s.equals("X"))
				((Button)o).setLabel("O");
			else
				((Button)o).setLabel("X");
		}	
	}
	public static void main(String[] args)
	{
		new ArrayDemo4();
	}
}

