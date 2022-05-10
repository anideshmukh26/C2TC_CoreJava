

package com.Application;

import com.Framework.ShopFactory;

public class GSShopFactory implements ShopFactory
{
	@Override
	public GSPrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) 
	{
		GSPrimeAcc gsprime = new GSPrimeAcc();
		return gsprime;
	}
	
	@Override
	public GSNormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) 
	{
		GSNormalAcc gsnormal = new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
		return gsnormal;
	}
}
