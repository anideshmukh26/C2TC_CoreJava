

package com.hibernate.shopping.dao;

import com.hibernate.shopping.entities.Customer;

public interface CustomerDao 
{
	public abstract Customer addCustomer(Customer customer);
	public abstract Customer updateCustomer(Customer customer);
	
	public abstract Customer searchCustomerById(int id);
	public abstract Customer deleteCustomer(Customer customer);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}
