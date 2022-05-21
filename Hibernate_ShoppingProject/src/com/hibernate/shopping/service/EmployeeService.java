

package com.hibernate.shopping.service;

import com.hibernate.shopping.entities.Employee;

public interface EmployeeService 
{
	public abstract Employee addEmployee(Employee employee);
	public abstract Employee updateEmployee(Employee employee);
	
	public abstract Employee searchEmployeeById(int id);
	public abstract Employee deleteEmployee(Employee employee);
}
