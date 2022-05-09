// Program that demonstrates Auto-boxing in wrapper class in ArrayList.

package com.tns.day62;

import java.util.ArrayList;

public class AutoBoxingDemo1 
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        //Autoboxing: int primitive to Integer (In collection framework the compiler performs autoboxing)
        arrayList.add(11);
        arrayList.add(22);
        
        System.out.println(arrayList);
    }
}