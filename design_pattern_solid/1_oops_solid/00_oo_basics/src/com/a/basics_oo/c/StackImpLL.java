package com.a.basics_oo.c;

public class StackImpLL implements Stack{
	private int arr[];
	private int SIZE;
	private int top;
	public StackImpLL() {
		SIZE=5;
		arr=new int[5];
		top=-1;
	}
	
	public void push(int data) {
		if(top==SIZE-1)
			System.out.println("cant insert");
		else
			arr[++top]=data;
	}
	
	public int pop() {
		if(top==-1) {
			System.out.println("stack is empty");
			return -999;
		}
		return arr[top--];
	}
}
