// Program to demonstrate ClassNotFoundExceptionDemo (Checked Exception).

package com.tns.day51;

public class ClassNotFoundExceptionDemo
{
    private static final String CLASS_TO_LOAD = "main.java.Utils";	

    public static void main(String[] args) 
    {
        try
        {
            Class loadedClass = Class.forName(CLASS_TO_LOAD);			// This class is not there in java.util package.
            System.out.println("Class " + loadedClass + " found!");
        }
        catch (ClassNotFoundException e)
        {
            System.err.println("ClassNotFoundException : " +e);
        }
    }
}