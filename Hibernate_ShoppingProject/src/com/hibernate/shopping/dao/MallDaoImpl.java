

package com.hibernate.shopping.dao;

import javax.persistence.EntityManager;

import com.hibernate.shopping.entities.Mall;

public class MallDaoImpl implements MallDao
{
	private EntityManager entityManager;
	
	public MallDaoImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Mall addMall(Mall mall) 
	{
		entityManager.persist(mall);
		return mall;
	}

	@Override
	public Mall updateMall(Mall mall) 
	{
		entityManager.merge(mall);
		return mall;
	}

	@Override
	public Mall deleteMall(Mall mall) 
	{
		entityManager.remove(mall);
		return mall;
	}

	@Override
	public Mall searchMallById(int id) 
	{
		Mall mall = entityManager.find(Mall.class, id);
		return mall;
	}

	@Override
	public void commitTransaction() 
	{
		entityManager.getTransaction().commit();
	}

	@Override
	public void beginTransaction() 
	{
		entityManager.getTransaction().begin();
	}
}
