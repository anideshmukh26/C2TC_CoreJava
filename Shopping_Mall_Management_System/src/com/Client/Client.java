

package com.Client;

import com.Application.GSNormalAcc;
import com.Application.GSPrimeAcc;
import com.Application.GSShopFactory;

public class Client
{
	public static void main(String[] args)
	{
		GSShopFactory gssfactory = new GSShopFactory();
		gssfactory.getNewPrimeAccount(1001,"Aniket", 499, false);
		gssfactory.getNewNormalAccount(1201,"Rushi" , 499, 40);
		
		GSPrimeAcc gsprime = new GSPrimeAcc();
		gsprime.getAccNm();
		gsprime.getAccNo();
		gsprime.getCharges();
		
		gsprime.bookProduct(500);
		
		gsprime.toString();
		
		GSNormalAcc gsnormal = new GSNormalAcc();
		gsnormal.getAccNm();
		gsnormal.getAccNo();
		gsnormal.getCharges();
		gsnormal.getDeliveryCharges();
		
		gsnormal.bookProduct(1000);
		
		gsnormal.toString();
	}
}
