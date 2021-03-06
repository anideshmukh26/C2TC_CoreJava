// program that demonstrates ActionListener Part-1 (class AppletActionListenerPart1 register with two component btn1 & btn2).

package com.tns.day31;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//class inherits  class Applet & interface ActionListener
public class AppletActionListenerPart1 extends Applet implements ActionListener		 
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
		btn2.addActionListener(this);		
	}
	public void actionPerformed(ActionEvent e)
	{
		Object o = e.getSource();
		if(o.equals(btn1))
			tf.setText(" Hello, My name is Aniket. ");
		if(o.equals(btn2))
			tf.setText(" ");
	}
}
