// program of static variable directly access by static method

package day4;

class StaticVariableDemo 
{
	// static (class) variables by using static keyword
    static int var1;
	static String var2;
	 
	static void disp()  //This is a Static Method
	{
		System.out.println("Var1 is: "+var1);
	    System.out.println("Var2 is: "+var2);
	}
	
	public static void main(String args[]) 
	{
		disp();
	}
}