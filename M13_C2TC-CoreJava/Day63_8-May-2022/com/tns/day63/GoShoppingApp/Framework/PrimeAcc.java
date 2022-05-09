

package com.tns.day63.GoShoppingApp.Framework;

public class PrimeAcc extends ShopAcc
{
	private boolean isPrime;
	private static final float deliveryCharges = 0;
	
	public PrimeAcc() {}
	
	public PrimeAcc(boolean isPrime)
	{
		this.isPrime = isPrime;
	}

	@Override
	public void bookProduct(float f)
	{
		
	}

	@Override
	public String toString() 
	{
		return "PrimeAcc [isPrime=" + isPrime + "]";
	}

	public boolean isPrime() 
	{
		return isPrime;
	}

	public void setPrime(boolean isPrime) 
	{
		this.isPrime = isPrime;
	}

	public static float getDeliverycharges() 
	{
		return deliveryCharges;
	}
}