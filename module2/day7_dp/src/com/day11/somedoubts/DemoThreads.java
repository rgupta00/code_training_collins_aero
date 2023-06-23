package com.day11.somedoubts;
//What is the meaning of re-enterent lock? mutex Lock

//class B extends A{
//	synchronized void m() {
//		//logically 
//		m();
//	}
//}
// thread t1 is getting a lock on object of B class then if it is calling m method then it need a
//lock associate with object of B




class Resouce implements Runnable{
	
	//t1==> get the lock associated with Resouce object( every java object have a lock associate with it)
	//and it nature is re-enterent lock
	synchronized void fooSameCode() {
		
			System.out.println("some code in foo method is started");
			try {
				Thread.sleep(100);
			}catch(InterruptedException ex) {}
			System.out.println("some code in foo method is done");
		
			foo();
		
	}
	
	 void foo() {
		 //
		 //
		synchronized (this) {
			System.out.println("some code in foo method is started");
			try {
				Thread.sleep(100);
			}catch(InterruptedException ex) {}
			System.out.println("some code in foo method is done");
		}
		///
		///
	}
	
	synchronized void bar() {
		System.out.println("some code in bar method is started ");
		try {
			Thread.sleep(100);
		}catch(InterruptedException ex) {}
		System.out.println("some code in bar method is end ");
	}

	@Override
	public void run() {
		System.out.println("some job of the threads...");
		foo();
		bar();
	}
	
}
public class DemoThreads {

	public static void main(String[] args) {
		Resouce r=new Resouce();
		
		Thread thread1=new Thread(r, "A");
		Thread thread2=new Thread(r, "B");
		
		thread1.start();
		thread2.start();
		
		
		
	}
}
