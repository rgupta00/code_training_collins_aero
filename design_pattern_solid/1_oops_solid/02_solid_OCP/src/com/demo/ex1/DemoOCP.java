package com.demo.ex1;
//Seprate what varies

//O:OCP: 
 class Calculator{
	 
	int add ( int a , int b) {
		return a+b;
	}
	

	int div ( int a , int b) {
		return a/b;
	}
	

	int mul ( int a , int b) {
		return a*b;
	}
	
}


public class DemoOCP {

	public static void main(String[] args) {
		Calculator c = new Calculator();
	
		System.out.println(c.add(2, 1));

	}
}
