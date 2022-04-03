// program to demonstrate swapping of two numbers given by user

package com.tns.day27;

import java.util.Scanner;

public class SwapNum 
{
   public static void main(String[] args)
   {
      int x, y;
      int temp;

      Scanner scan = new Scanner(System.in);
      System.out.print("Enter two numbers: ");
      x = scan.nextInt();
      y = scan.nextInt();

      System.out.println("Values before Swapping,");
      System.out.println(" Num1 = " +x+ ", Num2 = " +y);

      temp = x;
      x = y;
      y = temp;

      System.out.println("Values After Swapping,");
      System.out.println(" Num1 = " +x+ ", Num2 = " +y);

      scan.close();
   }
}
