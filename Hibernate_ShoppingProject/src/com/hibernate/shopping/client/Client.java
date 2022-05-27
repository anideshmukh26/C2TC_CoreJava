/*----------------------- Java C2TC Program (TNS & CG) (Batch- B11 & M13.) --------------------------------*/
		
		/*	Group No. - 2  ( Hibernate Project - Shopping Mall Management System).
 			
 			1. Aniket Anil Deshmukh - M13. (GL)
 			2. Alfiya Javeed - B11.
 			3. Jyoti Daud - M13.
 			4. Shahud Shaikh - M13.
 		*/

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
		
		em.getTransaction().begin();			// Transaction begin
/*----------------------------------------------------------------------------------------------------------*/
		
		// Object of all enitity services used for CRUD Operations.
		
		CustomerService custservice = new CustomerServiceImpl();	
		EmployeeService empservice = new EmployeeServiceImpl();
		ItemService itemservice = new ItemServiceImpl();
		MallAdminService malladmservice = new MallAdminServiceImpl();
		MallService mallservice = new MallServiceImpl();
		OrderDetailsService odetailservice = new OrderDetailsServiceImpl();
		ShopService shopservice = new ShopServiceImpl();
		ShopOwnerService shpownerservice = new ShopOwnerServiceImpl();
		UserService userservice = new UserServiceImpl();
		
		
/*------------------------------X	Customer Entity		X--------------------------------*/
		
		// Add records in Customer Table.
		
		// Row 1 / record 1
		
		Customer cust = new Customer();		// Object of Customer for record 1
		cust.setId(1014);
		cust.setName("Anita");
		cust.setPhone("8974520035");
		cust.setEmail("anita@gmail.com");	
		
		// Row 2
	
		Customer cust1 = new Customer();	// Object of Customer for record 2
		cust1.setId(1150);
		cust1.setName("Rushi");
		cust1.setPhone("7215985402");
		cust1.setEmail("rushi@gmail.com");
		
		System.out.println("Rows Inserted in Customer Table Successfully..!!");
		
		
		/*******************	Retrieve Operation for Customer		************************/
					
				/*
					Customer cust = custservice.searchCustomerById(1150);
					System.out.println("Id: "+cust.getId());
					System.out.println("Name: "+cust.getName()); 
					System.out.println("Phone: "+cust.getPhone());
					System.out.println("Email: "+cust.getEmail());
				*/
			
					
		/*******************	Update Operation for Customer	****************************/
					
				/*
					Customer cust = custservice.searchCustomerById(1014);
					cust.setName("Omkar");
					cust.setPhone("7894561230");
					cust.setEmail("Ommi18@gmail.com");
					custservice.updateCustomer(cust);
					
					System.out.println("Row Updated in Customer Table Successfully..!!");
				*/
					
		/********************	Delete Operation for Customer	****************************/
					
				/*
					Customer cust = custservice.searchCustomerById(1150);
					custservice.deleteCustomer(cust);	
						
					System.out.println("Row Deleted in Customer Table Successfully..!!");	
				*/
			
		
/*------------------------------X	Employee Entity		X-----------------------------------*/
		
		// Add records in Employee Table.
		
		// Row 1
		Employee emp = new Employee();				// Object of Employee for record 1
		
		LocalDate empdob =LocalDate.of(1995,2,5);
		
		emp.setId(2535);
		emp.setName("Raj");
		emp.setDob(empdob);
		emp.setSalary(25000);
		emp.setAddress("Ghatkopar");
		emp.setDesignation("Cashier");
		
		
		// Row 2
		Employee emp1 = new Employee();				// Object of Employee for record 2
		
		LocalDate empdob1 =LocalDate.of(1999,4,15);	 
		
		emp1.setId(1105);
		emp1.setName("Rutik");
		emp1.setDob(empdob1);
		emp1.setSalary(20000);
		emp1.setAddress("Mulund");
		emp1.setDesignation("Salesman");
		
		
		// Row 3
		Employee emp2 = new Employee();				// Object of Employee for record 3
		
		LocalDate empdob2 =LocalDate.of(1996,9,26);
				
		emp2.setId(2556);
		emp2.setName("Aniket");
		emp2.setDob(empdob2);
		emp2.setSalary(45000);
		emp2.setAddress("Thane");
		emp2.setDesignation("Manager");
		
		System.out.println("Rows Inserted in Employee Table Successfully..!!");
		
		
		/*******************	Retrieve Operation for Employee		************************/
				
			/*
				Employee emp = empservice.searchEmployeeById(2556);
				System.out.println("Id: "+emp.getId());
				System.out.println("Name: "+emp.getName());	
				System.out.println("DOB: "+emp.getDob());
				System.out.println("Salary: "+emp.getSalary());
				System.out.println("Address: "+emp.getAddress());
				System.out.println("Desiganation: "+emp.getDesignation());										
			*/
		
		/*******************	Update Operation for Employee	****************************/
				
			/*
				Employee emp = empservice.searchEmployeeById(1105);
				emp.setName("Harsh");
				emp.setSalary(15000);
				emp.setAddress("Diva");
				emp.setDesignation("Store Keeper");
				empservice.updateEmployee(emp); 
														
				System.out.println("Row Updated in Employee Table Succefully..!!");
			*/
														
		/********************	Delete Operation for Employee	****************************/
											
			/*	
			 	Employee emp = empservice.searchEmployeeById(1105);
				empservice.deleteEmployee(emp);
														
				System.out.println("Row Deleted in Employee Table Successfully..!!");	
			*/
		
		
/*------------------------------X	Item Entity		X----------------------------------*/
		
		// Add records in Item Table.
		
		// Row 1
		Item item = new Item();							// Object of Item for record 1
		
		LocalDate mfdate =LocalDate.of(2022, 3, 15);
		LocalDate expdate =LocalDate.of(2032, 3, 15);
		
		item.setId(789456123);
		item.setName("Nokia 6.1");
		item.setManufacturing(mfdate);
		item.setExpiry(expdate);
		item.setPrice(10000);
		item.setCategory("Mobile");
		
		
		// Row 2 
		Item item1 = new Item();						// Object of Item for record 2
		
		LocalDate mfdate1 =LocalDate.of(2021, 10, 10);
		LocalDate expdate1 =LocalDate.of(2025, 3, 28);
		
		item1.setId(456123789);
		item1.setName("MB Protien");
		item1.setManufacturing(mfdate1);
		item1.setExpiry(expdate1);
		item1.setPrice(4500);
		item1.setCategory("Food");
		
		
		// Row 3
		Item item2 = new Item();						// Object of Item for record 3
		
		LocalDate mfdate2 =LocalDate.of(2022, 1, 6);
		LocalDate expdate2 =LocalDate.of(2032, 1, 6);
				
		item2.setId(123456789);
		item2.setName("Apple iWatch");
		item2.setManufacturing(mfdate2);
		item2.setExpiry(expdate2);
		item2.setPrice(30000);
		item2.setCategory("Digital Watch");
		
		System.out.println("Rows Inserted in Item Table Successfully..!!");
		
		
		/*******************	Retrieve Operation for 	Item	************************/
			
			/*
				Item item = itemservice.searchItemById(456123789);
				System.out.println("Name: "+item.getName());
				System.out.println("Name: "+item.getManufacturing());
				System.out.println("Name: "+item.getExpiry());
				System.out.println("Name: "+item.getPrice());
				System.out.println("Name: "+item.getCategory());
			*/
		
		/*******************	Update Operation for Item	****************************/
			
			/*
				Item item = itemservice.searchItemById(123456789);
				item.setName("Apple AirPod");
				item.setPrice(15000);
				item.setCategory("Earphone");
				itemservice.deleteItem(item);
				
				System.out.println("Row Updated in Item Table Succefully..!!");
			*/
													
		/********************	Delete Operation for Item	****************************/
			
			/*
				Item item = itemservice.searchItemById(789456123);
				itemservice.deleteItem(item);
				
				System.out.println("Row Deleted in Item Table Successfully..!!");
			*/
		
		
/*------------------------------X	MallAdmin Entity	X-----------------------------------*/
		// MallAdmin ID is Autogenerated.
		
		// Add records in MallAdmin Table.
		// Row 1
		MallAdmin malladmn = new MallAdmin();			// Object of MallAdmin for record 1
		
		malladmn.setName("Siddharth");
		malladmn.setPassword("s1234");
		malladmn.setPhone("9187526569");
		
		// Row 2
		MallAdmin malladmn1 = new MallAdmin();			// Object of MallAdmin for record 2
		
		malladmn1.setName("Prasad");
		malladmn1.setPassword("p1234");
		malladmn1.setPhone("7954003347");
		
		System.out.println("Rows Inserted in MallAdmin Table Successfully..!!");	
		
		
		/*******************	Retrieve Operation for MallAdmin 	************************/
				
			/*
				MallAdmin malladmn = malladmservice.searchMallAdminById(2);
				System.out.println("Name: "+malladmn.getName());
				System.out.println("Phone: "+malladmn.getPhone());
			*/

		/*******************	Update Operation for MallAdmin	****************************/
				
			/*
				MallAdmin malladmn = malladmservice.searchMallAdminById(1);
				malladmn.setName("Gaurav");
				malladmn.setPassword("g1234");
				malladmn.setPhone("8975147856");
				malladmservice.updateMallAdmin(malladmn);
				
				System.out.println("Row Updated in MallAdmin Table Succefully..!!");
			*/
												
		/********************	Delete Operation for MallAdmin	****************************/
			
			/*
				MallAdmin malladmn = malladmservice.searchMallAdminById(2);
				malladmservice.deleteMallAdmin(malladmn);
				
				System.out.println("Row Deleted in MallAdmin Table Successfully..!!");
			*/

		
/*----------------------------X		Mall Entity		X-------------------------------*/
		
		// Add records in Mall Table.
		// Row 1
		Mall mall = new Mall();					// Object of Mall for record 1
		
		mall.setId(75);
		mall.setMallName("Viviana");
		mall.setLocation("Thane");
		mall.setCategories("Metro city");
		
		// Row 2
		Mall mall1 = new Mall();				// Object of Mall for record 2
		
		mall1.setId(99);
		mall1.setMallName("Pheonix");
		mall1.setLocation("mumbai");
		mall1.setCategories("Metro city");
		
		System.out.println("Rows Inserted in Mall Table Successfully..!!");
		
		
		/*******************	Retrieve Operation for Mall 	************************/
		
			/*
				Mall mall = mallservice.searchMallById(99);
				System.out.println("Name: "+mall.getMallName());
				System.out.println("Location: "+mall.getLocation());
				System.out.println("Categories: "+mall.getCategories());
			*/

		/*******************	Update Operation for Mall	****************************/
			
			/*
				Mall mall = mallservice.searchMallById(75);
				mall.setMallName("Korum");
				mallservice.updateMall(mall);
				
				System.out.println("Row Updated in Mall  Table Succefully..!!");
			*/
											
		/********************	Delete Operation for Mall	****************************/
				
			/*
				Mall mall = mallservice.searchMallById(75);
				mallservice.deleteMall(mall);
				
				System.out.println("Row Deleted in Mall Table Successfully..!!");
			*/
		
		
/*------------------------------X	OrderDetails	X------------------------------------*/
		
		// Add records in OrderDetails Table.
		// Row 1
		OrderDetails od = new OrderDetails();							// Object of OrderDetails for record 1
		LocalDateTime dtop = LocalDateTime.of(2022,5,12,15,20);
		
		od.setId(7979879);
		od.setDateOfPurchase(dtop);
		od.setTotal(10000);
		od.setPaymentMode("Online: Gpay");
		
		// Row 2
		OrderDetails od1 = new OrderDetails();							// Object of OrderDetails for record 2
		LocalDateTime dtop1 = LocalDateTime.of(2022,4,26,11,30);
		
		od1.setId(6568654);
		od1.setDateOfPurchase(dtop1);
		od1.setTotal(12000);
		od1.setPaymentMode("Online: Card");
		
		// Row 3
		OrderDetails od2 = new OrderDetails();							// Object of OrderDetails for record 3
		LocalDateTime dtop2 = LocalDateTime.of(2022,6,7,18,05);
			
		od2.setId(68787989);
		od2.setDateOfPurchase(dtop2);
		od2.setTotal(5000);
		od2.setPaymentMode("Online: Paytm");
		
		System.out.println("Rows Inserted in OrderDetails Table Successfully..!!");
		
		
		/*******************	Retrieve Operation for OrderDetails 	************************/
			
			/*	
				OrderDetails od = odetailservice.searchOrderDetailsById(68787989);
				System.out.println("Date of Purchase: "+od.getDateOfPurchase());
				System.out.println("Total Amount: "+od.getTotal());
				System.out.println("Payment Mode: "+od.getPaymentMode());
			*/
				
		/*******************	Update Operation for OrderDetails	****************************/
			
			/*
				OrderDetails od = odetailservice.searchOrderDetailsById(6568654);
				od.setTotal(10500);
				od.setPaymentMode("Online: AmzonPay");
				odetailservice.updateOrderDetails(od);
			
				System.out.println("Row Updated in OrderDetails Succefully..!!");
			*/
										
		/********************	Delete Operation for OrderDetails	****************************/
			
			/*
				OrderDetails od = odetailservice.searchOrderDetailsById(7979879);
				odetailservice.deleteOrderDetails(od);
			
				System.out.println("Row Deleted in OrderDetails Table Successfully..!!");
			*/
		
		
/*--------------------------------X		Shop Entity		X----------------------------------------*/
		
		// Add records in shop Table.
		// Row 1 
		Shop shp = new Shop();							// Object of Shop for record 1
		
		shp.setShopId(10654);
		shp.setShopCategory("Electronics");
		shp.setShopName("Chroma");
		shp.setCustomers("Regular");
		shp.setShopStatus("Open");
		shp.setLeaseStatus("Lease");
		
		// Row 2 
		Shop shp1 = new Shop();							// Object of Shop for record 2
		
		shp1.setShopId(10546);
		shp1.setShopCategory("Gym Accesories");
		shp1.setShopName("Muscle Blaze Fitness");
		shp1.setCustomers("New");
		shp1.setShopStatus("Open");
		shp1.setLeaseStatus("Owned");
		
		em.persist(shp);
		em.persist(shp1);
		
		System.out.println("Rows Inserted in Shop Table Successfully..!!");
		
		
		/*******************	Retrieve Operation for Shop 	************************/
		
			/*
				Shop shop = shopservice.searchShopById(10546);
				System.out.println("Catgory: "+shop.getShopCategory());
				System.out.println("Name: "+shop.getShopName());
				System.out.println("Customers: "+shop.getCustomers());
				System.out.println("Shop Status: "+shop.getShopStatus());
				System.out.println("Lease Status: "+shop.getLeaseStatus());
			*/
		
		/*******************	Update Operation for Shop	****************************/
				
			/*
				Shop shop = shopservice.searchShopById(10654);
				shop.setShopName("Reliance Digital");
				shopservice.updateShop(shop);
		
				System.out.println("Row Updated in Shop Table Succefully..!!");
			*/
									
		/********************	Delete Operation for Shop	****************************/
		
			/*
				Shop shop = shopservice.searchShopById(10546);
				shopservice.deleteShop(shop);
				
				System.out.println("Row Deleted in Shop Table Successfully..!!");
			*/
		
		
/*---------------------------------X	ShopOwner Entity	X--------------------------------------*/
		
		// Add records in ShopOwner Table.
		
		// Row 1
		ShopOwner shown = new ShopOwner();						// Object of ShopOwner for record 1
		LocalDate sodob =LocalDate.of(1980,10,10);
		
		shown.setId(110011);
		shown.setName("Chetan");
		shown.setDob(sodob);
		shown.setAddress("101, Raj CHS, Mulund");
		
		// Row 2
		ShopOwner shown1 = new ShopOwner();						// Object of ShopOwner for record 2
		LocalDate sodob1 =LocalDate.of(1990,3,28);
		
		shown1.setId(104520);
		shown1.setName("Harsh");
		shown1.setDob(sodob1);
		shown1.setAddress("306, Deva CHS, Kalyan");
		
		em.persist(shown);
		em.persist(shown1);
		
		System.out.println("Rows Inserted in ShopOwner Table Successfully..!!");
		
		
		/*******************	Retrieve Operation for ShopOwner 	************************/
			
			/*
				ShopOwner shown = shpownerservice.searchShopOwnerById(110011);
				System.out.println("Name: "+shown.getName());
				System.out.println("DOB: "+shown.getDob());
				System.out.println("Address: "+shown.getAddress());
			*/
	
		/*******************	Update Operation for ShopOwner	****************************/
		
			/*
				ShopOwner shown = shpownerservice.searchShopOwnerById(104520);
				shown.setName("om");
				shown.setAddress("A-1001, Runal Heights, Thane");
				shpownerservice.updateShopOwner(shown);
	
				System.out.println("Row Updated in ShopOwner Table Succefully..!!");
			*/
								
		/********************	Delete Operation for ShopOwner	****************************/
	
			/*
				ShopOwner shown = shpownerservice.searchShopOwnerById(110011);
				shpownerservice.deleteShopOwner(shown);
			
				System.out.println("Row Deleted in ShopOwner Table Successfully..!!");
			*/
	
		
/*------------------------------------X		User Entity		X---------------------------------------------*/
		
		// Add records in User Table.
		// Row 1 
		User user = new User();					// Object of User for record 1
		
		user.setId(752300);
		user.setName("Anita123");
		user.setType("Customer");
		user.setPassword("Anu1234");
		
		// Row 2
		User user1 = new User();				// Object of User for record 2
		
		user1.setId(996581);
		user1.setName("Rushi007");
		user1.setType("Customer");
		user1.setPassword("Rushi@007");
		
		// Row 3
		User user2 = new User();				// Object of User for record 3
				
		user2.setId(1545);
		user2.setName("Sid786");
		user2.setType("Mall Admin");
		user2.setPassword("Sid@123");
		
		// Row 4
		User user3 = new User();				// Object of User for record 4
						
		user3.setId(1501);
		user3.setName("Prasad15");
		user3.setType("Mall Admin");
		user3.setPassword("Prasad@1596");
		
		System.out.println("Rows Inserted in User Table Successfully..!!");	
		
		
		/*******************	Retrieve Operation for User 	************************/
		
			/*
				User user = userservice.searchUserById(752300);
				System.out.println("User Name: "+user.getName());
				System.out.println("User Type: "+user.getType());
			*/	
				
		/*******************	Update Operation for User	****************************/
		
			/*
				User user = userservice.searchUserById(1545);
				user.setName("Ani26");
				user.setPassword("Ani@786");
				userservice.updateUser(user);
				
				System.out.println("Row Updated in User Table Succefully..!!");
			*/
							
		/********************	Delete Operation for User	****************************/
		
			/*
				User user = userservice.searchUserById(1501);
				userservice.deleteUser(user);
			
				System.out.println("Row Deleted in User Table Successfully..!!");
			*/
		

/*---------------------------------X	One To One (1 : 1) MAPPING		X------------------------------------*/ 
		
		// Customer 1 : 1  User
		cust.setUser(user);
		em.persist(cust);
		
		cust1.setUser(user1);
		em.persist(cust1);
		
		
		// MallAdmin 1 : 1 User
		malladmn.setUser(user2);
		malladmn1.setUser(user3);
		
		
		// MallAdmin 1 : 1  Mall
		malladmn.setMall(mall);
		malladmn1.setMall(mall1);
		
		
		// MallAdmin 1 : 1 ShopOwner
		malladmn.setShopowner(shown);
		malladmn1.setShopowner(shown1);
		
		// persist object of MallAdmin 
		em.persist(malladmn);
		em.persist(malladmn1);	
		
		
/*---------------------------------X	One To Many (1 : M) MAPPING		X-------------------------------------*/
		
		// Customer	1 : M OrderDetails
		
		od.setCustomer(cust);
		em.persist(od);
		
		od1.setCustomer(cust1);
		em.persist(od1);
		
		od2.setCustomer(cust1);
		em.persist(od2);
		
		
		// Shop 1 : M Employee
		
		emp.setShop(shp);
		em.persist(emp);
		
		emp1.setShop(shp1);
		em.persist(emp1);
		
		emp2.setShop(shp);
		em.persist(emp2);
		
		
		// Shop 1 : M Item
		
		item.setShop(shp);
		em.persist(item);
		
		item1.setShop(shp1);
		em.persist(item1);
		
		item2.setShop(shp);
		em.persist(item2);	
		
		
/*----------------------------------------------------------------------------------------------------*/
		em.getTransaction().commit();		// Transaction End
		
		// Resources closed.
		em.close();
		factory.close();				
	}
}

