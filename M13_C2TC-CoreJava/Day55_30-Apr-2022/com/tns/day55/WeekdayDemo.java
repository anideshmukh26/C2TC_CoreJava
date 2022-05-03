// Program that takes input from the user displays the name of the weekday.

package com.tns.day55;

import java.util.Scanner;

public class WeekdayDemo
{
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int day = sc.nextInt();
        sc.close();

        System.out.println(getDayName(day));
    }

    // Get the name for the Week
    public static String getDayName(int day) 
    {
        String dayName = "";
        switch (day)								// Switch case statement
        {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default:dayName = "Invalid day range";
        }
        return dayName;
    }
}

