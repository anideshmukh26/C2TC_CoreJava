

package com.hibernate.shopping.service;

import com.hibernate.shopping.entities.MallAdmin;

public interface MallAdminService 
{
	public abstract MallAdmin addMallAdmin(MallAdmin malladmin);
	public abstract MallAdmin updateMallAdmin(MallAdmin malladmin);
	public abstract MallAdmin deleteMallAdmin(MallAdmin malladmin);
	public abstract MallAdmin searchMallAdminById(int id);
}
