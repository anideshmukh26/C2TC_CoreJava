

package com.tns.day73.hibernate.assaociationandmapping.onetoone;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneDemo 
{
	public static void main(String[] args)
	{
		EntityManagerFactory factory =  Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Employee employee = new Employee();
		employee.setEmployeeName("Aniket");
		
		Address ad = new Address();
		ad.setAddressId(6);
		ad.setAddressLine1("102 R Chs");
		ad.setAddressLine2("Thane");
		ad.setPincode(400605);
		ad.setState("MH");
	
		//ad.setEmployeeId(employee);
		
		employee.setEmployeeAddress(ad);
		
		em.persist(employee);	
		//em.persist(ad);
		
		System.out.println("Row Inserted");
		
		em.getTransaction().commit();
		
		em.close();
		factory.close();
	}
}
