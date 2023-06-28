package com.day11.dp.creational.singleton.v2;

//What is 

class Singleton {

	private static final long serialVersionUID = -6834926027969920657L;

	private volatile static Singleton singleton = null;

	//STATIC holder pattern
	private static class InstanceHolder {
		public static Singleton instance = new Singleton();
	}

	private Singleton() {
	}

	public static Singleton getInstance() {
		return InstanceHolder.instance;
	}

}

public class DemoSingletonPattern {

	public static void main(String[] args) {

	}

}
