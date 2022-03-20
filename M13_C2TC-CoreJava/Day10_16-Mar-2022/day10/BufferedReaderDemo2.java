//program that takes input of two numbers from user and returns sum, difference, division & multiplication using BufferedReader

package day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo2
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the first number: ");
		int num1= Integer.parseInt(br.readLine());
		
		System.out.print("Enter the second number: ");
		int num2= Integer.parseInt(br.readLine());
		
		int sum= num1+num2;
		System.out.println("\nSum of number is "+sum);
		
		int diff= num1-num2;
		System.out.println("Difference of mumber is: "+diff);
		
		int div= num1/num2;
		System.out.println("Division of number is "+div);
		
		int mul= num1*num2;
		System.out.println("Multiplication of mumber is: "+mul);
	}
}
