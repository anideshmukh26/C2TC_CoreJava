

package com.onetoone.part2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MallToMallAdminDemo
{

	public static void main(String[] args) 
	{
		EntityManagerFactory factory =  Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Mall mall = new Mall();
		
		mall.setMallName("korum Mall");
		mall.setLocation("Thane");
		mall.setCategories("MetroCity");
		
		MallAdmin ma = new MallAdmin();
		
		ma.setId(1001);
		ma.setName("Roshan");
		ma.setPassword("rp1234");
		ma.setPhone("7894561230");
		
		mall.setMallAdmin(ma);
		
		em.persist(mall);
		
		System.out.println("Row Inserted");
		
		em.getTransaction().commit();
		
		em.close();
		factory.close();
	}
}
