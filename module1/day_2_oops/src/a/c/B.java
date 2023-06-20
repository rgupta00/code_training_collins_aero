package a.c;
import a.b.A;

public class B extends A{

	public static void main(String[] args) {
		
		//What is the diff bw default and protected?
		//------------------------------------------------
		//the protected data/method of a public class of another package is 
		//is visible to my package iff we subclass that class
		
		//default data/method or class of other package CAN NOT be access in ANY WAY
		
		//Now u need to create the object of B rather then A
		
		B b=new B();
		System.out.println(b.j);//protected data
		System.out.println(b.k);//public data
		
		b.fooProtected();//protected
		b.fooPublic();// yes we can anyway call public method
		//A a1=new A();
//		System.out.println(a1.i);//private
//	
//		System.out.println(a1.m);//default
//		System.out.println(a1.j);//protected
		
		
//		
//		System.out.println(a1.k);//public : YES
//		
//		a1.fooPublic();//only public method is access directly
//		
		
		
	}
}
