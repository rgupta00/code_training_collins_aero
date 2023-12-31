package com.day6.session1.annotation;

import java.util.*;

/*
 * java inbuild annotation
 * 	@Override
 *  @Suppressedwaring
 *  @FuncationalInterface
 *  @Deprecated
 *  
 * java custom annotation used by various fraemwroks
 * 
 */

class Foo{
	public void foof(){
		System.out.println("foof method of class Foo");
	}
	@Deprecated
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void myOldApi(){
		System.out.println("in 2007 ...");
		
		List list=new ArrayList();
		list.add("foo");
		
	}
}
class Bar extends Foo{
	
	@Override 
	//telling to the compiler to ensure that below method is also a part of parent class
	//we want to override it
	public void foof(){
		System.out.println("foof method of class Foo is overriden");
	}
	public void myNewApi(){
		System.out.println("in 2021 ...");
	}
}

public class A_NeedOfAnnotation {
	
	public static void main(String[] args) {
		Bar foo=new Bar();
		foo.foof();
		foo.myOldApi();
		foo.myNewApi();
	}

}
