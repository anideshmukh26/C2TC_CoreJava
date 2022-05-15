// Hibernate - Single Table Inheritance.

package com.tns.day68.hibernate.inheritance.singletableinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateSingleTableInheritance 
{
	public static void main(String[] args)
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");		// Developed connection with database

		EntityManager em = factory.createEntityManager();										// Operation on database & create update insert delete got object for communication
		em.getTransaction();																	// Start communication
		
		Employee e = new Employee();
		e.setEmpName("Bhavesh");
		e.setEmpSalary(35000);
		em.persist(e);																			// Started communication
		
		Manager m = new Manager();
		m.setEmpName("Aniket");
		m.setEmpSalary(55000);
		em.persist(m);
		
		em.getTransaction().commit();															// End of communication
		System.out.println("Rows Inserted..!!");
		
		em.close();																				// Communication close
		factory.close();																		// Connection close
	}
}
