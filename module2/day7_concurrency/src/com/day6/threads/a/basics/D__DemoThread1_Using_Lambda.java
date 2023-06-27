package com.day6.threads.a.basics;

public class D__DemoThread1_Using_Lambda {
	
	public static void main(String[] args) {
		Thread thread=new Thread(()-> 
		System.out.println("thread is started : "+Thread.currentThread().getName() ),"A");
		thread.start();
		
	}

}
