package com.day9.session1.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class Employee{
	private int id;
	private String name;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class Demo {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//class loading static vs dynamic
		
		//static loading
		Employee employee=new Employee(1, "raj");
		
		//dynmic loading of a class: most flexible
		Class class1=Class.forName("com.day9.session1.reflection.Employee");
		
		//2
		Class class2= employee.getClass();
		
		//3
		Class class3=Employee.class;
		
		
//		Method[]methods=class1.getMethods(); //class1.getDeclaredMethods();
//		
//		for(Method m: methods) {
//			System.out.println(m.getName()+": "+ m.getModifiers()+":"+ Modifier.toString(m.getModifiers()));
//		}
//		
//		Constructor[]constructors=class1.getConstructors();
//		for(Constructor constructor: constructors) {
//			System.out.println(constructor);
//		}
		
	}
}









