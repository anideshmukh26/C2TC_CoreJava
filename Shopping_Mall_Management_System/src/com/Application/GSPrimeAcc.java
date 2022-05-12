

package com.Application;

import com.Framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc
{
	private static final float Charges = 199;

	public GSPrimeAcc() {}
	
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) 
	{
		super(accNo, accNm, charges, isPrime);
	}
	
	@Override
	public void bookProduct(float charges)
	{
		
	}

	@Override
	public String toString() 
	{
		return "GSPrimeAcc [Charges : "+ Charges +"]";
	}
}
