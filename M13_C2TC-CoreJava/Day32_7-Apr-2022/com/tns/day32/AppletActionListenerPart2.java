// Program that demonstrates ActionListener Part-2 (class AppletActionListenerPart2 register btn1, Inner/nested class A register btn2).

package com.tns.day32;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletActionListenerPart2 extends Applet implements ActionListener
{
	Button btn1, btn2;
	TextField tf;

	public void init() 
	{
		add(btn1 = new Button(" Click "));
		add(tf = new TextField(20));
		add(btn2 = new Button(" Clear "));
		
		// register component buttons with listener
		btn1.addActionListener(this);		

		btn2.addActionListener(new A());
	}
	public void actionPerformed(ActionEvent e)
	{
		tf.setText(" Hello, My name is Aniket. ");
	}
	class A implements ActionListener		// Inner/nested Class A
	{
		public void actionPerformed(ActionEvent e)
		{
			tf.setText(" ");
		}
	}
}
