package com.day9.session1.threads.revision;

public class DemoThread3 {

	public static void main(String[] args) {

		
		//Thread thread2 = new Thread(()-> System.out.println("job of the thread..."));
		
		//thread2.start();

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("job of the thread...");
			}
		});
		thread.start();
	}
}