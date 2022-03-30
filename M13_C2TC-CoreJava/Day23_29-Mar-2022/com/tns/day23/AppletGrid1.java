

package com.tns.day23;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.GridLayout;
import java.awt.TextField;

public class AppletGrid1 extends Applet
{
	Checkbox cb1, cb2, cb3, cb4, cb5, cb6;
	CheckboxGroup cbg;
	TextField tf;
	
	public void init()
	{
		setLayout(new GridLayout(4,2));
		
		cbg= new CheckboxGroup();
		
		add(cb1 = new Checkbox("Tour1", cbg, false));
		add(cb2 = new Checkbox("Manali"));
		add(cb3 = new Checkbox("Tour2", cbg, false));
		add(cb4 = new Checkbox("Shimla"));
		add(cb5 = new Checkbox("Tour3", cbg, false));
		add(cb6 = new Checkbox("Dalhousie"));
		
		add(tf = new TextField(6));
	}
	
}
