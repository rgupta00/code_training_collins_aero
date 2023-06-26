package com.day6.session1_quick_recap;
import java.util.*;
import java.util.Map.Entry;

public class E_DemoMap {
	public static void main(String[] args) {
		
		Map<String, Integer>map=new TreeMap<>();
		map.put("raj", 89);
		map.put("ekta", 79);
		map.put("gunika", 92);
		map.put("gunika", 99);
		//how to print the map, how hashmap internally work
		
		
		//keyset vs entryset vs java 8 syntex
		
//		Set<String> keySet = map.keySet();
//		for(String key: keySet){
//			System.out.println(key + ": "+ map.get(key));
//		}
		
		//entryset
//		Set<Entry<String, Integer>> entrySet = map.entrySet();
//		for(Entry<String , Integer> entry: entrySet){
//			System.out.println(entry.getKey()+" : "+ entry.getValue());
//		}
		
		//java 8 steams syntex
		map.forEach((k, v)-> System.out.println(k+" : "+ v));
		
	}

}
