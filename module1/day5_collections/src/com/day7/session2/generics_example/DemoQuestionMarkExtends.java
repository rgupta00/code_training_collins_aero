package com.day7.session2.generics_example;

import java.util.*;

public class DemoQuestionMarkExtends {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		list.add(66);
		list.add(31);

		printList(list);

		List<Double> listDouble = new ArrayList<Double>();

		listDouble.add(66.00);
		listDouble.add(31.7);
		
		printList(listDouble);
		
	}

	//DRY
//	static void printListDouble(List<Double> list) {
//		for (Double temp : list) {
//			System.out.println(temp);
//		}
//	}
	
//	static void printList(List<? extends Number> list) {
//		list.add(44);
//		for (Number temp : list) {
//			System.out.println(temp);
//		}
//	}

	static void printList(List<? extends Number> list) {
		//list.add(55.00);
		
		list.remove(new Double(696.00));//? remove on index should work, remove by value?
		
		for (Object temp : list) {
			System.out.println(temp);
		}
	}
}
