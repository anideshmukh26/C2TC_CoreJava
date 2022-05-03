// Program to convert temperature from Celsius to Fahrenheit degree.

package com.tns.day56;

import java.util.Scanner;

public class DegreeConversion1 
{
	public static void main(String[] Strings) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double celsius = sc.nextDouble();
        sc.close();

        double fahrenheit = ((9 * celsius + 32 * 5)/ 5.0);
        System.out.println(celsius + " degree celsius is equal to " +fahrenheit + " in Fahrenheit");
    }
}
