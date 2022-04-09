// program that demonstrate background color changed using ActionListener

package com.tns.day33;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyAction1 extends Applet implements ActionListener
{
	Button btn1, btn2, btn3;
	
	public void init()
	{
		add(btn1 = new Button(" Red "));
		add(btn2 = new Button(" Yellow "));
		add(btn3 = new Button(" Green "));
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) 
	{
		// changed background color on button click.
		if(e.getSource().equals(btn1))
			setBackground(Color.red);
		
		if(e.getSource().equals(btn2))
			setBackground(Color.yellow);
		
		if(e.getSource().equals(btn3))
			setBackground(Color.green);
	}
}
