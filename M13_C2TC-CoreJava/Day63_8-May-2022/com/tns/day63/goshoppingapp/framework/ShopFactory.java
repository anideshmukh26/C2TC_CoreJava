

package com.tns.day63.goshoppingapp.framework;

public interface ShopFactory 
{
	public abstract PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime);
	public abstract NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges);
}
