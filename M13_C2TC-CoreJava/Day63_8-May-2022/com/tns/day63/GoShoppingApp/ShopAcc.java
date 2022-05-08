

package com.tns.day63.GoShoppingApp;

public abstract class ShopAcc
{
	private int accNo;
	private String accNm;
	private float charges;
	
	public ShopAcc() {}
	
	public ShopAcc(int accNo, String accNm, float charges) 
	{
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	public void bookProduct(float f)
	{
		
	}
	public void items(float f)
	{
		
	}
	
	@Override
	public String toString() 
	{
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
	}
	
	public int getAccNo()
	{
		return accNo;
	}
	public void setAccNo(int accNo) 
	{
		this.accNo = accNo;
	}
	public String getAccNm() 
	{
		return accNm;
	}
	public void setAccNm(String accNm) 
	{
		this.accNm = accNm;
	}
	public float getCharges() 
	{
		return charges;
	}
	public void setCharges(float charges) 
	{
		this.charges = charges;
	}
	
}

class PrimeAcc extends ShopAcc
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

	public boolean isPrime() {
		return isPrime;
	}

	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}

	public static float getDeliverycharges() {
		return deliveryCharges;
	}
	
	
}

class NormalAcc extends ShopAcc
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

