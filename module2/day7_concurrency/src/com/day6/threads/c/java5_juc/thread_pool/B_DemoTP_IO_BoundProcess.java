package com.day6.threads.c.java5_juc.thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class IOBoundProcessJob implements Runnable {

	@Override
	public void run() {
		System.out.println("IO bound process...."
				+ Thread.currentThread().getName());
	}

}

public class B_DemoTP_IO_BoundProcess {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		

		for (int i = 0; i < 100; i++) {
			executorService.execute(new CpuBoundProcessJob());
		}

		executorService.shutdown();

	}
}
