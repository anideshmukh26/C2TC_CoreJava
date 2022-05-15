
package com.tns.day64.goshoppingapp.client;

import com.tns.day64.goshoppingapp.application.GSNormalAcc;
import com.tns.day64.goshoppingapp.application.GSPrimeAcc;
import com.tns.day64.goshoppingapp.application.GSShopFactory;

public class Client
{
	public static void main(String[] args)
	{
		GSShopFactory gssfactory = new GSShopFactory();
		gssfactory.getNewPrimeAccount(1001,"Aniket", 499, true);
		gssfactory.getNewNormalAccount(1201,"Rushi" , 499, 40);
		
		GSPrimeAcc gsprime = new GSPrimeAcc();
		gsprime.getAccNm();
		gsprime.getAccNo();
		gsprime.getCharges();
		
		gsprime.bookProduct(700);
		gsprime.toString();
		
		GSNormalAcc gsnormal = new GSNormalAcc();
		gsnormal.getAccNm();
		gsnormal.getAccNo();
		gsnormal.getCharges();
		gsnormal.getDeliveryCharges();
		
		gsnormal.bookProduct(700);
		gsnormal.toString();
	}
}
