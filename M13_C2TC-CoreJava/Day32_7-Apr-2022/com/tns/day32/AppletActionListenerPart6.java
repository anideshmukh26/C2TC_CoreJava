// Program that demonstrates ActionListener Part-6 (lambda expression).

package com.tns.day32;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletActionListenerPart6 extends Applet
{
	Button btn1, btn2;
	TextField tf;

	public void init() 
	{
		add(btn1 = new Button(" Click "));
		add(tf = new TextField(20));
		add(btn2 = new Button(" Clear "));
		
		// register component buttons with listener 
		btn1.addActionListener((e)-> tf.setText(" Hello, My name is Aniket "));		// lambda expression		
		btn2.addActionListener((e)-> tf.setText(" "));		
	}
}
