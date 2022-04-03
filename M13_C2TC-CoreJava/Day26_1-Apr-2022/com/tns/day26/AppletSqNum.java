// program to calculate Square of Number using Applet.

package com.tns.day26;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Event;
import java.awt.Label;

public class AppletSqNum extends Applet 
{
    Button btn;
    Label lbl;
	TextField tf1, tf2;
    
    public void init()
    {
	    add(lbl = new Label("Enter a number :"));
	    add(tf1 = new TextField(10));
	    add(btn = new Button("Calculate"));
	    add(tf2= new TextField(20));
	    
	    setSize(600, 100);
    }
    public boolean action(Event e, Object o)
    {
    	if(e.target.equals(btn))
    	{
			int n = Integer.valueOf(tf1.getText());
			int sq=n*n;
			tf2.setText("Square of "+n+" is "+sq);
    	}
    	return true;
    }
}
