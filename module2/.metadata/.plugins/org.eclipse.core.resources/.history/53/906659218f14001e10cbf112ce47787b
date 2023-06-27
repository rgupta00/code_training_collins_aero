package com.day6.session1.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//can be call a private ctr out side the class
class MyClass{
	//only one
	private MyClass() {
		System.out.println("dare to call me");
	}
	public void doWork(){
		System.out.println("doing work");
	}
}

public class PrivateCtr {

	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		//java reflection can even allow u to call a private method / ctr
		//java ref can break the encapuslation TRUE
		
		Class<?> clazz=
				Class.forName("com.day6.session1.reflection.MyClass");
		
		Constructor[]constructors=clazz.getDeclaredConstructors();
		constructors[0].setAccessible(true);// even if ctr is private i dont care about it i want to call that
	
		MyClass c1=(MyClass) constructors[0].newInstance();
		
		c1.doWork();
	
	}
}








