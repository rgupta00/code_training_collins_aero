package com.day2.ex0;
//what is init block means initilization block
//DRY :dont repeat yourself?

class Foo{
	//init block: common code for every ctr
	private static double value;
	
	static{
		System.out.println("it is a static init block 1");
		//static init block called only once at the class loading time
		value=Math.PI*1;
	}
	
	{
		System.out.println("some code line 2");
	}
	
	{
		System.out.println("some code line 1");
	}
	
	
	public Foo(){
		System.out.println("code for default ctr");
	}
	
	public Foo(int x){
		
		System.out.println("code for parameterized ctr");
	}
	
	static{
		System.out.println("it is a static init block 2");
	}
}
public class B_InitBlock {
	
	public static void main(String[] args) {
		Foo f=new Foo(12);
		Foo f2=new Foo();
		
	}

}
