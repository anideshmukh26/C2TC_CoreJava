

package com.hibernate.shopping.service;

import com.hibernate.shopping.dao.ShopOwnerDao;
import com.hibernate.shopping.dao.ShopOwnerDaoImpl;
import com.hibernate.shopping.entities.ShopOwner;

public class ShopOwnerServiceImpl implements ShopOwnerService
{
	private ShopOwnerDao shopownerDao;
	
	public ShopOwnerServiceImpl()
	{
		shopownerDao = new ShopOwnerDaoImpl();
	}

	@Override
	public ShopOwner addShopOwner(ShopOwner shopowner)
	{
		shopownerDao.beginTransaction();
		shopownerDao.addShopOwner(shopowner);
		shopownerDao.commitTransaction();
		return shopowner;
	}

	@Override
	public ShopOwner updateShopOwner(ShopOwner shopowner)
	{
		shopownerDao.beginTransaction();
		shopownerDao.updateShopOwner(shopowner);
		shopownerDao.commitTransaction();
		return shopowner;
	}

	@Override
	public ShopOwner deleteShopOwner(ShopOwner shopowner)
	{
		shopownerDao.beginTransaction();
		shopownerDao.deleteShopOwner(shopowner);
		shopownerDao.commitTransaction();
		return shopowner;
	}

	@Override
	public ShopOwner searchShopOwnerById(int id) 
	{
		ShopOwner shopowner = shopownerDao.searchShopOwnerById(id);
		return shopowner;
	}
}
