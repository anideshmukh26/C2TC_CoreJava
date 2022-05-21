

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
		
		Customer cust1 = new Customer();
		
		cust1.setName("Vedant");
		cust1.setPhone("1234567890");
		cust1.setEmail("vedant@gmail.com");
		
		User usr = new User();
		
		usr.setId(111);
		usr.setName("vedu123");
		usr.setType("Customer");
		usr.setPassword("1234");
		
		User usr1 = new User();
		
		usr1.setId(112);
		usr1.setName("vedu123");
		usr1.setType("Customer");
		usr1.setPassword("1234");
		
		cust.setUserName(usr);
		
		em.persist(cust);
		
		cust1.setUserName(usr1);
		
		em.persist(cust1);
		
		System.out.println("Row Inserted");
		System.out.println(cust);
		System.out.println(usr);
		
		em.getTransaction().commit();
		
		em.close();
		factory.close();	
	}
}
