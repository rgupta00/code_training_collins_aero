package com.day6.threads.c.java5_juc.threadsafe_collection;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class C_PCUsingBLQ {

	static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(1);

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();

	}

	static void consume() throws InterruptedException {
		while (true) {
			Thread.sleep(1000);
			Integer value = queue.take();
			System.out.println("taken: " + value + " size : " + queue.size());
		}
	}

	static void produce() throws InterruptedException {
		Random r = new Random();
		while (true) {
			int data=r.nextInt(10);
			System.out.println("put : "+ data);
			queue.put(data);
		}
	}

}
