//program to demonstrate applet class 

package com.tns.day17;

import java.applet.Applet;		// importing applet class
import java.awt.TextField;		// importing TextField & Button class of awt package.
import java.awt.Button;

public class AppletDemo extends Applet		// inheriting Applet class 
{
	//variable declaration of Button & TextField class
	Button btn;
	TextField tf;
	
	
	public void init()
	{	
		TextField tf = new TextField(25);		// initializing object of class TextField with argument for column size
		Button btn = new Button(" Submit ");		// initializing object of class Button with Label
		
		//call add method to add component in applet.
		add(tf);
		add(btn);
		
		setSize(400,100);	 // call setSize method to set size of applet
	}
}	

