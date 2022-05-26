

package com.application;

import com.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc
{
	public MMCurrentAcc() {}

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) 
	{
		super(accNo, accNm, accBal, creditLimit);
	}
	
	@Override
	public void withdraw(float accBal)
	{
		System.out.println("\nDear Current Account Holder :\n	Your Current Account Balance is: "+accBal+"\n			And Credit limit  is: "+creditLimit);
		System.out.println("		    	Total Amount : " +(accBal+creditLimit));
	}

	@Override
	public String toString()
	{
		return super.toString()+"MMCurrentAcc []";
	}
}
