package com.day6.threads.c.java5_juc.threadsafe_collection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


public class B_ConcurrentHashMapAndCOWAL {
	
	public static void main(String[] args) {
		//ConcurrentHashMap vs HashMap
		
		Map<String, Integer> m=new HashMap<>();
		
		Map<String, Integer> map=Collections.synchronizedMap(m );//performace issuce
		
				
		ConcurrentHashMap<String, Integer> map2=new ConcurrentHashMap<String, Integer>
		(16, 0.75f, 32);
		
		
		
		
	}

}
