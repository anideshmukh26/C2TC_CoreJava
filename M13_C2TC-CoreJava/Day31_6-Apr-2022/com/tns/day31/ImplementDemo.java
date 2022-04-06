// program to demonstrate implement keyword.

package com.tns.day31;

interface ShapeArea		
{
	void getArea();
}
class Rectangle implements ShapeArea		// class inherits interface ShapeArea by using implement keyword
{
	int width, height;
	
	Rectangle(int x, int y)		// parameterized constructor
	{
		width = x;
		height = y;
	}
	public void display()
	{
		System.out.println("Width :"+width+ "\nHeight :"+height);
	}
	public void getArea()		// implementation to method getArea(). 
	{
		System.out.println("Area of Rectangle is "+(width * height));
	}
}
public class ImplementDemo
{
	public static void main(String[] args) 
	{
		Rectangle r = new Rectangle(10, 20);	
		r.display();
		r.getArea();
	}
}
