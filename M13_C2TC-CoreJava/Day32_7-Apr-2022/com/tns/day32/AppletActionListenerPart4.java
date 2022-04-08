// Program that demonstrates ActionListener Part-4 (Outside class C register btn1, outside class D register btn2).

package com.tns.day32;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletActionListenerPart4 extends Applet
{
	Button btn1, btn2;
	static TextField tf;
	
	public void init() 
	{
		add(btn1 = new Button(" Click "));
		add(tf = new TextField(20));
		add(btn2 = new Button(" Clear "));
	
		//C b = new C(this);
		//D d = new D(this);
		
		btn1.addActionListener(new C());
		
		btn2.addActionListener(new D());
	}
}
class C implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		AppletActionListenerPart4.tf.setText(" Hello, My name is Aniket. ");
	}
}
class D implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		AppletActionListenerPart4.tf.setText(" ");
	}
}
