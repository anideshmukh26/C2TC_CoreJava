// program to demonstrate that read data of different data types using scanner class

package day10;

import java.util.Scanner;

public class ScannerDemo1
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		// string input
		System.out.print("Enter name of the student: ");
		String name= sc.nextLine();
		System.out.print("Enter branch: ");
		String branch= sc.nextLine();
		
		//Numerical data input
		System.out.print("Enter age: ");
		int age= sc.nextInt(); // reads integer type value
		System.out.print("Enter mobile no.: ");
		long mobileno= sc.nextLong(); // reads long type value
		System.out.print("Enter fees: ");
		double fees= sc.nextDouble(); // reads double type value
		
		// prints the input values
		System.out.println("\nName: "+name);
		System.out.println("Branch: "+branch);
		System.out.println("Age: "+age);
		System.out.println("Mobile Number: "+mobileno);
		System.out.println("Fees: "+fees);
		
		sc.close(); // closes scanner class
	}
}
