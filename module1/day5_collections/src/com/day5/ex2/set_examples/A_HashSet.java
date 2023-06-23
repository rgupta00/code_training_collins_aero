package com.day5.ex2.set_examples;
import java.util.*;
public class A_HashSet {

	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("foo");
		set.add("bar");
		set.add("jar");
		set.add("jar");
		
		
		for(String d: set){
			System.out.println(d);
		}
		
		
		
	}
}
