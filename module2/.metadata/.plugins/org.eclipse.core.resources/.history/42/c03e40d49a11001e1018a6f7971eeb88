package com.day9.session1.threads2;
//how to use callable with thread pool to solve hello world problem

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Factorial implements Callable<Long>{
	private long n;
	
	public Factorial(long n) {
		this.n = n;
	}
	@Override
	public Long call() throws Exception {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		if(n<0)
			throw new Exception("n should be positive integer");
		long fact=1;
		for(long i=1;i<=n; i++) {
			fact*=i;
		}
		return fact;
	}
	
}
public class DemoCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Factorial factorial=new Factorial(5L);//120
		
		ExecutorService es=Executors.newSingleThreadExecutor();
		
		//es.execute(command); it take runnable
		System.out.println("----");
		
		Future<Long> futureLong = es.submit(factorial);// it is not blocking
		
		System.out.println("******");
		// it will not return the value immeditly ... it will return something called "future"
		
		
		System.out.println(futureLong.get());
		System.out.println("&&&&&&&&&&");
		
		
		es.shutdown();
		
	}
}






