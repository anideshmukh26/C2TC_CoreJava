// program to demonstrate we can't instantiate abstract component class.

package com.tns.day26;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Component;

public class AppletRegForm extends Applet 
{
	Button btn1;
	Label lbl1, lbl2, lbl3, lbl4, lbl5;
	TextField tf1, tf2;
	TextArea ta;
	Checkbox cb1, cb2;
	Choice ch;
	CheckboxGroup cbg;
	Component cm;
	
    public void init() 
    {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        Component cm = new Component();		// Component class is abstract class, so can't instantiate it.
        
        CheckboxGroup cbg = new CheckboxGroup();
        
        add(lbl1 = new Label("Name          :"));
        add(tf1 = new TextField(10));

        add(lbl2 = new Label("Address       :"));
        add(ta = new TextArea(5,15));
        
        add(lbl3 = new Label("Birthday      :"));
        add(tf2 = new TextField(10)); 
        
        add(lbl4 = new Label("Gender        :"));
        
        add(ch = new Choice());
        ch.addItem("Male"); 
        ch.addItem("Female");  

        add(lbl5 = new Label("Job            :"));
        add(cb1 =new Checkbox("Student", cbg, false));
        add(cb2 = new Checkbox("Teacher", cbg, false));
                
        add(btn1 =new Button(" Register "));
        
        setSize(230, 300);
    }
}
