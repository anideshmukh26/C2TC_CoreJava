

package com.tns.day39;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyGuiApp4 extends Frame 
{
	Panel1 pnl1;
	Panel2 pnl2;
	
	public MyGuiApp4()
	{
		setLayout(new GridLayout(1,2));
		
		add(pnl1 = new Panel1());
		add(pnl2 = new Panel2());
		
		pnl2.cb5.setState(true);
		pnl2.cb6.setState(true);
		pnl2.cb7.setState(false);
		pnl2.tf.setText("8000");
		pnl2.tf.setEditable(false);
		
		pnl1.cb1.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
				pnl2.cb5.setState(true);
				pnl2.cb6.setState(true);
				pnl2.cb7.setState(false);
				pnl2.tf.setText(" 8000 ");
			}
		});
		pnl1.cb2.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
				pnl2.cb5.setState(false);
				pnl2.cb6.setState(true);
				pnl2.cb7.setState(true);
				pnl2.tf.setText(" 12000 ");
			}
		});
		pnl1.cb3.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
				pnl2.cb5.setState(true);
				pnl2.cb6.setState(false);
				pnl2.cb7.setState(true);
				pnl2.tf.setText(" 18000 ");
			}
		});
		pnl1.cb4.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
				pnl2.cb5.setState(true);
				pnl2.cb6.setState(true);
				pnl2.cb7.setState(true);
				pnl2.tf.setText(" 25000 ");
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
		
		setSize(400, 400);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new MyGuiApp4();
	}
}
class Panel1 extends Panel
{
	Checkbox cb1, cb2, cb3, cb4;
	CheckboxGroup cbg;
		
	public Panel1()
	{	
		setLayout(new GridLayout(4,1));
		cbg = new CheckboxGroup();
		
		add(cb1 = new Checkbox(" Tour1 ", cbg, true));
		add(cb2 = new Checkbox(" Tour2 ", cbg, false));
		add(cb3 = new Checkbox(" Tour3 ", cbg, false));
		add(cb4 = new Checkbox(" Tour4 ", cbg, false));
	}
}
class Panel2 extends Panel
{
	Checkbox cb5, cb6, cb7;
	TextField tf;
	
	public Panel2()
	{
		setLayout(new GridLayout(4,1));
			
		add(cb5 = new Checkbox(" Chandigarth "));
		add(cb6 = new Checkbox(" Amritsar "));
		add(cb7 = new Checkbox(" Manali "));
		
		add(tf = new TextField());
	}
}