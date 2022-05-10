

package com.tns.day64.GoShoppingApp.Application;

import com.tns.day63.GoShoppingApp.Framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc
{
	private static final float Charges = 699;

	public GSPrimeAcc() {}
	
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) 
	{
		super(accNo, accNm, charges, isPrime);
	}
	
	@Override
	public void bookProduct(float f)
	{
		
	}

	@Override
	public String toString() 
	{
		return "GSPrimeAcc [Dear Prime User your product charges are : "+ Charges +"]";
	}
}

