package com.day5.ex4.map_example;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class E_IdenttyHashMap {
	
	public static void main(String[] args) {
		
		
		Map<Integer, String> map=new IdentityHashMap<>();

		Integer it1=10;
		Integer it2=10;
		
		map.put(it1, "ten");
		map.put(it2, "ten");
		
		System.out.println(map);
		
		
		
		//IdentityHashMap take address of object in the consideration
		
//		Map<Integer, String> map=new IdentityHashMap<>();
//
//		Integer it1=new Integer(10);
//		Integer it2=new Integer(10);
//		
//		map.put(it1, "ten");
//		map.put(it2, "ten");
//		
//		System.out.println(map);
		
		
		//Normal HashMap take equality of object in the consideration
		
		
//		Map<Integer, String> map=new HashMap<>();
//
//		Integer it1=new Integer(10);
//		Integer it2=new Integer(10);
//		
//		map.put(it1, "ten");
//		map.put(it2, "ten");
//		
//		System.out.println(map);
	}

}
