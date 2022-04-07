// Program that demonstrates ActionListener Part-5i (Anonymous class).

package com.tns.day32;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletActionListenerPart5i extends Applet
{
	Button btn1, btn2;
	TextField tf;

	public void init() 
	{
		add(btn1 = new Button(" Click "));
		add(tf = new TextField(20));
		add(btn2 = new Button(" Clear "));
		
		// register component buttons with listener
		btn1.addActionListener(new ActionListener()		
		{														// Anonymous class
			public void actionPerformed(ActionEvent e)
			{
				tf.setText(" Hello, My name is Aniket. ");
			}
		} );
		
		
		btn2.addActionListener(new ActionListener()		
		{														// Anonymous class
			public void actionPerformed(ActionEvent e)
			{
				tf.setText(" ");
			}
		});
	}
}
