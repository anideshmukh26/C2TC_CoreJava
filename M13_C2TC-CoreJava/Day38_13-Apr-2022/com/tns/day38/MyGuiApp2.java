

package com.tns.day38;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyGuiApp2 extends Frame
{
	TextField tf1, tf2, tf3;
	Button btn1, btn2, btn3, btn4, btn5;
	Label lbl1, lbl2, lbl3;
	
	public MyGuiApp2()
	{
		setTitle(" My GUI App2 ");
		setLayout(new FlowLayout());
		
		add(lbl1 = new Label(" First number: "));
		add(tf1 = new TextField(10));
		add(lbl2 = new Label(" Second number: "));
		add(tf2 = new TextField(10));
		add(lbl3 = new Label(" Result: "));
		add(tf3 = new TextField(10));
		add(btn1 = new Button(" ADD "));
		add(btn2 = new Button(" SUB "));
		add(btn3 = new Button(" MUL "));
		add(btn4 = new Button(" DIV "));
		add(btn5 = new Button(" Clear "));
		
		btn1.addActionListener((e)-> 
		{
			int a = Integer.parseInt(tf1.getText());
			int b = Integer.parseInt(tf2.getText());
			int sum = a+b;	
			tf3.setText(" "+sum);
		});
		btn2.addActionListener((e)-> 
		{
			int a = Integer.parseInt(tf1.getText());
			int b = Integer.parseInt(tf2.getText());
			int sub = a-b;	
			tf3.setText(" "+sub);
		});
		btn3.addActionListener((e)->
		{
			int a = Integer.parseInt(tf1.getText());
			int b = Integer.parseInt(tf2.getText());
			int mul = a*b;	
			tf3.setText(" "+mul);
		});
		btn4.addActionListener((e)-> 
		{
			int a = Integer.parseInt(tf1.getText());
			int b = Integer.parseInt(tf2.getText());
			int div = a/b;	
			tf3.setText(" "+div);
		});
		btn5.addActionListener((e)-> 
		{
			tf1.setText(" ");
			tf2.setText(" ");
			tf3.setText(" ");
		});
		
		addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		setSize(600, 250);
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new MyGuiApp2();
	}
}
