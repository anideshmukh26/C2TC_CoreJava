//program that takes input of two numbers from user and returns sum, difference, division & multiplication using Scanner class

package day10;

import java.util.Scanner;

public class ScannerDemo2
{
	public static void main(String[] args)
	{
		int num1, num2, sum, diff, div, mul;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the first number: ");
		num1= sc.nextInt();
		
		System.out.print("Enter the second number: ");
		num2= sc.nextInt();
		
		sc.close();
		
		sum= num1+num2;
		System.out.println("\nSum of number is "+sum);
		
		diff= num1-num2;
		System.out.println("Difference of mumber is: "+diff);
		
		div= num1/num2;
		System.out.println("Division of number is "+div);
		
		mul= num1*num2;
		System.out.println("Multiplication of mumber is: "+mul);
	}
}
