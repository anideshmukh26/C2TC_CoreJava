

package com.hibernate.shopping.service;

import com.hibernate.shopping.dao.OrderDetailsDao;
import com.hibernate.shopping.dao.OrderDetailsDaoImpl;
import com.hibernate.shopping.entities.OrderDetails;

public class OrderDetailsServiceImpl implements  OrderDetailsService
{
	private OrderDetailsDao orderdetailsDao;
	
	public  OrderDetailsServiceImpl()
	{
		orderdetailsDao = new OrderDetailsDaoImpl();
	}

	@Override
	public OrderDetails addOrderDetails(OrderDetails orderdetails)
	{
		orderdetailsDao.beginTransaction();
		orderdetailsDao.addOrderDetails(orderdetails);
		orderdetailsDao.commitTransaction();
		return orderdetails;
	}

	@Override
	public OrderDetails updateOrderDetails(OrderDetails orderdetails)
	{
		orderdetailsDao.beginTransaction();
		orderdetailsDao.updateOrderDetails(orderdetails);
		orderdetailsDao.commitTransaction();
		return orderdetails;
	}

	@Override
	public OrderDetails deleteOrderDetails(OrderDetails orderdetails) 
	{
		orderdetailsDao.beginTransaction();
		orderdetailsDao.deleteOrderDetails(orderdetails);
		orderdetailsDao.commitTransaction();
		return orderdetails;
	}

	@Override
	public OrderDetails searchOrderDetailsById(int id)
	{
		OrderDetails orderdetails = orderdetailsDao.searchOrderDetailsById(id);
		return orderdetails;
	}
}
