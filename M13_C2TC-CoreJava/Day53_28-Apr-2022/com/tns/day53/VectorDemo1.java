// Program to demonstrate add elements to Vector.

package com.tns.day53;

import java.util.Vector;

public class VectorDemo1 
{
    public static void main(String[] args) 
    {
        Vector<String> mammals= new Vector<>();

        // add(element) - adds an element to vectors
        mammals.add("Dog");				
        mammals.add("Horse");

        // add(index, element) - adds an element to the specified position
        mammals.add(0, "Cat");							
        System.out.println("Vector: " + mammals);

        // addAll(vector) - adds all elements of a vector to another vector
        Vector<String> animals = new Vector<>();
        animals.add("Tiger");

        animals.addAll(mammals);						
        System.out.println("New Vector: " + animals);
    }
}
