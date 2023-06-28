package com.day6.threads.c.java5_juc.threadsafe_collection;
import java.util.*;

public class A_GettingThreadSafeCollection {
	
		public static void main(String[] args) {
			//What is thread safe collection
			//Vector<String> vs Hashtable<K, V> bad performance
			//Fail fast, 2 t1 t2 ConcurrentModificationException
			 List<String> list=Collections.synchronizedList(new ArrayList<String>());
			 
			 
		}

}
