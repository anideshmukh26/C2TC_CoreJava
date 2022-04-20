

package com.tns.day39;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AppType2 extends Frame implements ActionListener
{
	Button btn1, btn2;
	TextField tf;
	
	public AppType2()
	{
		setLayout(new FlowLayout());
		
		add(btn1 = new Button(" Click "));
		add(tf = new TextField(20));
		add(btn2 = new Button(" Clear "));
		
		// register component buttons with listener
		btn1.addActionListener(this);		

		btn2.addActionListener(new A());
		
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
		new AppType2();
	}
	class A implements ActionListener		// Inner/nested Class A
	{
		public void actionPerformed(ActionEvent e)
		{
			tf.setText(" ");
		}
	}
}
