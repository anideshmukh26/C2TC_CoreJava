// program of static method main is accessing static variables without object

package day4;

class StaticMethodDemo
{
	static int age = 25;
	static String name = "Aniket";
	   
	public static void main(String args[]) //This is a static main method
	{
		System.out.println("Age: "+age);
	    System.out.println("Name: "+name);
	}
}
