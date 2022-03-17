//program of Armstrong number

package day6;

public class ArmstrongNumber
{
	static boolean armstrong(int num)
	{
		int temp=0, count=0, last=0;
		double sum=0;
		temp=num;
		
		while(temp>0)
		{
			temp = temp/10;
			count++;
		}
		temp = num;
		while(temp>0)
		{
			last = temp%10;
			sum = sum+ Math.pow(last,count);
			temp=temp/10;
		}
		if(num==sum)
		{
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args)
	{
		int num=153;
		System.out.println("The Number is " + num);
		if(armstrong(num))
		{
			System.out.println(num + " is armstrong number");
		}
		else 
		{
			System.out.println(num + " is not armstrong number");
		}		
	}	
}


