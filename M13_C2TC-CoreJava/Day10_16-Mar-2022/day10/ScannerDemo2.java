//program that takes input of two numbers from user and returns sum, difference, division & multiplication.

package day10;

import java.util.Scanner;

public class ScannerDemo2
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1= sc.nextInt();
		System.out.print("Enter the second number: ");
		int num2= sc.nextInt();
		
		int sum= num1+num2;
		System.out.println("\nSum of number is "+sum);
		int diff= num1-num2;
		System.out.println("Difference of mumber is: "+diff);
		int div= num1/num2;
		System.out.println("Division of number is "+div);
		int mul= num1*num2;
		System.out.println("Multiplication of mumber is: "+mul);
		
		sc.close();
	}

}
