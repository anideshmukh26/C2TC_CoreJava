
package com.Framework;

public class  NormalAcc extends ShopAcc
{
	private final float deliveryCharges = 0;
	
	public NormalAcc() {}
	
	@Override
	public void bookProduct(float f)
	{
		
	}

	@Override
	public String toString()
	{
		return "NormalAcc [deliveryCharges=" + deliveryCharges + "]";
	}

	public float getDeliveryCharges() 
	{
		return deliveryCharges;
	}
}
