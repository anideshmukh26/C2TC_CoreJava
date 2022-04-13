

package com.tns.day37;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUIApp extends Frame
{
	Button btn1, btn2;
	TextField tf;
	
	public GUIApp()
	{
		setLayout(new FlowLayout());
		setTitle(" My GUI App ");
		
		add(btn1 = new Button(" Click "));
		add(tf = new TextField(20));
		add(btn2 = new Button(" Clear "));
		
		btn1.addActionListener((e)-> tf.setText(" Hello, My name is Aniket. "));
		btn2.addActionListener((e)-> tf.setText(" "));
		
		addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		setSize(300, 400);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new GUIApp();
	}
}
