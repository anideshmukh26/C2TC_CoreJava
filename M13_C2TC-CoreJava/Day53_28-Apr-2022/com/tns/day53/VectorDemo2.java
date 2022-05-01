// Program to demonstrate remove elements to Vector.

package com.tns.day53;

import java.util.Vector;

public class VectorDemo2 
{
	public static void main(String[] args)
	{
        Vector<String> animals= new Vector<>();
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cat");

        System.out.println("Initial Vector: " + animals);

        // remove(index) - removes an element from specified position
        String element = animals.remove(1);
        System.out.println("Removed Element: " + element);
        System.out.println("New Vector: " + animals);

        // clear()- removes all elements.
        animals.clear();
        System.out.println("Vector after clear(): " + animals);
    }
}
