

package com.hibernate.shopping.service;

import com.hibernate.shopping.entities.Mall;

public interface MallService 
{
	public abstract Mall addMall(Mall mall);
	public abstract Mall updateMall(Mall mall);
	
	public abstract Mall deleteMall(Mall mall);
	public abstract Mall searchMallById(int id);
}
