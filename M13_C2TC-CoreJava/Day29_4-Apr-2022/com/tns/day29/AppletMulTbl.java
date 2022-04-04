// program that demonstrate Multiplication table for numbers 1-10 in TextArea on click of button

package com.tns.day29;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Event;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;


public class AppletMulTbl extends Applet
{
	Panel1 pnl1;
	Panel2 pnl2;
	
	public void init()
	{
		setLayout(new GridLayout(1,2));
		
		add(pnl1 = new Panel1());
		add(pnl2 = new Panel2());
		
		pnl2.ta.setEditable(false);
		
		setSize(450, 400);
	}
	public boolean action(Event e, Object o)
	{
		if(e.target.equals(pnl1.btn1))
		{
			int n = 1, m = 0;
			pnl2.ta.setText(" Multiplication table for number 1: \n");		//setText() method to set Text in TextArea.
			for(int i = 1; i <= 10; i++)
			 {
				 m = n * i; 
				 pnl2.ta.append(" \n"+n+" * "+i+"  = "+m+" \n");		// overloaded append() method to append string in TextArea.
			 }
		}
		if(e.target.equals(pnl1.btn2))
		{
			int n = 2, m = 0; 
			pnl2.ta.setText(" Multiplication table for number 2: \n");
			 for(int i = 1; i <= 10; i++)
			 {
				 m = n * i;
				 pnl2.ta.append(" \n"+n+" * "+i+"  = "+m+"  \n"); 
			 }
		}
		if(e.target.equals(pnl1.btn3))
		{
			int n = 3, m = 0; 
			pnl2.ta.setText(" Multiplication table for number 3: \n");
			 for(int i = 1; i <= 10; i++)
			 {
				 m = n * i;
				 pnl2.ta.append(" \n"+n+" * "+i+"  = "+m+"  \n");
			 }
		}
		if(e.target.equals(pnl1.btn4))
		{
			int n = 4, m = 0; 
			pnl2.ta.setText(" Multiplication table for number 4: \n");
			 for(int i = 1; i <= 10; i++)
			 {
				 m = n * i;
				 pnl2.ta.append(" \n"+n+" * "+i+"  = "+m+"  \n");  
			 }
		}
		if(e.target.equals(pnl1.btn5))
		{
			int n = 5, m = 0; 
			pnl2.ta.setText(" Multiplication table for number 5: \n");
			 for(int i = 1; i <= 10; i++)
			 {
				 m = n * i;
				 pnl2.ta.append(" \n"+n+" * "+i+"  = "+m+"  \n");  
			 }
		}
		if(e.target.equals(pnl1.btn6))
		{
			int n = 6, m = 0; 
			pnl2.ta.setText(" Multiplication table for number 6: \n");
			 for(int i = 1; i <= 10; i++)
			 {
				 m = n * i;
				 pnl2.ta.append(" \n"+n+" * "+i+" = "+m+"  \n");  
			 }
		}
		if(e.target.equals(pnl1.btn7))
		{
			int n = 7, m = 0; 
			pnl2.ta.setText(" Multiplication table for number 7: \n");
			 for(int i = 1; i <= 10; i++)
			 {
				 m = n * i;
				 pnl2.ta.append(" \n"+n+" * "+i+"  = "+m+"  \n");  
			 }
		}
		if(e.target.equals(pnl1.btn8))
		{
			int n = 8, m = 0; 
			pnl2.ta.setText(" Multiplication table for number 8: \n");
			 for(int i = 1; i <= 10; i++)
			 {
				 m = n * i;
				 pnl2.ta.append(" \n"+n+" * "+i+"  = "+m+"  \n"); 
			 }
		}
		if(e.target.equals(pnl1.btn9))
		{
			int n = 9, m = 0; 
			pnl2.ta.setText(" Multiplication table for number 9: \n");
			 for(int i = 1; i <= 10; i++)
			 {
				 m = n * i;
				 pnl2.ta.append(" \n"+n+" * "+i+"  = "+m+"  \n");  
			 }
		}
		if(e.target.equals(pnl1.btn10))
		{
			int n = 10, m = 0; 
			pnl2.ta.setText(" Multiplication table for number 10: \n");
			 for(int i = 1; i <= 10; i++)
			 {
				 m = n * i;
				 pnl2.ta.append(" \n"+n+" * "+i+"  = "+m+"  \n");  
			 }
		}
		return true;
	}
}
class Panel1 extends Panel
{
	Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10;
	
	public Panel1()
	{
		setLayout(new GridLayout(5,2));
		
		add(btn1 = new Button(" 1 "));
		add(btn2 = new Button(" 2 "));
		add(btn3 = new Button(" 3 "));
		add(btn4 = new Button(" 4 "));
		add(btn5 = new Button(" 5 "));
		add(btn6 = new Button(" 6 "));
		add(btn7 = new Button(" 7 "));
		add(btn8 = new Button(" 8 "));
		add(btn9 = new Button(" 9 "));
		add(btn10 = new Button(" 10 "));
	}
}
class Panel2 extends Panel
{
	TextArea ta;
	
	public Panel2()
	{
		setLayout(new GridLayout(1,1));
		
		add(ta = new TextArea(" Multiplication Table from 1-10 "));
	}
}
