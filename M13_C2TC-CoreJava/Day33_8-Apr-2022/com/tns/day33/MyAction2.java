// Program that demonstrates ActionEvent by declaring variable as static & using this keyword

package com.tns.day33;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyAction2 extends Applet
{
	static Button btn1, btn2, btn3, btn4, btn5;
	
	public void init()
	{
		add(btn1 = new Button(" Button Color-1 "));
		add(btn2 = new Button(" Button Color-2 "));
		add(btn3 = new Button(" Button Color-3 "));
		add(btn4 = new Button(" Background Color "));
		add(btn5 = new Button(" Reset "));
		
		btn1.addActionListener(new C());
		btn2.addActionListener(new D());
		btn3.addActionListener(new E(this));
		btn4.addActionListener(new E(this));
		btn5.addActionListener(new F(this));
	}
}
class C implements ActionListener
{
	public void actionPerformed(ActionEvent e) 
	{
		MyAction2.btn1.setBackground(Color.orange);
	}
}
class D implements ActionListener
{
	public void actionPerformed(ActionEvent e) 
	{
		MyAction2.btn2.setBackground(Color.cyan);
	}
}
class E implements ActionListener
{
	MyAction2 ma;
	
	E(MyAction2 ma)
	{
		this.ma = ma;
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		MyAction2.btn3.setBackground(Color.pink);
		
		if(e.getSource().equals(MyAction2.btn4))
			MyAction2.btn4.setBackground(Color.magenta);
			ma.setBackground(Color.gray);
	}
}
class F implements ActionListener
{
	MyAction2 ma;
	
	F(MyAction2 ma)
	{
		this.ma = ma;
	}	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource().equals(MyAction2.btn5))
		{
			ma.setBackground(null);
			
			MyAction2.btn1.setBackground(null);
			MyAction2.btn2.setBackground(null);
			MyAction2.btn3.setBackground(null);
			MyAction2.btn4.setBackground(null);
		}
	}
}