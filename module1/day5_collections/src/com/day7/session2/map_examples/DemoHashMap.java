package com.day7.session2.map_examples;
import java.util.*;
import java.util.Map.Entry;
public class DemoHashMap {

	public static void main(String[] args) {
		//user define key ?
		
		//emp name --> salary
		Map<String, Integer>map=new HashMap<>();
		//key can not be duplicate
		map.put("ekta", 50);
		map.put("raj", 40);
		map.put("sumit", 36);
		map.put("sumit", 45);
		map.put("gunika", 67);
		map.put("krishna", 55);
		
//		System.out.println(map.get("usha"));
//		boolean status=map.containsKey("usha");
//		System.out.println(status);
		
		//System.out.println(map);
		//keyset vs entryset(better in performace ) vs java 8
		Set<String> keySet = map.keySet();
		
		System.out.println("-------using keyset----------");
		for(String key : keySet) {
			System.out.println(key +" : "+ map.get(key));
		}
		System.out.println("-------using entryset----------");
		//entryset: better performance then keySet
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() +" : "+ entry.getValue());
		}
		
	}
}
