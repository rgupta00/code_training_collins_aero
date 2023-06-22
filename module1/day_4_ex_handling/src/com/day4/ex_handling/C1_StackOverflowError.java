package com.day4.ex_handling;

class Foo{
	public void foo(){
			foo();
	}
}
public class C1_StackOverflowError {
	
	public static void main(String[] args) {
		Foo f=new Foo();
		f.foo();
	}

}
