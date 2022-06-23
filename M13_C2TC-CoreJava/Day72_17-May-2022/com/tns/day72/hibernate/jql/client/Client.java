

package com.tns.day72.hibernate.jql.client;

import com.tns.day72.hibernate.jql.entities.Book;
import com.tns.day72.hibernate.jql.service.BookService;
import com.tns.day72.hibernate.jql.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookService bs  = new BookServiceImpl();
		Book b = new Book();
		b.setAuthor("Shah");
		b.setPrice(50.0);
		b.setTitle("PHP");
		bs.addBook(b);
		
		
		System.out.println("Row Inserted");
		
		//Count Query
		/*System.out.println("Total Number of Books:" +bs.getBookCount());
		
		//Fetch Table Query
		for(Book book: bs.getAllBooks()) {
			System.out.println(book);
		}
		
		//Fetch Single Row query
		System.out.println("Book with Id 2 " + bs.getBookById(2));*/
		
		//Fetch  by author using setParameter
		/*for(Book book1: bs.getAuthorBooks("Shah")){
			System.out.println(book1);
		}*/
		
		for(Book book2: bs.getBookByTitle("PHP")){
			System.out.println(book2);
		}
		for(Book book3: bs.getBooksInPriceRange(10, 60)){
			System.out.println(book3);
		}
	}

}
