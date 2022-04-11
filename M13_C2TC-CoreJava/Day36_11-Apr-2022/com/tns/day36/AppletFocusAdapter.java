// Program that demonstrates Adapter class i.e FocusAdapter class.

package com.tns.day36;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class AppletFocusAdapter extends Applet
{
	Button btn1, btn2;
	TextField tf;
	
	public void init()
	{
		add(btn1 = new Button(" Click "));
		add(tf = new TextField(20));
		add(btn2 = new Button(" Clear "));
		
		btn1.addFocusListener(new FocusAdapter()		// addFocusListener passes the object of anonymous class who is extends FocusAdapter class.	
		{
			@Override									// override focusGained() method of FocusListener interface.
			public void focusGained(FocusEvent e)		// we inherits only necessary abstract method of FocusListener interface.
			{
				tf.setText(" Hello, My name is Aniket. ");
			}
		});
		
		btn2.addFocusListener(new FocusAdapter()
		{
			@Override
			public void focusGained(FocusEvent e) 
			{
				tf.setText(" ");
			}
		});
	}
}
