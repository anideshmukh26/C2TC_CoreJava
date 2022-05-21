

package com.hibernate.shopping.service;

import com.hibernate.shopping.entities.Shop;

public interface ShopService 
{
	public abstract Shop addShop(Shop shop);
	public abstract Shop updateShop(Shop shop);
	public abstract Shop deleteShop(Shop shop);
	public abstract Shop searchShopById(int id);
}
