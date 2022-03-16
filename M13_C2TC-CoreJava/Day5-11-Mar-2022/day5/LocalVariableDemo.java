// program of local variable 

package day5;

public class LocalVariableDemo 
{
	public String test()
	{
		String localstr = "My name is Aniket !! "; // local variable
		return localstr;
	}
	public static void main(String[] args)
	{
		LocalVariableDemo lvd = new LocalVariableDemo();
		String result  =lvd.test();
		
		System.out.println("result : " + result);
	}
	
}
