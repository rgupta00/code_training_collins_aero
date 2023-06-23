package com.day9.session1.threads2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CpuBoundProcessJob implements Runnable{

	@Override
	public void run() {
		System.out.println("cpu bound process...."+ Thread.currentThread().getName());
	}
	
}
public class DemoTP {
	public static void main(String[] args) {
		int avaliableCors= Runtime.getRuntime().availableProcessors();
		
		ExecutorService es= Executors.newFixedThreadPool(avaliableCors);
		
		for(int i=0;i<100; i++) {
			es.execute(new CpuBoundProcessJob());
		}
		
	}
}




