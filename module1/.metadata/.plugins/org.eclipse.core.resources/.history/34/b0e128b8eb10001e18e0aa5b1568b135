package com.day7.session2.collection_basics;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class IteratorDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("raj");	//rajeev
		list.add("foo");//delele
		list.add("keshav");//
	
		//CRUD method with ListIterator
		
		ListIterator<String> it=list.listIterator();
		while(it.hasNext()) {
			String data=it.next();
			if(data.equals("raj")) {
				it.set("rajeev");//update
			}
			
			if(data.equals("foo")) {
				it.remove(); //delete
			}
			
			if(data.equals("keshav")) {
				it.add("new data");//add new data
			}
		}
		System.out.println(list);
		
		it=list.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
//		
//		Enumeration<String> it=list.elements();
//		while(it.hasMoreElements()) {
//			System.out.println(it.nextElement());
//		}
		
//		ListIterator<String> it=list.listIterator(list.size());
//		
//		while(it.hasPrevious()) {
//			System.out.println(it.previous());
//		}
		
//		it.next();
//		it.remove();
//		it.remove();
		
		
//		while(it.hasNext()) {
//			it.next();
//			it.remove();
//		}
		//System.out.println(list);
		
		//iterator (iterator design pattern)
		//Iterator : Iterator(iterate , delete), ListIterator(curd operation), Enumerator(old iterate)
	}
}
