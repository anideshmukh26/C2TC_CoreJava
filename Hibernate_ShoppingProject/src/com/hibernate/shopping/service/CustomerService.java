

package com.hibernate.shopping.service;

import com.hibernate.shopping.entities.Customer;

public interface CustomerService
{
	public abstract Customer addCustomer(Customer customer);
	public abstract Customer updateCustomer(Customer customer);
	
	public abstract Customer searchCustomerById(int id);
	public abstract Customer deleteCustomer(Customer customer);
}
