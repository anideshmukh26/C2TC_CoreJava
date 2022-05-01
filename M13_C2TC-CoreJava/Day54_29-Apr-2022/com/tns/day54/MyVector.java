

package com.tns.day54;

class MyVector1
{
	
}
public class MyVector
{
	public static void main(String args[])
	{
		MyVector1 v1, v2;
		
		Employee1 e1 = new Employee1(1, "Aniket", 10000);
		Employee1 e2 = new Employee1(2, "Deshmukh", 10000);
		
		v1 = new MyVector1();
		v2 = v1;
		
		System.out.println(v1.equals(v2));
		System.out.println(v1.hashCode());
		System.out.println(v1.hashCode());	
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());		// return hashcode of id
		System.out.println(e2.hashCode());
	}
}
