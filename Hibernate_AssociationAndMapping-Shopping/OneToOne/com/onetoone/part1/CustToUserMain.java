

package com.onetoone.part1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CustToUserMain 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory factory =  Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Customer cust = new Customer();
		
		cust.setName("Vedant");
		cust.setPhone("1234567890");
		cust.setEmail("vedant@gmail.com");
		
		User usr = new User();
		
		usr.setId(111);
		usr.setName("vedu123");
		usr.setType("Customer");
		usr.setPassword("1234");
		
		cust.setUserName(usr);
		
		em.persist(cust);
		em.persist(usr);
		
		System.out.println("Row Inserted");
		System.out.println(cust);
		System.out.println(usr);
		
		em.getTransaction().commit();
		
		em.close();
		factory.close();	
	}
}
