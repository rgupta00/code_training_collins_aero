package com.day6.threads.b.syn_threaads;

//BlockingQueque : java 5: used to solve producer consumer problem
//wait and notify, notifyAll

class Q{
	int n;
	boolean valueSet=false;
	//consumer t
	synchronized int get() {
		while(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("get: "+ n);
		valueSet=false;
		notify();
		return n;
	}
	//producer t2
	synchronized void put(int n) {
		while(valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.n=n;
		System.out.println("put: "+ n);
		valueSet=true;
		notify();
	}
}
//
//class Q {
//	int n;
//	synchronized int get() {
//		System.out.println("get: " + n);
//		return n;
//	}
//	synchronized void put(int n) {
//		this.n = n;
//		System.out.println("put: " + n);
//	}
//}

class Producer implements Runnable {
	Q q;

	public Producer(Q q) {
		this.q = q;
		new Thread(this).start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			q.put(i++);
		}
	}
}

class Consumer implements Runnable {
	Q q;

	public Consumer(Q q) {
		this.q = q;
		new Thread(this).start();
	}

	@Override
	public void run() {

		while (true) {
			q.get();
		}
	}
}

public class C_ProducerConsumerProblem {

	public static void main(String[] args) {

		Q q = new Q();
		Producer producer = new Producer(q);
		Consumer consumer = new Consumer(q);

	}

}
