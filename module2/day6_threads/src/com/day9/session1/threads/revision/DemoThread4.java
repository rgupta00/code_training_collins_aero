package com.day9.session1.threads.revision;

class MyJob2 implements Runnable {
	private Thread thread;

	public MyJob2(String name) {
		thread = new Thread(this, name);
	}
	public void myStart() {
		thread.start();
	}

	@Override
	public void run() {
		System.out.println("job of the thrad..."+Thread.currentThread().getName());
	}
}

public class DemoThread4 {

	public static void main(String[] args) {
			MyJob2 job2=new MyJob2("foo");
			job2.myStart();
	}

}



