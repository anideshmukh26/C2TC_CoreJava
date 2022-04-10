// Program that demonstrates equals() method in java String class.

package com.tns.day34;

public class EqualsDemo2
{
	public static void main(String[] args) 
	{
		String str1 = new String("ANIKET");		// new String object for upper case ANIKET.
        String str2 = new String("aniket");    	// new String object for lower case aniket.
        String str3 = null;						// null object.
        String str4 = "ANIKET";					// String ANIKET.
        
        // This result is false as “ANIKET” and “aniket” are with a different case.
        System.out.println("str1 and str2 are equal : "+(str1.equals(str2))); 
        
        // This result is true as both represent “ANIKET” i.e. same character sequence and that is also in the same upper case.
        System.out.println("str1 and str4 are equal : "+(str1.equals(str4)));
        
        // This result is false as “ANIKET” and “aniket” are with different case i.e. upper case and lower case respectively
        System.out.println("str2 and str4 are equal : "+(str2.equals(str4)));
        
        // This result is false as we are comparing with the null object str3.
        System.out.println("str4 and str3 are equal : "+(str4.equals(str3)));
	}
}
