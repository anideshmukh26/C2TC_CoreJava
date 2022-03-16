// Static method accessed directly in static and non-static method

package day4;

class StaticMethodDemo1
{
	static int age = 25;
	static String name = "Aniket";
	
	
	static void display()  //Static method
	{
		System.out.println("Age: "+age);
		System.out.println("Name: "+name);
	}
	void funcn() //non-static method
	{
		display();  //Static method called in non-static method	
	}
	
	public static void main(String args[])  //static main method
	{
		StaticMethodDemo1 obj = new StaticMethodDemo1();
		obj.funcn();  // object to call this non-static method
		display();  //Static method called in another static method	
	}	
}
