

package com.hibernate.shopping.service;


import com.hibernate.shopping.dao.MallDao;
import com.hibernate.shopping.dao.MallDaoImpl;
import com.hibernate.shopping.entities.Mall;

public class MallServiceImpl implements MallService
{
	private MallDao mallDao;
	
	public MallServiceImpl()
	{
		mallDao = new MallDaoImpl();
	}

	@Override
	public Mall addMall(Mall mall) 
	{
		mallDao.beginTransaction();
		mallDao.addMall(mall);
		mallDao.commitTransaction();
		return mall;
	}

	@Override
	public Mall updateMall(Mall mall) 
	{
		mallDao.beginTransaction();
		mallDao.updateMall(mall);
		mallDao.commitTransaction();
		return mall;
	}

	@Override
	public Mall deleteMall(Mall mall) 
	{
		mallDao.beginTransaction();
		mallDao.deleteMall(mall);
		mallDao.commitTransaction();
		return mall;
	}

	@Override
	public Mall searchMallById(int id)
	{
		Mall mall = mallDao.searchMallById(id);
		return mall;
	}
}
