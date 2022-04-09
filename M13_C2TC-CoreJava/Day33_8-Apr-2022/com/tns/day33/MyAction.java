// Program that demonstrates ActionListener by declaring variable as static (Outside class A register btn1, outside class B register btn2).

package com.tns.day33;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyAction extends Applet
{
	Button btn1, btn2;
	static TextField tf;		// declare variable as static
	
	public void init()
	{
		add(btn1 = new Button(" Click "));
		add(tf = new TextField(20));
		add(btn2 = new Button(" Clear "));

		btn1.addActionListener(new A());
		btn2.addActionListener(new B());
	}
}
class A implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		MyAction.tf.setText("Hello, My name is Aniket ");		// using class name as a reference for static variable tf.
	}
}
class B implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		MyAction.tf.setText(" ");		// using class name as a reference for static variable tf.
	}
}