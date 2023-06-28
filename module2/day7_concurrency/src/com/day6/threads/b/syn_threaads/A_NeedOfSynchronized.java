package com.day6.threads.b.syn_threaads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Printer ---> Client1, 2 , 3
//class Printer {
//	// any object in java can act as a lock
//	private Object lock = new Object();
//
//	public void print(String letter) {
//
//		//
//		///
//		synchronized (lock) {
//			System.out.print("[");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println(letter + "]");
//		}
//	
//	}
//}

class Printer {

	private Lock lock = new ReentrantLock(true);

	public void print(String letter) {

		try {
			lock.lock();
			System.out.print("[");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(letter + "]");
		} finally {
			lock.unlock();
		}

	}
}

class Client extends Thread {

	private Printer printer;
	private String letter;
	private Thread thread;

	public Client(Printer printer, String letter) {
		this.printer = printer;
		this.letter = letter;
		thread = new Thread(this);
		thread.start();
	}

	public void run() {
		printer.print(letter);
	}
}

public class A_NeedOfSynchronized {
	public static void main(String[] args) {

		// 1 printer shared bw 3 clients
		Printer printer = new Printer();
		Client c1 = new Client(printer, "i love java");
		Client c2 = new Client(printer, "i hate java");
		Client c3 = new Client(printer, "i am joining another project");

	}

}
