// Program that demonstrates FocusListener.

package com.tns.day36;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.FocusEvent;		
import java.awt.event.FocusListener;

public class AppletFocusListener extends Applet
{
	Button btn1, btn2;
	TextField tf;
	
	public void init()
	{
		add(btn1 = new Button(" Click "));
		add(tf = new TextField(20));
		add(btn2 = new Button(" Clear "));
		
		btn1.addFocusListener(new FocusListener()		// addFocusListener passes the object of anonymous class who is implementing FocusLitener interface.
		{
			// abstract methods of interface FocusListener.
			public void focusGained(FocusEvent e)			// Necessary abstract method of FocusListener interface.
			{
				tf.setText(" Hello, My name is Aniket. ");
			}
			public void focusLost(FocusEvent e)				// unnecessary abstract method of FocusListener interface that also inherited, that's why we have to implement it.
			{
						
			}
		});
		
		btn2.addFocusListener(new FocusListener()
		{
			public void focusGained(FocusEvent e)
			{
				tf.setText("");
			}
			public void focusLost(FocusEvent e) 
			{
						
			}
		});
	}
}
