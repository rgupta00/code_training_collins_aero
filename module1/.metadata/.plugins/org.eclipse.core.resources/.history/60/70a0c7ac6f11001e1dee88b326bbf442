package com.day7.session2.generics_example;
import java.util.*;
public class DemoGenerics {
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(66);
		list.add(31);
		
		//1.GPP dont mix generics and non generic code
		//dont mix milk with wine
		
		myStrangeMethod(list);
		int sum=0;
		for(Integer temp: list) {
			sum+=temp;
		}
		System.out.println(sum);
	}

	//never ever do this: dont mix generics and non generic code
	//BUGS
	static void myStrangeMethod(List list) {
		list.add("foo");
	}

}



