package com.day2.ex3;

class A{
	private int i;
	
	public A(int i){
		this.i=i;
	}
	public void printMethod(){
		System.out.println("value of i: "+ i);
	}
}
class B extends A{
	private int j;
	
	public B(int i, int j){
		super(i);
		this.j=j;
	}
	public void printMethod(){
		super.printMethod();
		System.out.println("value of j: "+ j);
	}
}

public class A_Inheritance {
	
	public static void main(String[] args) {
		
		B b=new B(6,7);
		b.printMethod();
	}

}
