package com.mcq.q2;

class A {
	static public void doWork(){
	 System.out.println("doing work 1");
	}
	
}

class B extends A {
	static public void doWork(){
		System.out.println("doing work 2");
	}
}

public class Demo {
	public static void main(String args[]) {
		
		A a=new B();
		a.doWork();

	}
}