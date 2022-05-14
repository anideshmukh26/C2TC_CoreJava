

package com.tns.day65.MMBankApp.Application;

import com.tns.day65.MMBankApp.Framework.BankFactory;

public class MMBankFactory  implements BankFactory
{
	
	@Override
	public MMSavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried)
	{
		MMSavingAcc mmsaving = new MMSavingAcc(accNo, accNm, accBal, isSalaried);
		return mmsaving;
	}

	@Override
	public MMCurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) 
	{
		MMCurrentAcc mmcurrent = new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
		return mmcurrent;
	}
}