
package com.tns.day37;

import java.applet.Applet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

public class AppletMouseMotionListener extends Applet
{
	public void init() 
	{
		addMouseMotionListener(new MouseMotionAdapter()
		{
			@Override
			public void mouseMoved(MouseEvent e)
			{
				int x = e.getX();
				int y = e.getY();
				
				showStatus(String.valueOf(x)+" , "+String.valueOf(y));
			}
		});
	}
}