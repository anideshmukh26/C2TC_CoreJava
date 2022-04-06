// program that demonstrates ActionListener Part 2.

package com.tns.day31;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletActionListenerPart2 extends Applet implements ActionListener
{
	Button btn1, btn2;
	TextField tf;
	
	public AppletActionListenerPart2()		// constructor
	{
		add(btn1 = new Button(" Click "));
		add(tf = new TextField(20));
		add(btn2 = new Button(" Clear "));
		
		// register component buttons with listener
		btn1.addActionListener(this);
		btn2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource().equals(btn1))
			tf.setText("Hello, My Name is Aniket. ");
		if(ae.getSource().equals(btn2))
			tf.setText(" ");
	}
	public static void main(String[] args)
	{
		new AppletActionListenerPart2();
	}
}
