

package com.tns.day59;

import java.util.TreeSet;

public class TreeSetDemo1 
{
     public static void main(String args[]) 
     {
         TreeSet<String> ts1 = new TreeSet<String>();		 // TreeSet of String Type
         TreeSet<Integer> ts2 = new TreeSet<Integer>();

         // Adding elements to TreeSet<String>
         ts1.add("Aniket");
         ts1.add("Roshan");
         ts1.add("Chetan");
         ts1.add("Naseer");
         ts1.add("Harsh");
         ts1.add("Siddhu");

         System.out.println(ts1);							// Displaying TreeSet

         // Adding elements to TreeSet<Integer>
         ts2.add(88);
         ts2.add(7);
         ts2.add(101);
         ts2.add(0);
         ts2.add(3);
         ts2.add(222);
         System.out.println(ts2);
    }
 }