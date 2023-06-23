package com.day9.session1.threads2;

class Cal implements Runnable{
	private int x, y, sum;
	private boolean isDone=false;
	
	public Cal(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void run() {
		sum=x+y;
		isDone=true;
		synchronized (this) {
			notifyAll();
		}
	}
	public synchronized int getSum() {
		if(!isDone) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return sum;
	}
}

public class ThradAndProcessingResult {
	
	public static void main(String[] args)  {
		Cal cal=new Cal(2,4);
		Thread thread=new Thread(cal);
		thread.start();
		
		System.out.println(cal.getSum());
	}

}
