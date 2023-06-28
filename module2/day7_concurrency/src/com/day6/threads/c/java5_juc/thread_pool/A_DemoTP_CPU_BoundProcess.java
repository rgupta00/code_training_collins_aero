package com.day6.threads.c.java5_juc.thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class CpuBoundProcessJob implements Runnable{

	@Override
	public void run() {
		System.out.println("cpu bound process...."+ Thread.currentThread().getName());
	}
	
}
public class A_DemoTP_CPU_BoundProcess {
	public static void main(String[] args) {
		int noOfCores=Runtime.getRuntime().availableProcessors();
		
		ExecutorService executorService=Executors.newFixedThreadPool(noOfCores);
		
		for(int i=0;i<100;i++){
			executorService.execute(new CpuBoundProcessJob());
		}
		
		executorService.shutdown();
		
	}
}




