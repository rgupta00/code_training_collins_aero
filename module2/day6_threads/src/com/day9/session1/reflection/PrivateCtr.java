package com.day9.session1.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class MyClass{
	//only one
	private MyClass() {
		System.out.println("dare to call me");
	}
}

public class PrivateCtr {

	
	public static void main(String[] args) throws ClassNotFoundException,
	InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//MyClass ob=new MyClass();
		Class class1= Class.forName("com.day9.session1.reflection.MyClass");
		
		Constructor []constructors=class1.getDeclaredConstructors();
		
		constructors[0].setAccessible(true);
		
		MyClass ob= (MyClass) constructors[0].newInstance();
		
		
	}
}
