// Program that demonstrates ActionListener Part-3 (class AppletActionListenerPart4 register btn1, Outside class B register btn2).

package com.tns.day32;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletActionListenerPart3 extends Applet implements ActionListener
{
	Button btn1, btn2;
	TextField tf;
	
	public void init() 
	{
		add(btn1 = new Button(" Click "));
		add(tf = new TextField(20));
		add(btn2 = new Button(" Clear "));
		
		// register component buttons with listener
		btn1.addActionListener(this);
		
		//B b= new B(this);
		btn2.addActionListener(new B());	
		
	}
	public void actionPerformed(ActionEvent e)
	{
		tf.setText(" Hello, My name is Aniket. ");
	}
}
class B  implements ActionListener
{
	/*AppletActionListenerPart3 al;
	
	B(AppletActionListenerPart3 al)
	{
		this.al = al;
	} */
	
	AppletActionListenerPart3 ap = new AppletActionListenerPart3();
	public void actionPerformed(ActionEvent e) 
	{
		ap.tf.setText(" ");
	} 
}
