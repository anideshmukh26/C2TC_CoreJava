// program to demonstrate Scanner class which reads String input from user.

package day10;

import java.util.Scanner; // import scanner class

public class ScannerDemo
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in); // create a object of scanner
		System.out.print("Enter your name: ");
		
		String name= sc.nextLine();  // Reads the String value from user
		
		System.out.println("My name is: " +name);
		
		sc.close(); // closes the scanner class
	}

}
