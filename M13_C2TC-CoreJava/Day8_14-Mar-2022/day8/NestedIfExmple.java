// program of Nested If statement

package day8;

public class NestedIfExmple
{
	public static void main(String[] args)
	{
		int age = 20;
		int weight = 70;
		if(age>=18) // condition
		{
			if(weight>50)
			{
				System.out.println("You are eligible to donate blood.");
			}
		}	
	}
}
