

package com.tns.day38;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyGuiApp3 extends Frame implements ItemListener
{
	Checkbox cb1, cb2, cb3, cb4, cb5, cb6;
	TextField tf;
	
	public MyGuiApp3()
	{
		setTitle(" My Gui App3 ");
		setLayout(new GridLayout(3,3));	
		
		add(cb1 = new Checkbox(" 1 "));
		add(cb2 = new Checkbox(" 2 "));
		add(cb3 = new Checkbox(" 3 "));
		add(cb4 = new Checkbox(" 4 "));
		add(cb5 = new Checkbox(" 5 "));
		add(cb6 = new Checkbox(" 6 "));
		add(tf = new TextField());
		
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		cb4.addItemListener(this);
		cb5.addItemListener(this);
		cb6.addItemListener(this);
		
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
	public void itemStateChanged(ItemEvent e) 
	{
		int sum = 0;
		
		if(cb1.getState())	
			sum = sum + 1;
		if(cb2.getState())
			sum = sum + 2;
		if(cb3.getState())
			sum = sum + 3;
		if(cb4.getState())
			sum = sum + 4;
		if(cb5.getState())
			sum = sum + 5;
		if(cb6.getState())
			sum = sum + 6;
		
		tf.setText(String.valueOf(sum));
	}
	public static void main(String[] args) 
	{
		new MyGuiApp3();
	}
}

