package com.day9.session1.threads.revision;

//t1 t2
class Foo {
	private Object lock1 = new Object();
	private Object lock2 = new Object();
	private int temp;

	// t1
	public void foof1() {
		synchronized (lock1) {
			temp++;
			System.out.println("I");
		}

	}

	// t2
	public void foof2() {
		synchronized (lock2) {
			temp--;
			System.out.println("II");
		}
	}

}

class Printer {

	private Object lock = new Object();

	public  void print(String letter) {
		//
		//
		synchronized (lock) {
			System.out.print("[" + letter);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
			System.out.println("]");
		}
		

		///
		//
	}
}

class Client implements Runnable {
	private Thread thread;
	private String letter;
	private Printer printer;

	public Client(String letter, Printer printer) {
		this.letter = letter;
		this.printer = printer;
		this.thread = new Thread(this);
		this.thread.start();
	}

	@Override
	public void run() {
		printer.print(letter);
	}

}

public class NeedOfSyn {

	public static void main(String[] args) {
		Printer printer = new Printer();

		Client client1 = new Client("i love java", printer);
		Client client2 = new Client("i love python", printer);
		Client client3 = new Client("i hate javas", printer);

	}

}