package com.demo.ex3.sol;
import java.util.*;
import java.util.function.Predicate;
public class Main {

	public static void main(String[] args) {
		List<Book> books=Arrays.asList(
				new Book("1212", "java effective", "foo", 400),
				new Book("129", "power of subconsious mind", "foo", 600)
				);

		Predicate<Book> p1=book -> book.getTitle().contains("java");
		Predicate<Book> p2=book -> book.getPrice()>400;
		

		List<Book> selectedBooksAllJava=BookService
				.getAllBooksOnCondition(books,p1.and(p2));
		
		
		selectedBooksAllJava.forEach(b-> System.out.println(b));
		System.out.println("------------------");
	}
}
