

package com.tns.day72.hibernate.jql.service;

import java.util.List;

import com.tns.day72.hibernate.jql.dao.BookDAO;
import com.tns.day72.hibernate.jql.dao.BookDAOImpl;
import com.tns.day72.hibernate.jql.entities.Book;

public class BookServiceImpl implements BookService{
	private BookDAO dao;
	
	public BookServiceImpl() {
		dao = new BookDAOImpl();
	}

	
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		return dao.getBookById(id);
	}

	
	public List<Book> getBookByTitle(String title) {
		// TODO Auto-generated method stub
		return dao.getBookByTitle(title);
	}

	
	public Long getBookCount() {
		// TODO Auto-generated method stub
		return dao.getBookCount();
	}

	
	public List<Book> getAuthorBooks(String author) {
		// TODO Auto-generated method stub
		return dao.getAuthorBooks(author);
	}

	
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return dao.getAllBooks();
	}

	
	public List<Book> getBooksInPriceRange(double low, double high) {
		// TODO Auto-generated method stub
		return dao.getBooksInPriceRange(low, high);
	}


	
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		dao.beginTranscation();
		dao.addBook(book);
		dao.commitTranscation();
	}

}