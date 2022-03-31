// program that demonstrate container(panel) work as component in another container(applet).

package com.tns.day24;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Event;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class AppletPanel extends Applet
{	
	Panel1 pnl1;
	Panel2 pnl2;
	
	public void init()
	{
		setLayout(new GridLayout(1,2));
		
		add(pnl1 = new Panel1());
		add(pnl2 = new Panel2());
		
		// panel2 components
		pnl2.cb4.setState(true);
		pnl2.cb5.setState(true);
		pnl2.cb6.setState(false);
		pnl2.tf.setText("5000");
		pnl2.tf.setEditable(false);
	}
	public boolean action(Event e, Object o)
	{
		if(pnl1.cb1.getState())
		{
			pnl2.cb4.setState(true);
			pnl2.cb5.setState(true);
			pnl2.cb6.setState(false);
			pnl2.tf.setText(" 5000 ");
		}
		if(pnl1.cb2.getState())
		{
			pnl2.cb4.setState(false);
			pnl2.cb5.setState(true);
			pnl2.cb6.setState(true);
			pnl2.tf.setText(" 10000 ");
		}
		if(pnl1.cb3.getState())
		{
			pnl2.cb4.setState(true);
			pnl2.cb5.setState(false);
			pnl2.cb6.setState(true);
			pnl2.tf.setText(" 15000 ");
		}
		return true;
	}
}
class Panel1 extends Panel
{
	Checkbox cb1, cb2, cb3;
	CheckboxGroup cbg;
		
	public Panel1()
	{	
		setLayout(new GridLayout(3,1));
		cbg = new CheckboxGroup();
		
		add(cb1 = new Checkbox(" Tour1 ", cbg, true));
		add(cb2 = new Checkbox(" Tour2 ", cbg, false));
		add(cb3 = new Checkbox(" Tour3 ", cbg, false)); 
			
		}
}
class Panel2 extends Panel
{
	Checkbox cb4, cb5, cb6;
	TextField tf;
	
	public Panel2()
	{
		setLayout(new GridLayout(4,1));
			
		add(cb4 = new Checkbox(" Manali "));
		add(cb5 = new Checkbox(" Shimla "));
		add(cb6 = new Checkbox(" Dalhousie "));
		
		add(tf = new TextField());
	}
}


