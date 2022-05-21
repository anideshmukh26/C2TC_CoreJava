

package com.hibernate.shopping.dao;

import com.hibernate.shopping.entities.Mall;

public interface MallDao 
{
	public abstract Mall addMall(Mall mall);
	public abstract Mall updateMall(Mall mall);
	
	public abstract Mall deleteMall(Mall mall);
	public abstract Mall searchMallById(int id);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();	
}
