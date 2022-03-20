// program to demonstrate BufferedReader class

package day10;

import java.io.BufferedReader; // import InputOutput package & BufferedReader class
import java.io.IOException;  // import InputOutput package IOException class
import java.io.InputStreamReader;  // import InputOutput package & InputstreamReader Class

public class BufferedReaderDemo
{
	public static void main(String[] args) throws IOException  //main() method with IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));  // creating object of BufferedReader class with InputStreamReader
		
		System.out.print("Enter your name: "); // takes input from user
		
		String name= br.readLine(); // reading data using readLine
		
		System.out.println("Your name is "+name); // prints the readLine
	}
}
