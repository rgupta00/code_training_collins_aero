package com.day9.session1.threads.revision;
class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("job of the thread...");
	}
}
public class DemoThread2 {

	public static void main(String[] args) {
		MyThread thread=new MyThread();
		thread.start();
		System.out.println("----------");
	}
}