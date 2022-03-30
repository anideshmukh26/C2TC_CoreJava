// program that displays several awt components

package com.tns.day18;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;

public class AppletComponent extends Applet
{
	Button btn;
	TextField tf;
	Label lbl;
	Checkbox cb, cb1,cb2, cb3;
	CheckboxGroup cbg;
	Choice ch;
	
	public void init()
	{
		Button btn = new Button(" This is Button ");
		add(btn);
		
		Label lbl = new Label("This is Label");
		add(lbl);
		
		TextField tf = new TextField(" This is TextField ",20);
		add(tf);
		
		Checkbox cb = new Checkbox(" This is Checkbox ");
		add(cb);
		
		CheckboxGroup cbg = new CheckboxGroup();
		add(cb1 = new Checkbox("Item 1", cbg, false));
		add(cb2 = new Checkbox("Item 2", cbg, true));
		add(cb3 = new Checkbox("Item 3", cbg, false));
		
		Choice ch = new Choice();
		ch.addItem("Choice Item 1");
		ch.addItem("Choice Item 2");
		ch.addItem("Choice Item 3");
		add(ch);
		
		setSize(300,300);
	}
}
