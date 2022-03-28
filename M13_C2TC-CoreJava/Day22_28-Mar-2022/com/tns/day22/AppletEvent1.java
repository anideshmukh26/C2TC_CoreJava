// program to demonstrate addition of numbers using action event

package com.tns.day22;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Event;

public class AppletEvent1 extends Applet
{
	TextField tf1, tf2, tf3;
	Button btn1, btn2;
	Label lbl;
	
	public void init()
	{
		add(tf1 = new TextField(6));
		add(lbl = new Label(" + "));
		add(tf2 = new TextField(6));
		add(btn1 = new Button(" = "));
		add(tf3 = new TextField(6));
		add(btn2 = new Button(" Clear "));
		
		setSize(500, 200);
	}
	public boolean action(Event e, Object o)
	{
		if(e.target.equals(btn1))
		{
			// converts string value to integer
			String s1 = tf1.getText();
			int a = Integer.parseInt(s1);
			
			String s2 = tf2.getText();
			int b = Integer.parseInt(s2);
			
			int c = a+b;
			String s3 = String.valueOf(c);
			tf3.setText(s3);
		}
		if(e.target.equals(btn2))
		{
			// clears TextField values
			tf1.setText(" ");
			tf2.setText(" ");
			tf3.setText(" ");
		}
		return true;
	}
}
