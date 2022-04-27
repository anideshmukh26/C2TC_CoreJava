// program to demonstrate FileNotFoundException (Checked Exception).

package com.tns.day51;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionDemo 
{
	public static void main(String args[])
	{
        try 
        {
            File file = new File("E://file.txt");			// This file does not exist
            FileReader fr = new FileReader(file);
        } 
        catch (FileNotFoundException e) 
        {
           System.out.println("File does not exist "+e);
        }
    }
}
