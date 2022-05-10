

package com.Application;

import com.Framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc
{
	private static final float charges = 199;

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
		return "GSPrimeAcc [Dear Prime User your product charges are : "+ charges +"]";
	}
}
