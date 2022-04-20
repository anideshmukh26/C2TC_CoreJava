

package com.tns.day39;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AppType6 extends Frame
{
	Button btn1, btn2;
	TextField tf;
	
	public AppType6()
	{
		setLayout(new FlowLayout());
		
		add(btn1 = new Button(" Click "));
		add(tf = new TextField(20));
		add(btn2 = new Button(" Clear "));
		
		btn1.addActionListener((e)-> tf.setText("Hello"));		
		btn2.addActionListener((e)-> tf.setText(" "));
		
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
	public static void main(String[] args)
	{
		new AppType6();
	}
}
