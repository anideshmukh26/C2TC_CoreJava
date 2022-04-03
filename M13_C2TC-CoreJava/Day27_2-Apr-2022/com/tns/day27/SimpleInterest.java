// program to calculate simple interest

package com.tns.day27;

import java.util.Scanner;

public class SimpleInterest 
{
   public static void main(String[] args) 
   {
       double principalAmount = 0; 
       double rate = 0;
       double time = 0;
       double interest = 0;

       Scanner scan = new Scanner(System.in);

       System.out.print("Enter principal amount: ");
       principalAmount = scan.nextDouble();
       
       System.out.print("Enter time (in months): ");
       time = scan.nextDouble();
       
       System.out.print("Enter  the  interest rate (per year): ");
       rate = scan.nextDouble();

       interest = (principalAmount * rate * time) / 100;		// calculate simpleInterest

       System.out.println("Simple interest = "+interest);
       System.out.println("Total amount to pay = " +(principalAmount + interest));

       scan.close();
   }
}