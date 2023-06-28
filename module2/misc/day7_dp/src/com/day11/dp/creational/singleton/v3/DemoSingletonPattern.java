package com.day11.dp.creational.singleton.v3;

//What is 
//it is always thread safe why?
class Singleton {

	private volatile static Singleton singleton = new Singleton();

	private Singleton() {}

	public static Singleton getInstance() {
		return singleton;
	}

}

public class DemoSingletonPattern {

	public static void main(String[] args) {

	}

}
