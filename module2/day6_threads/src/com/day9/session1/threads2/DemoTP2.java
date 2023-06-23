package com.day9.session1.threads2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class IOBoundProcessJob implements Runnable{

	@Override
	public void run() {
		System.out.println("IO bound process...."+ Thread.currentThread().getName());
	}
	
}
public class DemoTP2 {
	public static void main(String[] args) {
		
		ExecutorService es= Executors.newFixedThreadPool(10);
		
		for(int i=0;i<100; i++) {
			es.execute(new IOBoundProcessJob());
		}
		
	}
}




