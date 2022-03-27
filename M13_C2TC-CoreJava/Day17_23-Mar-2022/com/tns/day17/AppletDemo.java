//program to demonstrate applet class 

package com.tns.day17;

import java.applet.Applet;		// importing applet class.
import java.awt.TextField;		// importing TextField & Button class of awt package.
import java.awt.Button;

public class AppletDemo extends Applet		// inherit Applet class 
{
	//variable declaration of Button & TextField class
	Button b;
	TextField tf;
	
	public void init()
	{
		TextField tf = new TextField(20);		// initializing object of class TextField with argument for column size
		Button b = new Button(" Submit ");		// initializing object of class Button with Label
		
		// add method to add component
		add(tf);
		add(b);
		
		setSize(400,200);	 // setSize method to set size of applet
	}
}	

