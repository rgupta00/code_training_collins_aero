package com.day6.threads.c.java5_juc.thread_pool.c1;

import java.time.LocalDateTime;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class Task implements Runnable {

	@Override
	public void run() {
		System.out.println("Task executed on : "
				+ LocalDateTime.now().toString());
	}

}

public class ScheduledExecutorServiceExampleExp {

	public static void main(String[] args) throws InterruptedException,
			ExecutionException {

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

		System.out.println("Task scheduled to execute after 10 seconds at : "
				+ LocalDateTime.now().toString());

		Task task = new Task();
		executor.scheduleWithFixedDelay(task, 0, 1, TimeUnit.SECONDS);

		System.out.println("Shutdown and await requested at : "
				+ LocalDateTime.now().toString());
		//shutdownAndAwaitTermination(executor);
	}

	static void shutdownAndAwaitTermination(ExecutorService executorService) {
		executorService.shutdown();
		try {
			if (!executorService.awaitTermination(1, TimeUnit.HOURS)) {
				executorService.shutdownNow();
			}
		} catch (InterruptedException ie) {
			executorService.shutdownNow();
			Thread.currentThread().interrupt();
		}
	}
}