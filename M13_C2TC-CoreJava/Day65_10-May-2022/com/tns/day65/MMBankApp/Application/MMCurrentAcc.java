

package com.tns.day65.MMBankApp.Application;

import com.tns.day65.MMBankApp.Framework.CurrentAcc;

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
		
	}

	@Override
	public String toString()
	{
		return super.toString()+"MMCurrentAcc []";
	}
}
