package com.day6.threads.b.syn_threaads;

public class E_DemoDeadLock {

	public static void main(String[] args) {

		final String r1 = "r1";
		final String r2 = "r2";

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (r1) {
					System.out.println("t1 get lock on r1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}

					synchronized (r2) {
						System.out.println("t1 get lock on r2");
					}
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (r1) {
					System.out.println("t2 get lock on r1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}

					synchronized (r2) {
						System.out.println("t2 get lock on r2");
					}
				}
			}
		});
		
		t1.start();
		t2.start();
		
		System.out.println("----------------------");

	}

}
