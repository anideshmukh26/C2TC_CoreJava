// Program that takes an integer number between 0 and 1000 and adds all the digits in the integer.

package com.tns.day56;

import java.util.Scanner;

public class AddDigits 
{
    public static void main(String[] Strings)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer number between 0 and 1000: ");
        int num = sc.nextInt();
        sc.close();
        
        int firstDigit = num % 10;
        int remainingNumber = num / 10;
        
        int SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        
        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        
        int fourthDigit = remainingNumber % 10;
        
        int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
        System.out.println("The sum of all digits in " + num + " is " + sum);
    }
}

