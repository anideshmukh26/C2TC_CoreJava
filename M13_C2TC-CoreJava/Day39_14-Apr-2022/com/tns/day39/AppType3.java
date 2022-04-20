

package com.tns.day39;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AppType3 extends Frame implements ActionListener
{
	Button btn1, btn2;
	TextField tf;
	
	public AppType3()
	{
		setLayout(new FlowLayout());
		
		add(btn1 = new Button(" Click "));
		add(tf = new TextField(20));
		add(btn2 = new Button(" Clear "));
		
		// register component buttons with listener
		btn1.addActionListener(this);
		
		B b= new B(this);
		btn2.addActionListener(b);
		
		addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		setSize(300, 300);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) 
	{
		tf.setText(" Hello, My name is Aniket. ");
	}
	
	public static void main(String[] args) 
	{
		new AppType3();
	}
}
class B implements ActionListener
{
	AppType3 at3;
	
	B(AppType3 at3)
	{
		this.at3 = at3;
	}
	public void actionPerformed(ActionEvent e)
	{
		at3.tf.setText(" ");
	}
}
