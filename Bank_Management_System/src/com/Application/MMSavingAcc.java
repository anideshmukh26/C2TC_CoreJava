

package com.Application;

import com.Framework.SavingAcc;

public class MMSavingAcc extends SavingAcc
{
	private static final float MINBAL = 1000;
	
	public MMSavingAcc() {}

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried)
	{
		super(accNo, accNm, accBal, isSalaried);
	}
	
	@Override
	public void withdraw(float accBal)
	{
		
	}

	@Override
	public String toString() 
	{
		return "MMSavingAcc [Balance : "+ MINBAL +"]";
	} 
	
	public static float getMinbal()
	{
		return MINBAL;
	}
}
