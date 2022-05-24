

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
		
		
		
		//-------------------X	Customer	X----------------------------//
		
		// Add records in Customer Table.
		// Row 1
		Customer cust = new Customer();
		cust.setId(101151);
		cust.setName("Anita");
		cust.setPhone("1234567890");
		cust.setEmail("anita@gmail.com");
		
		//Row 2
		Customer cust1 = new Customer();
		cust1.setId(101232);
		cust1.setName("Rushi");
		cust1.setPhone("1234567485");
		cust1.setEmail("rushi@gmail.com");
		
		System.out.println("Rows Inserted for Customer"); 
		
		
				// CRUD for Customer
				CustomerService cs = new CustomerServiceImpl(); 
				
		
		
		
		//-------------------X	Employee	X----------------------------//
		
		// Add records in employee Table.
		// Row1
		Employee emp = new Employee();
		LocalDate date =LocalDate.of(1996,9,26);
		
		emp.setId(7855);
		emp.setName("Aniket");
		emp.setDob(date);
		emp.setSalary(25000);
		emp.setAddress("Thane");
		emp.setDesignation("Cashier");
		
		// Row2
		Employee emp1 = new Employee();
		LocalDate date1 =LocalDate.of(1999,4,15);	 
		
		emp1.setId(56562);
		emp1.setName("Rutik");
		emp1.setDob(date1);
		emp1.setSalary(20000);
		emp1.setAddress("Mulund");
		emp1.setDesignation("Salesman");
		
		System.out.println("Rows Inserted for Employee"); 
		
				// CRUD for Employee
				EmployeeService es = new EmployeeServiceImpl();
				
				// ?????????	Retrieve operation	??????????///
											
				/*emp = es.searchEmployeeById(7855);
				System.out.println("Id: "+emp.getId());
				System.out.println("Name: "+emp.getName());
				System.out.println(emp); */
														
				//++++++++++	Update operation	+++++++++++++//
											
				/*emp = es.searchEmployeeById(56562);
				emp.setName("Harsh");
				emp.setSalary(15000);
				emp.setAddress("Diva");
				emp.setDesignation("Store Keeper");
				es.updateEmployee(emp); 
														
				System.out.println("Rows Updated"); */
														
				//------------	Delete operation	-----------------//
											
				/*emp = es.searchEmployeeById(56562);
				System.out.println(emp);
				es.deleteEmployee(emp);
														
				System.out.println("Row Deleted"); */
		
		
		//-------------------X	Item	X----------------------------//
		
		// Add records in Item Table.
		// Row 1
		Item item = new Item();
		LocalDate date2 =LocalDate.of(2022,3,15);
		LocalDate date3 =LocalDate.of(2032,3,15);
		
		item.setId(454646555);
		item.setName("Mobile");
		item.setManufacturing(date2);
		item.setExpiry(date3);
		item.setPrice(10000);
		item.setCategory("Android");
		
		// Row 2 
		Item item1 = new Item();
		LocalDate date4 =LocalDate.of(2021,10,10);
		LocalDate date5 =LocalDate.of(2025,3,28);
		
		item1.setId(8989894);
		item1.setName("MB Protien");
		item1.setManufacturing(date4);
		item1.setExpiry(date5);
		item1.setPrice(4500);
		item1.setCategory("Food");
		
		System.out.println("Rows Inserted for Item");
		
				// CRUD for Item
				ItemService is = new ItemServiceImpl();
		
		
		//-------------------X	MallAdmin	X----------------------------//
		
		// Add records in MallAdmin Table.
		// Row 1
		MallAdmin mallad = new MallAdmin();
		
		mallad.setName("Raju");
		mallad.setPassword("1234");
		mallad.setPhone("1457495614");
		
		// Row 2
		MallAdmin mallad1 = new MallAdmin();
		
		mallad1.setName("Mohatsim");
		mallad1.setPassword("1474");
		mallad1.setPhone("1457416544");
		
		System.out.println("Rows Inserted for MallAdmin");
		
		
				// CRUD for MallAdmin 
				MallAdminService mas = new MallAdminServiceImpl();

		
		
		//-------------------X	Mall	X----------------------------//
		
		// Add records in Mall Table.
		// Row 1
		Mall mall = new Mall();
		
		mall.setId(1111);
		mall.setMallName("Korum");
		mall.setLocation("Thane");
		mall.setCategories("Metro city");
		
		// Row 2
		Mall mall1 = new Mall();
		
		mall1.setId(1112);
		mall1.setMallName("Pheonix");
		mall1.setLocation("Kurla");
		mall1.setCategories("Metro city");
		
		System.out.println("Rows Inserted for Mall");
		
				// CRUD for Mall
				MallService ms = new MallServiceImpl();
				
		
		//-------------------X	OrderDetails	X----------------------------//
		
		// Add records in OrderDetails Table.
		// Row 1
		OrderDetails od = new OrderDetails();
		LocalDateTime datetime = LocalDateTime.of(2022,5,12,7,20);
		
		od.setId(7979879);
		od.setDateOfPurchase(datetime);
		od.setTotal(10000);
		od.setPaymentMode("Online");
		
		// Row 2
		OrderDetails od1 = new OrderDetails();
		LocalDateTime datetime1 = LocalDateTime.of(2022,4,26,4,30);
		
		od1.setId(6568654);
		od1.setDateOfPurchase(datetime1);
		od1.setTotal(10000);
		od1.setPaymentMode("Online");
		
		// Row 2
		OrderDetails od2 = new OrderDetails();
		LocalDateTime datetime2 = LocalDateTime.of(2022,4,26,4,30);
			
		od2.setId(6568655);
		od2.setDateOfPurchase(datetime2);
		od2.setTotal(5000);
		od2.setPaymentMode("Online");
		
		System.out.println("Rows Inserted for OrderDetails");
		
				// CRUD for OrderDetails
				OrderDetailsService ods = new OrderDetailsServiceImpl();
		
		
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
		
		
				// CRUD for Shop
				ShopService ss = new ShopServiceImpl();
		
		
		
		//-------------------X	ShopOwner	X----------------------------//
		
		// Add records in ShopOwner Table.
		ShopOwner show = new ShopOwner();
		LocalDate date6 =LocalDate.of(1980,10,10);
		
		// Row 1
		show.setId(110011);
		show.setName("Chetan");
		show.setDob(date6);
		show.setAddress("101, Raj CHS, Mulund");
		
		// Row 2
		ShopOwner show1 = new ShopOwner();
		LocalDate date7 =LocalDate.of(1990,3,28);
		
		show1.setId(110012);
		show1.setName("Harsh");
		show1.setDob(date7);
		show1.setAddress("306, Deva CHS, Kalyan");
		
		em.persist(show);
		em.persist(show1);
		
		
		System.out.println("Rows Inserted for ShopOwner");
		
				// CRUD for ShopOwner
				ShopOwnerService sos = new ShopOwnerServiceImpl();
		
	
		
		//-------------------X	User	X----------------------------//
		
		// Add records in User Table.
		// Row 1 
		User user = new User();
		
		user.setId(4254488);
		user.setName("Anita123");
		user.setType("Regular");
		user.setPassword("Anu1234");
		
		// Row 2
		User user1 = new User();
		
		user1.setId(1323255);
		user1.setName("Rushi007");
		user1.setType("New");
		user1.setPassword("Rushi@007");
		
		System.out.println("Rows Inserted for User");	
		
				// CRUD for User
				UserService us = new UserServiceImpl();
		
				
				
		
		//----------------X	1 : 1 - MAPPING	X--------------------------// 
		
		// Customer & USer
		cust.setUser(user);
		cust1.setUser(user1);
		
		em.persist(cust);
		em.persist(cust1);
		
		// MallAdmin & User
		mallad.setUser(user);
		mallad1.setUser(user1);
		
		
		// MallAdmin & Mall
		mallad.setMall(mall);
		mallad1.setMall(mall1);
		
		
		// MallAdmin & ShopOwner
		mallad.setShopowner(show);
		mallad1.setShopowner(show1);
		
		em.persist(mallad);
		em.persist(mallad1);	
		
		
		//---------------------X	1 : M - Mapping	---------------------------//
		
		// Customer & OrderDetails
		
		od.setCustomer(cust);
		em.persist(od);
		
		od1.setCustomer(cust1);
		em.persist(od1);
		
		od2.setCustomer(cust1);
		em.persist(od2);
		
		
		// Shop & Employee
		
		emp.setShop(shp);
		emp1.setShop(shp1);
		
		em.persist(emp);
		em.persist(emp1);
		
		// Shop & Item
		
		item.setShop(shp);
		item1.setShop(shp1);
		
		em.persist(item);
		em.persist(item1);

	
		
		
		em.getTransaction().commit();
		
		em.close();
		factory.close(); 
	}
}
