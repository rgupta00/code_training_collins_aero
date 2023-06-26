package com.day6.session1_generics.stack_v2;

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
class Stack {

	private double arr[];
	private int top;
	private final int SIZE=5;
	
	public Stack(){
		arr=new double[5];
		top=-1;
	}
	
	public void push(int data) {
		if(top==SIZE-1){
			throw new StackFullEx("stack is full");
		}
		arr[++top]=data;
	}

	public double pop() {
		if(top==-1){
			throw new StackEmptyEx("stack is empty");
		}
		return arr[top--];
	}
}

public class D_StackInJava {

	public static void main(String[] args) {

		Stack s=new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		
		
		
		
	}

}
