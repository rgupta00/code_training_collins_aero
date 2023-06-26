package com.day6.session1_quick_recap_collection;

import java.util.*;

public class A_DemoArrayList {
	
	public static void main(String[] args) {
		List<String> list=new LinkedList<>();
		list.add("foo");
		list.add("bar");
		list.add("jar");
		list.add("foo");
		
		//iterator is used to iteate the collection
//		Iterator<String> it=list.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		ListIterator<String> it2=list.listIterator(list.size());
		while(it2.hasPrevious()){
			System.out.println(it2.previous());
		}
		
//		System.out.println(list);
//		Collections.sort(list);
//		System.out.println(list);
//		
//		int index= Collections.binarySearch(list, "jar");
//		System.out.println(index);
//		
//		 index= Collections.binarySearch(list, "raj");
//		System.out.println(index);
		
	}

}
