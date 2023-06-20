package day_1.objectorientation;

class Foo{
	int i;
	static int j=10;
}

public class C_WhatGoesInsideTheClass {	
	public static void main(String[] args) {
		Foo f1=new Foo();
		f1.i=4;
		f1.j=555;
		
		Foo f2=new Foo();
		f2.i=14;
		f2.j=666;	
		
		System.out.println(f1.i);
		System.out.println(f2.i);
		
		
		
		System.out.println(f1.j);
		System.out.println(f2.j);
	}
}
