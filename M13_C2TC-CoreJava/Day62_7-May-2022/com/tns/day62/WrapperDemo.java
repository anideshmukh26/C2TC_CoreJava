// Program that demonstrates Wrapper class (AutoBoxing & UnBoxing).

package com.tns.day62;

public class WrapperDemo 
{
    public static void main (String[] args)
    {
        Integer intObj = new Integer(7);											// Creating an Integer Object with value 7.

        int intDataType = intObj;													// UnBoxing the Object

        System.out.println("Value of object of Interger class: " + intObj);
        System.out.println("Value of int data type: " + intDataType);

        Character charObject = 'a';													// AutoBoxing of char
        
        char charDataType = charObject;												// UnBoxing of Character

        System.out.println("Value of object of Character class: " + charDataType);
        System.out.println("Value of char data type: " + charObject);
    }
}