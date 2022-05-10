

package com.tns.day64.GoShoppingApp.Application;

import com.tns.day63.GoShoppingApp.Framework.NormalAcc;

public class GSNormalAcc extends NormalAcc
{
	public GSNormalAcc() {}
	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges)
	{
		super(accNo, accNm, charges, deliveryCharges);
	}

	@Override
	public void bookProduct(float f)
	{
		
	}
	
	@Override
	public String toString()
	{
		return "GSNormalAcc []";
	}
	
}