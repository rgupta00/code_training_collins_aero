package com.day7.session2.mcq;

import java.io.FileNotFoundException;
import java.io.IOException;

//overrding and exception handling: overriden method can not throw bigger ex then base method
//no rule in case function overloading

//ctr and exception handling:  ctr of drived class can not throw smaller ex then base ctr

class P extends Exception{
	
}
class Q extends P{
	
}
class R extends Q{
	
}
class A{
	public A() throws Q{
		System.out.println("ctr of class A");
	}
}
class B extends A{
	
	public B()throws Exception{
		System.out.println("ctr of class A");
	}
}





//class A{
//	
//	public void foof() throws IOException {
//		System.out.println("foof method of class A");
//	}
//}
//class B extends A{
//	
//	public void foof(int i)throws Exception{
//		System.out.println("foof method of class B");
//	}
//}
public class Demo {

	public static void main(String[] args) {
		B b=new B();
		
//		A a=new B();
//		try {
//			a.foof();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
}
