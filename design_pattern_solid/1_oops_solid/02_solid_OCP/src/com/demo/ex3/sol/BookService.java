package com.demo.ex3.sol;

import java.util.*;
import java.util.function.Predicate;

public class BookService {
	
	//OCP
	
	//change is the only constant in life
	
	//Behavioural parameterizatation
	
	public static List<Book> getAllBooksOnCondition(List<Book> books, Predicate<Book> predicate) {
		// book> 500
		List<Book> selectedBooks = new ArrayList<Book>();
		for (Book book : books) {
			if (predicate.test(book)) {
				selectedBooks.add(book);
			}
		}
		return selectedBooks;
	}
	

}
