package com.day6.threads.a.basics;
//problem u can not extend more then one class in java
//this way of creating thread is not very common

class MyThread extends Thread{
	 public MyThread(String name) {
		super(name);
	}
	@Override
	public void run(){
		System.out.println("thread is started : "+Thread.currentThread().getName() );
		try{
			Thread.sleep(1000);
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}
		
		System.out.println("thread is finished : "+Thread.currentThread().getName() );
	}
}
public class B_DemoThread1_Using_Thread {

	public static void main(String[] args) {
	
		
		MyThread t1=new MyThread("foo");
		t1.start();
	}
}
