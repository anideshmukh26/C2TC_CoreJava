// program to demonstrate action event in applet.

package com.tns.day22;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Event;		// importing Event class of awt package

public class AppletEvent extends Applet
{
	Button btn1, btn2;
	TextField tf;
	
	public void init()
	{
		btn1= new Button(" Click ");
		tf= new TextField(10);
		btn2= new Button(" Clear ");
		
		// call to add method to add components
		add(btn1);
		add(tf);
		add(btn2);
		
		setSize(300,100);
	}
	public boolean action(Event e, Object o)		// overrides method action
	{
		if(e.target.equals(btn1))		// action event target on which event is performed & check for given object equal to b1
			tf.setText(" Hello ");
		
		if(e.target.equals(btn2))		// action event target on which event is performed & check for given object equal to b2
			tf.setText(" ");
			
		return true;		// return type of action
	}
}
