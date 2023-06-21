package com.day2.ex5;
//java 7 : it is 100% abstraction in java
//i can not define an instance variable inside interface,
//u  can only define static and final data only class vairable is alled

//a class can imp more then 1 interface (it is not possible class)
interface Foo{
	 int i=5;//public static final
	 void foo();// it is by default public abstract
}

interface Bar{
	 int j=5;//public static final
	 void foo2();// it is by default public abstract
}

//u want to create a class
class MyFooImpl implements Foo,Bar{

	@Override
	public void foo() {
		System.out.println(Foo.i);
		System.out.println("foo method is overriden by MyFooImpl class");
	}

	@Override
	public void foo2() {
		System.out.println(Bar.j);
		System.out.println("foo2() method is overriden by MyFooImpl class");
	}
	
}
public class A_InterfaceBasics {
	
	public static void main(String[] args) {
		Foo f=new MyFooImpl();
		f.foo();
	}

}
