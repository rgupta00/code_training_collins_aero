package com.day6.session1_generics.stack_v3;

import java.lang.reflect.Array;

class StackEmptyEx extends RuntimeException{

	public StackEmptyEx(String message) {
		super(message);
	}
}

class StackFullEx extends RuntimeException{

	public StackFullEx(String message) {
		super(message);
	}
}
class Stack<T> {

	private T arr[];
	private int top;
	private final int SIZE=5;
	
	public Stack(Class<T>clazz, int cap){
		arr=(T[])Array.newInstance(clazz, cap);//code of java reflection * core java topics
		//mokito, hib, spring boot => 
		top=-1;
	}
	
	public void push(T data) {
		if(top==SIZE-1){
			throw new StackFullEx("stack is full");
		}
		arr[++top]=data;
	}

	public T pop() {
		if(top==-1){
			throw new StackEmptyEx("stack is empty");
		}
		return arr[top--];
	}
}

public class D_StackInJava {

	public static void main(String[] args) {

		Stack<String> s=new Stack<>(String.class, 5);
		s.push("foo");
		s.push("bar");
		s.push("jar");
		s.push("car");
		s.push("apple");
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		
		
//		Stack<Integer> s=new Stack<>(Integer.class, 5);
//		s.push(1);
//		s.push(2);
//		s.push(3);
//		s.push(4);
//		s.push(5);
//		
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		
//		System.out.println(s.pop());
//		System.out.println(s.pop());
		
		
		
		
		
	}

}
