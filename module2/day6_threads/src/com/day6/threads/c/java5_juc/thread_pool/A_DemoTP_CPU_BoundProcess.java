package com.day6.threads.c.java5_juc.thread_pool;


class CpuBoundProcessJob implements Runnable{

	@Override
	public void run() {
		System.out.println("cpu bound process...."+ Thread.currentThread().getName());
	}
	
}
public class A_DemoTP_CPU_BoundProcess {
	public static void main(String[] args) {
		
	}
}




