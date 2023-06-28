package com.day6.threads.c.java5_juc.thread_pool;

class Cal implements Runnable {
	private int x, y, sum;
	
	private  volatile boolean isDone=false;
	

	public Cal(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

		sum = x + y;
		isDone=true;
		synchronized (this) {
			notifyAll();
		}
	
	}

	public synchronized int getSum() {
		if(!isDone){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return sum;
	}
}

public class D_ProblemWithRunnableRetuingValue {

	public static void main(String[] args) throws InterruptedException {
		Cal cal = new Cal(2, 4);
		Thread thread = new Thread(cal);
		thread.start();
		//thread.join();
		System.out.println(cal.getSum());
	}

}
