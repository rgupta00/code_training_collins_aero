package com.day5.ex4.map_example;
import java.util.*;
import java.util.Map.Entry;
public class A_UsingHashMap {
	
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		map.put("ekta", 80);
		map.put("gunika", 100);
		map.put("raj", 84);
		map.put("keshav", 90);
		map.putIfAbsent("keshav", 89);
		
		System.out.println(map);
		
		//how to iterator through map?
		//keyset or entryset(better in perforance)
		//u need to understand how hashmap works internally?
		
		System.out.println("------------keyset-----------------");
		Set<String> keyset=map.keySet();
		for(String key: keyset){
			System.out.println(key + " : "+ map.get(key));
		}
		
		System.out.println("------------entryset-----------------");
		
		//ctr shift L
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		for(Entry<String, Integer> e: entrySet){
			System.out.println(e.getKey() +" : "+ e.getValue());
		}
		
		System.out.println("------------using java 8--------------");
		
		map.forEach((k,v)-> System.out.println(k+": "+v));
		
	}

}




