

package com.hibernate.shopping.service;

import com.hibernate.shopping.dao.MallAdminDao;
import com.hibernate.shopping.dao.MallAdminDaoImpl;
import com.hibernate.shopping.entities.MallAdmin;

public class MallAdminServiceImpl implements MallAdminService
{
	private MallAdminDao malladminDao;
	
	public MallAdminServiceImpl()
	{
		malladminDao = new MallAdminDaoImpl();
	}

	@Override
	public MallAdmin addMallAdmin(MallAdmin malladmin)
	{
		malladminDao.beginTransaction();
		malladminDao.addMallAdmin(malladmin);
		malladminDao.commitTransaction();
		return malladmin;
	}

	@Override
	public MallAdmin updateMallAdmin(MallAdmin malladmin)
	{
		malladminDao.beginTransaction();
		malladminDao.updateMallAdmin(malladmin);
		malladminDao.commitTransaction();
		return malladmin;
	}

	@Override
	public MallAdmin deleteMallAdmin(MallAdmin malladmin) 
	{
		malladminDao.beginTransaction();
		malladminDao.deleteMallAdmin(malladmin);
		malladminDao.commitTransaction();
		return malladmin;
	}

	@Override
	public MallAdmin searchMallAdminById(int id) 
	{
		MallAdmin malladmin = malladminDao.searchMallAdminById(id);
		return malladmin;
	}
}
