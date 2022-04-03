// program that find grade of a subject by taking marks from user.

package com.tns.day27;

import java.util.Scanner;

public class StdGrade
{
   public static String finalGrade(int score)
   {
      if(score < 0 || score > 100)
         return "Invalid score"; 		//throw exception
      
      // switch-case
      switch(score/10)
      {
        case 9:
           return "A";				// for >= 90

        case 8:
           return "B";		        // for >= 80 and <90

        case 7:
           return "C";		        // for >= 70 and <80

        case 6:
           return "D";		        // for >= 60 and <70

        case 5:
           return "E";		        // for >= 50 and <60

        default:
           return "F";		        // for < 50
      }
   }
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);

      System.out.print("Enter score value: ");
      int score = scan.nextInt();
      
      System.out.println("Grade = " + finalGrade(score));
      
      scan.close();
   }
}
