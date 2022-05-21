

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
		ShopOwnerService sos = new ShopOwnerServiceImpl();
		ShopService ss = new ShopServiceImpl();
		UserService us = new UserServiceImpl();
	
		
		// Add records in Customer Table.
		// Row 1
		Customer cust = new Customer();
		cust.setId(01);
		cust.setName("Anita");
		cust.setPhone("1234567890");
		cust.setEmail("anita@gmail.com");
		//cs.addCustomer(cust);
		

		
		//Row 2
		Customer cust1 = new Customer();
		cust1.setId(02);
		cust1.setName("Rushi");
		cust1.setPhone("1234567485");
		cust1.setEmail("rushi@gmail.com");
		//cs.addCustomer(cust1);
		
		System.out.println("Rows Inserted for Customer"); 
		
		// Add records of employee operation
		// Row1
		Employee emp = new Employee();
		LocalDate date =LocalDate.of(1996,9,26);
		
		emp.setName("Aniket");
		emp.setDob(date);
		emp.setSalary(25000);
		emp.setAddress("Thane");
		emp.setDesignation("Cashier");
		//es.addEmployee(emp);
		
		// Row2
		Employee emp1 = new Employee();
		LocalDate date1 =LocalDate.of(1999,4,15);	 
		
		emp1.setName("Rutik");
		emp1.setDob(date1);
		emp1.setSalary(20000);
		emp1.setAddress("Mulund");
		emp1.setDesignation("Salesman");
		//es.addEmployee(emp1);
		
		System.out.println("Rows Inserted for Employee"); 
		
		// Add records of Item operation
		// Row 1
		Item item = new Item();
		LocalDate date2 =LocalDate.of(2022,3,15);
		LocalDate date3 =LocalDate.of(2032,3,15);
		
		item.setName("Mobile");
		item.setManufacturing(date2);
		item.setExpiry(date3);
		item.setPrice(10000);
		item.setCategory("Android");
		//is.addItem(item);
		
		// Row 2 
		Item item1 = new Item();
		LocalDate date4 =LocalDate.of(2021,10,10);
		LocalDate date5 =LocalDate.of(2025,3,28);
		
		item1.setName("MB Protien");
		item1.setManufacturing(date4);
		item1.setExpiry(date5);
		item1.setPrice(4500);
		item1.setCategory("Food");
		//is.addItem(item1);
		
		System.out.println("Rows Inserted for Item");
		
		// Add records of MallAdmin operation
		// Row 1
		MallAdmin mallad = new MallAdmin();
		mallad.setName("Raju");
		mallad.setPassword("1234");
		mallad.setPhone("1457495614");
		//mas.addMallAdmin(mallad);
		
		// Row 2
		MallAdmin mallad1 = new MallAdmin();
		mallad1.setName("Mohatsim");
		mallad1.setPassword("1474");
		mallad1.setPhone("1457416544");
		//mas.addMallAdmin(mallad1);
		
		System.out.println("Rows Inserted for MallAdmin");
		
		// Add records of Mall operation
		// Row 1
		Mall mall = new Mall();
		
		mall.setId(1111);
		mall.setMallName("Korum");
		mall.setLocation("Thane");
		mall.setCategories("Metro city");
		//ms.addMall(mall);
		
		// Row 2
		Mall mall1 = new Mall();
		
		mall1.setId(1112);
		mall1.setMallName("Pheonix");
		mall1.setLocation("Kurla");
		mall1.setCategories("Metro city");
		//ms.addMall(mall1);
		
		System.out.println("Rows Inserted for Mall");
		
		
		// Add records of OrderDetails operation
		// Row 1
		OrderDetails od = new OrderDetails();
		LocalDateTime datetime = LocalDateTime.of(2022,5, 12, 7, 20);
		
		od.setDateOfPurchase(datetime);
		od.setTotal(10000);
		od.setPaymentMode("Online");
		//ods.addOrderDetails(od);
		
		// Row 2
		OrderDetails od1 = new OrderDetails();
		LocalDateTime datetime1 = LocalDateTime.of(2022,4,26, 4, 30);
				
		od1.setDateOfPurchase(datetime1);
		od1.setTotal(10000);
		od1.setPaymentMode("Online");
		//ods.addOrderDetails(od1);
		
		System.out.println("Rows Inserted for OrderDetails");
		
		// Add records for shop
		// Row 1 
		Shop shp = new Shop();
		
		shp.setShopId(10001);
		shp.setShopCategory("Electronics");
		shp.setShopName("Chroma");
		shp.setCustomers("Regular");
		shp.setShopStatus("Open");
		shp.setLeaseStatus("Lease");
		//ss.addShop(shp);
		
		// Row 2 
		Shop shp1 = new Shop();
		
		shp1.setShopId(10002);
		shp1.setShopCategory("Gym Accesories");
		shp1.setShopName("MB shop");
		shp1.setCustomers("New");
		shp1.setShopStatus("Open");
		shp1.setLeaseStatus("Owned");
		//ss.addShop(shp1);
		
		System.out.println("Rows Inserted for Shop");
		
		// Add records for ShopOwner
		ShopOwner show = new ShopOwner();
		LocalDate date6 =LocalDate.of(1980,10,10);
		
		// Row 1
		show.setId(110011);
		show.setName("Chetan");
		show.setDob(date6);
		show.setAddress("101, Raj CHS, Mulund");
		//sos.addShopOwner(show);
		
		// Row 2
		ShopOwner show1 = new ShopOwner();
		LocalDate date7 =LocalDate.of(1990,3,28);
		
		show1.setId(110012);
		show1.setName("Harsh");
		show1.setDob(date7);
		show1.setAddress("306, Deva CHS, Kalyan");
		//sos.addShopOwner(show1);
		
		System.out.println("Rows Inserted for ShopOwner");
		
		// Add records for User
		// Row 1 
		User user = new User();
		
		user.setId(4254488);
		user.setName("Anita123");
		user.setType("Regular");
		user.setPassword("Anu1234");
		//us.addUser(user);	
		
		// Row 2
		User user1 = new User();
		
		user1.setId(1323255);
		user1.setName("Rushi007");
		user1.setType("New");
		user1.setPassword("Rushi@007");
		//us.addUser(user1);
		
		System.out.println("Rows Inserted for User");
		
		
		// 1 : 1 - MAPPING 
		
		// Customer & USer
		cust.setUser(user);
		cust1.setUser(user1);
		
		em.persist(cust);
		em.persist(cust1);
		
		// MallAdmin & User
		mallad.setUser(user);
		mallad1.setUser(user1);
		
		em.persist(mallad);
		em.persist(mallad1);
		
		// MallAdmin & Mall
		mallad.setMall(mall);
		mallad1.setMall(mall1);
		
		em.persist(mallad);
		em.persist(mallad1);
		
		// MallAdmin & ShopOwner
		mallad.setShopowner(show);
		mallad1.setShopowner(show1);
		
		em.persist(mallad);
		em.persist(mallad1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		em.getTransaction().commit();
		
		em.close();
		factory.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Retrieve operation
		/*emp = es.searchEmployeeById(2);
		System.out.println("Id: "+employee.getId());
		System.out.println("Name: "+employee.getName());
		System.out.println(emp); */
		
		// Update operation
		/*emp = es.searchEmployeeById(3);
		emp.setName("Harsh");
		emp.setSalary(15000);
		emp.setAddress("Diva");
		emp.setDesignation("Store Keeper");
		es.updateEmployee(emp); */
		
		//System.out.println("Rows Updated"); 
		
		// Delete operation
		/*emp = es.searchEmployeeById(3);
		System.out.println(emp);
		es.deleteEmployee(emp);
		
		System.out.println("Row Deleted");*/
	}
}
