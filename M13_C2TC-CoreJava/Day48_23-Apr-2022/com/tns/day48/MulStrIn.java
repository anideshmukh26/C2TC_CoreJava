// Program to take multiple string input in java using Scanner class.

package com.tns.day48;

import java.util.Scanner;

public class MulStrIn
{
   public static void main(String[] args)
   {

      Scanner sc = new Scanner(System.in);

      String lang[] = new String[5];						// create String array of size 5
      
      System.out.println("Enter 5 Cars Name:");
      for (int i = 0; i < 5; i++)
      {
         lang[i] = sc.nextLine();
      }

      System.out.println();
      System.out.println("Cars are: ");
     
      for (int i = 0; i < 5; i++)
      {
         System.out.println(lang[i]);
      }
      sc.close();
   }
}