// program to demonstrate Awt GridLayout

package com.tns.day23;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.Event;
import java.awt.GridLayout;
import java.awt.TextField;

public class AppletGrid extends Applet
{
	Checkbox cb1, cb2, cb3, cb4;
	TextField tf;
	
	public void init()
	{
		setLayout(new GridLayout(3,2));		// set Gridlayout with number of rows & columns respectively.
		
		add(cb1 = new Checkbox(" 1 "));
		add(cb2 = new Checkbox(" 2 "));
		add(cb3 = new Checkbox(" 3 "));
		add(cb4 = new Checkbox(" 4 "));
		add(tf = new TextField());
	}
	public boolean action(Event e, Object o)
	{
		int sum = 0;
		
		if(cb1.getState())		// getSet() returns state of checkbox i.e on or off.
			sum = sum + 1;
		if(cb2.getState())
			sum = sum + 2;
		if(cb3.getState())
			sum = sum + 3;
		if(cb4.getState())
			sum = sum + 4;
			
		tf.setText(String.valueOf(sum));
		return true;
	}
}
