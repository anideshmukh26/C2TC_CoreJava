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
	TextField tf;
	
	public void init() 
	{
		add(btn1 = new Button(" Click "));
		add(tf = new TextField(20));
		add(btn2 = new Button(" Clear "));
	
		C c = new C();
		c.takeRef(this);				
		
		btn1.addActionListener(c);					// passing class C instance by variable c
		btn2.addActionListener(new D(this));		// passing class D instance
	}
}
class C implements ActionListener
{
	AppletActionListenerPart4 a;
	
	public void takeRef(AppletActionListenerPart4 ap)		// using takeRef() method
	{
		a=ap;
	}
	
	/*C(AppletActionListenerPart4 al)
	{
		this.al=al;
	} */
	
	public void actionPerformed(ActionEvent e)
	{
		a.tf.setText(" Hello, My name is Aniket. ");
	}
}
class D implements ActionListener
{
	AppletActionListenerPart4 al;
	
	D(AppletActionListenerPart4 al)		
	{
		this.al=al;						// using reference variable this 
	}
	public void actionPerformed(ActionEvent e)
	{
		al.tf.setText(" ");
	}
}
