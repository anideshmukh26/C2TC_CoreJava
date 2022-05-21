
package com.framework;

public class  NormalAcc extends ShopAcc
{
	private final float deliveryCharges = 40;
	
	public NormalAcc() {}
	
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) 
	{
		super(accNo, accNm, charges);
	}
	
	@Override
	public void bookProduct(float charges)
	{
		
	}

	public float getDeliveryCharges() 
	{
		return deliveryCharges;
	}
	
	@Override
	public String toString()
	{
		return "NormalAcc [deliveryCharges=" + deliveryCharges + "]";
	}
}