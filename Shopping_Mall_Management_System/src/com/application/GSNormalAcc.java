

package com.application;

import com.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc
{
	public GSNormalAcc() {}
	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges)
	{
		super(accNo, accNm, charges, deliveryCharges);
	}

	@Override
	public void bookProduct(float charges)
	{
		
	}
	
	@Override
	public String toString()
	{
		return super.toString()+"GSNormalAcc []";
	}	
}