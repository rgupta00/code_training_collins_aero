package com.dp.creational.a.singleton;

public class Main2 {
	
	public static void main(String[] args) {
		MySingleton mySingleton=MySingleton.INSTANCE;
		System.out.println(mySingleton.hashCode());
		
		MySingleton mySingleton2=MySingleton.INSTANCE;
		System.out.println(mySingleton2.hashCode());
	}

}
