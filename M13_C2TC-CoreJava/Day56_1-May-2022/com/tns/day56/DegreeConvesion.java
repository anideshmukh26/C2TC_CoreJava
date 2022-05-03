// Program to convert temperature from Fahrenheit to Celsius degree.

package com.tns.day56;

import java.util.Scanner;

public class DegreeConvesion
{
    public static void main(String[] Strings) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        sc.close();

        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }
}

