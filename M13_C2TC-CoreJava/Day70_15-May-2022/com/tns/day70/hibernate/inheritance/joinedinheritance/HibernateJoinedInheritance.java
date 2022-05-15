// Hibernate - Joined Two Tables Inheritance.

package com.tns.day70.hibernate.inheritance.joinedinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateJoinedInheritance 
{
	public static void main(String[] args)
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction();
		
		Employee e = new Employee();
		e.setEmpName("Anita");
		e.setEmpSalary(25000);
		em.persist(e);
		
		Manager m = new Manager();
		m.setEmpName("Vedant");
		m.setEmpSalary(60000);
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("Rows Inserted..!!");
		em.close();
		factory.close();
	}
}
