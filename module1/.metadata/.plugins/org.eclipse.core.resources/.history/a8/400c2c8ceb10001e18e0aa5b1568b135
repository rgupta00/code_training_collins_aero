package com.day7.session2.mcq.q7;

import java.util.HashSet;
import java.util.Set;

class MyClass{
	void foof() {
		System.out.println("foof of myclass");
	}
}
public class Snippet {
	public static void main(String[] args) {

		MyClass class1=new MyClass() {
			{
				System.out.println(" i am init block");
			}
			void foof() {
				
				System.out.println("foof of anonymous implementation");
			}
		
		};
		
		class1.foof();
		
		MyClass class2=new MyClass();
		class2.foof();
		
		Set<String> s2 = new HashSet<String>() {
			//init block
			{
				add("QA");
				add("dev");
			}
		};
		
		System.out.println(s2);
	}
}
