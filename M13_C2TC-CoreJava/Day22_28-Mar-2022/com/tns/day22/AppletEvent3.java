// program to demonstrate simple calculator(addition, substraction, multiplication & division) using action event

package com.tns.day22;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Event;

public class AppletEvent3 extends Applet
{
	TextField tf1, tf2, tf3;
	Button btn1, btn2, btn3, btn4, btn5;
	Label lbl1, lbl2, lbl3;
	
	public void init()
	{
		add(lbl1 = new Label(" First no.: "));
		add(tf1 = new TextField(6));
		add(lbl2 = new Label(" Second no.: "));
		add(tf2 = new TextField(6));
		add(lbl3 = new Label(" Result: "));
		add(tf3 = new TextField(6));
		
		add(btn1 = new Button(" ADD "));
		add(btn2 = new Button(" SUB "));
		add(btn3 = new Button(" MUL "));
		add(btn4 = new Button(" DIV "));
		
		add(btn5 = new Button(" Clear "));
		
		setSize(450, 200);
	}
	public boolean action(Event e, Object o)
	{
		if(e.target.equals(btn1))
		{
			int a = Integer.parseInt(tf1.getText());
			int b = Integer.parseInt(tf2.getText());
			int sum = a+b;		// addition
			tf3.setText(" "+sum);
		}
		if(e.target.equals(btn2))
		{
			int a = Integer.parseInt(tf1.getText());
			int b = Integer.parseInt(tf2.getText());
			int sub = a-b;		// substraction
			tf3.setText(" "+sub);
		}
		if(e.target.equals(btn3))
		{
			int a = Integer.parseInt(tf1.getText());
			int b = Integer.parseInt(tf2.getText());
			int mul = a*b;		// multiplication
			tf3.setText(" "+mul);
		}
		if(e.target.equals(btn4))
		{
			int a = Integer.parseInt(tf1.getText());
			int b = Integer.parseInt(tf2.getText());
			int div = a/b;		// division
			tf3.setText(" "+div);
		}
		if(e.target.equals(btn5))
		{
			tf1.setText(" ");
			tf2.setText(" ");
			tf3.setText(" ");
		}
		return true;
	}
}
