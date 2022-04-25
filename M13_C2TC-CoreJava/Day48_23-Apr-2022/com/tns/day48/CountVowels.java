// Program to Count Vowels in Java String.

package com.tns.day48;

import java.util.Scanner;

public class CountVowels 
{
   public static void main(String[] args) 
   {
      
      Scanner sc = null;
      String str = null;
      int countVowel = 0;

      sc = new Scanner(System.in);

      System.out.print("Enter String:: ");
      str = sc.nextLine();

      str = str.toUpperCase();					// convert string to upperCase

      for(int i=0; i < str.length(); i++)		// check each character
      {
         if(isVowel(str.charAt(i)))
            countVowel++;
      }
      System.out.println("Number of vowels: " + countVowel);

      sc.close();
   }
   private static boolean isVowel(char ch)		// method to check vowel (only upper case)
   {
      if(ch == 'A' || ch == 'E' || ch == 'I'|| ch == 'O' || ch == 'U') 
      {
         return true;
      }
      return false; 							// else return false;
   }
}
