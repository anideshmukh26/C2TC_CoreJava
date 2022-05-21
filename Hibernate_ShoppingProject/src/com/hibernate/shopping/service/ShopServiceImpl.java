

package com.hibernate.shopping.service;

import com.hibernate.shopping.dao.ShopDao;
import com.hibernate.shopping.dao.ShopDaoImpl;
import com.hibernate.shopping.entities.Shop;

public class ShopServiceImpl implements ShopService
{
	private ShopDao shopDao;
	
	public ShopServiceImpl()
	{
		shopDao = new ShopDaoImpl();
	}

	@Override
	public Shop addShop(Shop shop) 
	{
		shopDao.beginTransaction();
		shopDao.addShop(shop);
		shopDao.commitTransaction();
		return shop;
	}

	@Override
	public Shop updateShop(Shop shop) 
	{
		shopDao.beginTransaction();
		shopDao.updateShop(shop);
		shopDao.commitTransaction();
		return shop;
	}

	@Override
	public Shop deleteShop(Shop shop) 
	{
		shopDao.beginTransaction();
		shopDao.deleteShop(shop);
		shopDao.commitTransaction();
		return shop;
	}

	@Override
	public Shop searchShopById(int id) 
	{
		Shop shop = shopDao.searchShopById(id);
		return shop;
	}
}
