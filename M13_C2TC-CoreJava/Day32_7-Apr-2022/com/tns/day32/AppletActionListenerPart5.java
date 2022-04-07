// Program that demonstrates ActionListener Part-2 (inner class E register btn1 , inner class F register btn2).

package com.tns.day32;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletActionListenerPart5 extends Applet 
{
	Button btn1, btn2;
	TextField tf;

	public void init() 
	{
		add(btn1 = new Button(" Click "));
		add(tf = new TextField(20));
		add(btn2 = new Button(" Clear "));
		
		// register component buttons with listener
		btn1.addActionListener(new E());
		btn2.addActionListener(new F());
	}
	class E implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			tf.setText(" Hello, My name is Aniket. ");
		}
	}
	class F implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			tf.setText(" ");
		}
	}
}
