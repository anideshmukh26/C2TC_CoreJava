// program to demonstrate the Calculating area of circle by taking input from user using BufferReader 

package day10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderDemo1
{
  public static void main ( String args[] ) throws IOException
  {
    System.out.print ( "Enter the radius: " );

    BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );

    String inputString = br.readLine();

    double radius = Double.parseDouble ( inputString );

    double area = 3.14 * radius * radius;

    System.out.println ( "Area of Circle is: " + area );
  }
}