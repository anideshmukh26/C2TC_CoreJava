// Program to display the current date time in specific format.

package com.tns.day55;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class SysTimeDemo1
{
	public static void main(String args[]) 
	{
		SimpleDateFormat cdt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
		//cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT+5:30")));
		
		System.out.println("\nNow: "+cdt.format(System.currentTimeMillis()));
	}
}
