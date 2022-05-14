

package com.tns.Hibernate.Inheritance.SingleInheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateSingleInheritance 
{
	public static void main(String[] args)
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction();
		
		Employee e = new Employee();
		e.setEmpName("Bhavesh");
		e.setEmpSalary(35000);
		em.persist(e);
		
		Manager m = new Manager();
		m.setEmpName("Aniket");
		m.setEmpSalary(55000);
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("Rows Inserted..!!");
		em.close();
		factory.close();
	}
}
