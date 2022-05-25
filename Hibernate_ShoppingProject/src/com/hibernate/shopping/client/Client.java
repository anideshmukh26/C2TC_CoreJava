

package com.hibernate.shopping.client;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hibernate.shopping.entities.Customer;
import com.hibernate.shopping.entities.Employee;
import com.hibernate.shopping.entities.Item;
import com.hibernate.shopping.entities.Mall;
import com.hibernate.shopping.entities.MallAdmin;
import com.hibernate.shopping.entities.OrderDetails;
import com.hibernate.shopping.entities.Shop;
import com.hibernate.shopping.entities.ShopOwner;
import com.hibernate.shopping.entities.User;
import com.hibernate.shopping.service.CustomerService;
import com.hibernate.shopping.service.CustomerServiceImpl;
import com.hibernate.shopping.service.EmployeeService;
import com.hibernate.shopping.service.EmployeeServiceImpl;
import com.hibernate.shopping.service.ItemService;
import com.hibernate.shopping.service.ItemServiceImpl;
import com.hibernate.shopping.service.MallAdminService;
import com.hibernate.shopping.service.MallAdminServiceImpl;
import com.hibernate.shopping.service.MallService;
import com.hibernate.shopping.service.MallServiceImpl;
import com.hibernate.shopping.service.OrderDetailsService;
import com.hibernate.shopping.service.OrderDetailsServiceImpl;
import com.hibernate.shopping.service.ShopOwnerService;
import com.hibernate.shopping.service.ShopOwnerServiceImpl;
import com.hibernate.shopping.service.ShopService;
import com.hibernate.shopping.service.ShopServiceImpl;
import com.hibernate.shopping.service.UserService;
import com.hibernate.shopping.service.UserServiceImpl;

public class Client 
{
	public static void main(String[] args)
	{
		EntityManagerFactory factory =  Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin(); 
		
		CustomerService cs = new CustomerServiceImpl();	
		EmployeeService es = new EmployeeServiceImpl();
		ItemService is = new ItemServiceImpl();
		MallAdminService mas = new MallAdminServiceImpl();
		MallService ms = new MallServiceImpl();
		OrderDetailsService ods = new OrderDetailsServiceImpl();
		ShopService ss = new ShopServiceImpl();
		ShopOwnerService sos = new ShopOwnerServiceImpl();
		UserService us = new UserServiceImpl();
		
		
		
		//-------------------X	Customer	X----------------------------//
		
		// Add records in Customer Table.
		// Row 1
	/*	Customer cust = new Customer();
		cust.setId(1014);
		cust.setName("Anita");
		cust.setPhone("8974520035");
		cust.setEmail("anita@gmail.com");
		
		//Row 2
		Customer cust1 = new Customer();
		cust1.setId(1150);
		cust1.setName("Rushi");
		cust1.setPhone("7215985402");
		cust1.setEmail("rushi@gmail.com");
		
		System.out.println("Rows Inserted for Customer"); */
		
		
				// CRUD for Customer
				
				// ?????????	Retrieve operation	??????????///
				
			/*	Customer cust = cs.searchCustomerById(1150);
				//System.out.println("Id: "+cust.getId());
				//System.out.println("Name: "+cust.getName()); 
				System.out.println(cust);	
				
				//++++++++++	Update operation	+++++++++++++//
				
			/*	Customer cust = cs.searchCustomerById(1014);
				
				cust.setName("Omkar");
				cust.setPhone("7894561230");
				cust.setEmail("Ommi18@gmail.com");
				cs.updateCustomer(cust);
				
				System.out.println("Row updated"); */
				
				//------------	Delete operation	-----------------//
				
				/*	Customer cust = cs.searchCustomerById(1150);
					cs.deleteCustomer(cust);	
					
					System.out.println("Row Deleted");	*/
		
		
		
		//-------------------X	Employee	X----------------------------//
		
		// Add records in employee Table.
		// Row 1
	/*	Employee emp = new Employee();
		
		LocalDate empdob =LocalDate.of(1995,2,5);
		
		emp.setId(2535);
		emp.setName("Raj");
		emp.setDob(empdob);
		emp.setSalary(25000);
		emp.setAddress("Ghatkopar");
		emp.setDesignation("Cashier");
		
		
		// Row 2
		Employee emp1 = new Employee();
		
		LocalDate empdob1 =LocalDate.of(1999,4,15);	 
		
		emp1.setId(1105);
		emp1.setName("Rutik");
		emp1.setDob(empdob1);
		emp1.setSalary(20000);
		emp1.setAddress("Mulund");
		emp1.setDesignation("Salesman");
		
		
		// Row 3
		Employee emp2 = new Employee();
		
		LocalDate empdob2 =LocalDate.of(1996,9,26);
				
		emp2.setId(2556);
		emp2.setName("Aniket");
		emp2.setDob(empdob2);
		emp2.setSalary(45000);
		emp2.setAddress("Thane");
		emp2.setDesignation("Manager");
		
		System.out.println("Rows Inserted for Employee");	
		
		
				// CRUD for Employee
				
				// ?????????	Retrieve operation	??????????///
											
			/*	Employee emp = es.searchEmployeeById(2556);
				System.out.println("Id: "+emp.getId());
				System.out.println("Name: "+emp.getName());	
				System.out.println(emp); */
				
														
				//++++++++++	Update operation	+++++++++++++//
											
			/*	Employee emp = es.searchEmployeeById(1105);
				emp.setName("Harsh");
				emp.setSalary(15000);
				emp.setAddress("Diva");
				emp.setDesignation("Store Keeper");
				es.updateEmployee(emp); 
														
				System.out.println("Row Updated");		*/
				
														
				//------------	Delete operation	-----------------//
											
			/*	Employee emp = es.searchEmployeeById(1105);
				System.out.println(emp);
				es.deleteEmployee(emp);
														
				System.out.println("Row Deleted");	*/
		
		
		//-------------------X	Item	X----------------------------//
		
		// Add records in Item Table.
		// Row 1
	/*	Item item = new Item();
		
		LocalDate mfdate =LocalDate.of(2022, 3, 15);
		LocalDate expdate =LocalDate.of(2032, 3, 15);
		
		item.setId(589);
		item.setName("Nokia 6.1");
		item.setManufacturing(mfdate);
		item.setExpiry(expdate);
		item.setPrice(10000);
		item.setCategory("Mobile");
		
		
		// Row 2 
		Item item1 = new Item();
		
		LocalDate mfdate1 =LocalDate.of(2021, 10, 10);
		LocalDate expdate1 =LocalDate.of(2025, 3, 28);
		
		item1.setId(8989);
		item1.setName("MB Protien");
		item1.setManufacturing(mfdate1);
		item1.setExpiry(expdate1);
		item1.setPrice(4500);
		item1.setCategory("Food");
		
		
		// Row 3
		Item item2 = new Item();
		
		LocalDate mfdate2 =LocalDate.of(2022, 1, 6);
		LocalDate expdate2 =LocalDate.of(2032, 1, 6);
				
		item2.setId(755);
		item2.setName("Apple iWatch");
		item2.setManufacturing(mfdate2);
		item2.setExpiry(expdate2);
		item2.setPrice(25000);
		item2.setCategory("Digital Watch");
		
		System.out.println("Rows Inserted for Item");
		
			
		
		//-------------------X	MallAdmin	X----------------------------//
		
		// Add records in MallAdmin Table.
		// Row 1
		MallAdmin malladmn = new MallAdmin();
		
		malladmn.setName("Siddharth");
		malladmn.setPassword("s1234");
		malladmn.setPhone("9187526569");
		
		// Row 2
		MallAdmin malladmn1 = new MallAdmin();
		
		malladmn1.setName("Prasad");
		malladmn1.setPassword("p1234");
		malladmn1.setPhone("7954003347");
		
		System.out.println("Rows Inserted for MallAdmin");	*/
		
		
	
		
			
		
		//-------------------X	Mall	X----------------------------//
		
		// Add records in Mall Table.
		// Row 1
	/*	Mall mall = new Mall();
		
		mall.setId(75);
		mall.setMallName("Viviana");
		mall.setLocation("Thane");
		mall.setCategories("Metro city");
		
		// Row 2
		Mall mall1 = new Mall();
		
		mall1.setId(99);
		mall1.setMallName("Pheonix");
		mall1.setLocation("mumbai");
		mall1.setCategories("Metro city");
		
		System.out.println("Rows Inserted for Mall");
		
		
		
		//-------------------X	OrderDetails	X----------------------------//
		
		// Add records in OrderDetails Table.
		// Row 1
		OrderDetails od = new OrderDetails();
		LocalDateTime dtop = LocalDateTime.of(2022,5,12,15,20);
		
		od.setId(7979879);
		od.setDateOfPurchase(dtop);
		od.setTotal(10000);
		od.setPaymentMode("Online");
		
		// Row 2
		OrderDetails od1 = new OrderDetails();
		LocalDateTime dtop1 = LocalDateTime.of(2022,4,26,11,30);
		
		od1.setId(6568654);
		od1.setDateOfPurchase(dtop1);
		od1.setTotal(12000);
		od1.setPaymentMode("Online");
		
		// Row 2
		OrderDetails od2 = new OrderDetails();
		LocalDateTime dtop2 = LocalDateTime.of(2022,6,7,18,05);
			
		od2.setId(68787989);
		od2.setDateOfPurchase(dtop2);
		od2.setTotal(5000);
		od2.setPaymentMode("Online");
		
		System.out.println("Rows Inserted for OrderDetails");
		
		
		
		//-------------------X	Shop	X----------------------------//
		
		// Add records in shop Table.
		// Row 1 
		Shop shp = new Shop();
		
		shp.setShopId(10654);
		shp.setShopCategory("Electronics");
		shp.setShopName("Chroma");
		shp.setCustomers("Regular");
		shp.setShopStatus("Open");
		shp.setLeaseStatus("Lease");
		
		// Row 2 
		Shop shp1 = new Shop();
		
		shp1.setShopId(10546);
		shp1.setShopCategory("Gym Accesories");
		shp1.setShopName("Muscle Blaze Fitness");
		shp1.setCustomers("New");
		shp1.setShopStatus("Open");
		shp1.setLeaseStatus("Owned");
		
		em.persist(shp);
		em.persist(shp1);
		
		System.out.println("Rows Inserted for Shop");
		
		
		
		
		//-------------------X	ShopOwner	X----------------------------//
		
		// Add records in ShopOwner Table.
		ShopOwner shown = new ShopOwner();
		LocalDate sodob =LocalDate.of(1980,10,10);
		
		// Row 1
		shown.setId(110011);
		shown.setName("Chetan");
		shown.setDob(sodob);
		shown.setAddress("101, Raj CHS, Mulund");
		
		// Row 2
		ShopOwner shown1 = new ShopOwner();
		LocalDate sodob1 =LocalDate.of(1990,3,28);
		
		shown1.setId(110012);
		shown1.setName("Harsh");
		shown1.setDob(sodob1);
		shown1.setAddress("306, Deva CHS, Kalyan");
		
		em.persist(shown);
		em.persist(shown1);
		
		
		System.out.println("Rows Inserted for ShopOwner");
		
		
		
		//-------------------X	User	X----------------------------//
		
		// Add records in User Table.
		// Row 1 
		User user = new User();
		
		user.setId(752300);
		user.setName("Anita123");
		user.setType("Customer");
		user.setPassword("Anu1234");
		
		// Row 2
		User user1 = new User();
		
		user1.setId(996581);
		user1.setName("Rushi007");
		user1.setType("Customer");
		user1.setPassword("Rushi@007");
		
		// Row 3
		User user2 = new User();
				
		user2.setId(1545);
		user2.setName("Sid786");
		user2.setType("Mall Admin");
		user2.setPassword("Sid@123");
		
		// Row 4
		User user3 = new User();
						
		user3.setId(1501);
		user3.setName("Prasad15");
		user3.setType("Mall Admin");
		user3.setPassword("Prasad@1596");
		
		System.out.println("Rows Inserted for User");	
		

		
		//----------------X		1 : 1 - MAPPING		X--------------------------// 
		
		// Customer & USer
		cust.setUser(user);
		cust1.setUser(user1);
		
		em.persist(cust);
		em.persist(cust1);
		
		
		// MallAdmin & User
		malladmn.setUser(user2);
		malladmn1.setUser(user3);
		
		
		// MallAdmin & Mall
		malladmn.setMall(mall);
		malladmn1.setMall(mall1);
		
		
		// MallAdmin & ShopOwner
		malladmn.setShopowner(shown);
		malladmn1.setShopowner(shown1);
		
		em.persist(malladmn);
		em.persist(malladmn1);	
		
		
		//------------------X		1 : M - MAPPING		X---------------------------//
		
		// Customer & OrderDetails
		
		od.setCustomer(cust);
		em.persist(od);
		
		od1.setCustomer(cust1);
		em.persist(od1);
		
		od2.setCustomer(cust1);
		em.persist(od2);
		
		
		// Shop & Employee
		
		emp.setShop(shp);
		em.persist(emp);
		
		emp1.setShop(shp1);
		em.persist(emp1);
		
		emp2.setShop(shp);
		em.persist(emp2);
		
		
		// Shop & Item
		
		item.setShop(shp);
		em.persist(item);
		
		item1.setShop(shp1);
		em.persist(item1);
		
		item2.setShop(shp);
		em.persist(item2);			*/
				
				
		/*Employee emp = es.searchEmployeeById(2556);
		es.deleteEmployee(emp);
		System.out.println("Row deleted");*/
		
		Shop shp = ss.searchShopById(10654);
		ss.deleteShop(shp);
		System.out.println("Row deleted");
	



		
		em.getTransaction().commit();
		
		em.close();
		factory.close();			
		
	}
}

