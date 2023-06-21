package com.day2.ex3;
/*
 * features of ab class
 * it can have instane varaible, static/method . ctr....
 * only limiation is that u can not create object of it
 * 
 * and if a class have ab method then it must be declare abstract
 * 
 * 
 */

 abstract class Foo{
	abstract   public void myAbMethod();
	public void foo(){
		System.out.println("foo method ");
	}
}
 class Foo2 extends Foo{

	@Override
	public void myAbMethod() {
		System.out.println("myAbMethod is overriden");
	}
	
}

public class E_AbsClass {
	
	public static void main(String[] args) {
		Foo f=new Foo2();
		f.foo();
		f.myAbMethod();
	}

}
