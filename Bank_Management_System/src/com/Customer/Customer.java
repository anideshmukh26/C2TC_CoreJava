


package com.Customer;

import com.Application.MMBankFactory;
import com.Application.MMCurrentAcc;
import com.Application.MMSavingAcc;

public class Customer
{
	public static void main(String[] args) 
	{
		MMBankFactory mmbfactory = new MMBankFactory();
		mmbfactory.getNewSavingAcc(10001, "Aniket", 1500, true);
		mmbfactory.getNewCurrentAcc(20001, "Bhavesh", 3000, 10000);
		
		MMSavingAcc mmsaving = new MMSavingAcc();
		mmsaving.getAccNo();
		mmsaving.getAccNm();
		mmsaving.getAccBal();
		
		mmsaving.withdraw(500);
		mmsaving.toString();
		
		MMCurrentAcc mmcurrent = new MMCurrentAcc();
		mmcurrent.getAccNo();
		mmcurrent.getAccNm();
		mmcurrent.getAccBal();
		mmcurrent.getCreditLimit();
		
		mmcurrent.withdraw(800);
		mmcurrent.toString();
	}
}
