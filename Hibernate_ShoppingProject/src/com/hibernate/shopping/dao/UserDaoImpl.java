

package com.hibernate.shopping.dao;

import javax.persistence.EntityManager;

import com.hibernate.shopping.entities.User;

public class UserDaoImpl implements UserDao
{
	private EntityManager entityManager;
	
	public UserDaoImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public User addUser(User user)
	{
		entityManager.persist(user);
		return user;
	}

	@Override
	public User updateUser(User user) 
	{
		entityManager.merge(user);
		return user;
	}

	@Override
	public User deleteUser(User user) 
	{
		entityManager.remove(user);
		return user;
	}

	@Override
	public User searchUserById(int id) 
	{
		User user = entityManager.find(User.class, id);
		return user;
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
