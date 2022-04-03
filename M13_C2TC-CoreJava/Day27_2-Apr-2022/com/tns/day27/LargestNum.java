// program that find largest number between three numbers given by user

package com.tns.day27;

import java.util.Scanner;

public class LargestNum
{
    public static void main(String[] args)
    {
       int num1 = 0, num2 = 0, num3 = 0;
       int largestNumber = 0;

       Scanner scan = new Scanner(System.in);

       System.out.print("Enter three numbers: ");
       num1 = scan.nextInt();
       num2 = scan.nextInt();
       num3 = scan.nextInt();

       if(num1 >= num2)
       {
            if(num1 >= num3) largestNumber = num1;
            else largestNumber = num3;
       } else 
       {
            if(num2>=num3) largestNumber = num2;
            else largestNumber = num3;
       }
       System.out.println("Largest number = "+ largestNumber);
       
       scan.close();
     }
 }