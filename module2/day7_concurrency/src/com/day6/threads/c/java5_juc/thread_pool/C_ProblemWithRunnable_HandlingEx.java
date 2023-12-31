package com.day6.threads.c.java5_juc.thread_pool;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Thread.UncaughtExceptionHandler;

//run: it can not return the processing result
//run method can not throw the exception

class MyJob implements Runnable {

	@Override
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("foo.txt"));
			//
			System.out.println("file is found");
		} catch (FileNotFoundException ex) {
			System.out.println("file is not found");
			throw new RuntimeException(ex);
		}
	}
}

class MyExHandler implements UncaughtExceptionHandler {
	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("exception is handled :" + e.getCause());
	}
}

class CommonExHandler implements UncaughtExceptionHandler {
	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("common exception is handled :" + e.getCause());
	}
}


public class C_ProblemWithRunnable_HandlingEx {

	public static void main(String[] args) {
		// U need to create exception handler in java to handle ex from a
		// threads

		Thread.setDefaultUncaughtExceptionHandler(new CommonExHandler());
		MyJob job = new MyJob();

		Thread thread = new Thread(job);
		//thread.setUncaughtExceptionHandler(new MyExHandler());
		thread.start();

	}

}
