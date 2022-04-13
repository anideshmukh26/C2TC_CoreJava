
package com.tns.day38;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyGuiApp1 extends Frame
{
	TextField tf1, tf2, tf3;
	Button btn1, btn2;
	Label lbl;
	
	public MyGuiApp1()
	{
		setTitle(" My GUI App1 ");
		setLayout(new FlowLayout());
		
		add(tf1 = new TextField(7));
		add(lbl = new Label(" + "));
		add(tf2 = new TextField(7));
		add(btn1 = new Button(" = "));
		add(tf3 = new TextField(7));
		add(btn2 = new Button(" Clear "));
		
		btn1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int a = Integer.parseInt( tf1.getText());
				int b = Integer.parseInt(tf2.getText());
						
				int sum = a+b;
				tf3.setText(" "+sum);
			}
		});
		btn2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				tf1.setText(" ");
				tf2.setText(" ");
				tf3.setText(" ");
			}
		});
		
		addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		setSize(400, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new MyGuiApp1();
	}
}
