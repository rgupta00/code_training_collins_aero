package com.day6.threads.c.java5_juc.thread_pool;

class Cal implements Runnable{
	private int x, y, sum;
	
	public Cal(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void run() {
	
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){}
		
		sum=x+y;
	}
	public synchronized int getSum() {
		return sum;
	}
}

public class D_ProblemWithRunnableRetuingValue {
	
	public static void main(String[] args)  {
		Cal cal=new Cal(2,4);
		Thread thread=new Thread(cal);
		thread.start();
		
		System.out.println(cal.getSum());
	}

}