package com.day6.threads.a.basics;

//worker and job
//Thread is used to create the work
//Runnale is used to creating job 

//creating worker assign job to the worker
//threads methods: sleep, join etc

//create a job
class MyJob implements Runnable{

	@Override
	public void run() {
		System.out.println("thread is started : "+Thread.currentThread().getName() );
		try{
			Thread.sleep(1000);
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}
		
		System.out.println("thread is finished : "+Thread.currentThread().getName() );
	}
	
}
public class A_DemoThread1_Using_Runnable {
	
	public static void main(String[] args) {

		System.out.println("i am in main threads: "+Thread.currentThread().getName());
		
		MyJob job=new MyJob();
		
		Thread thread=new Thread(job,"A");
		Thread thread2=new Thread(job,"B");
		Thread thread3=new Thread(job,"C");
		
	//	thread.yield();
		
		//thread.setPriority(Thread.MAX_PRIORITY-2);
		thread.start();
		thread2.start();
		thread3.start();//order of calling start method dont matter, it depend on thread scheudler
		//not on programmer 
		
		
		//how to ensure that main should finished at end?
		//method called join() method can be used to achive that
		
		try{
			
			thread.join();//ie thread is saying to main thread join after me
			thread2.join();
			thread3.join(2000);//ie hey thread main only wait for my compition for just 2sec
			//otherwise u can finished
			
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}
//		
		
		System.out.println("main threads is finished: "+Thread.currentThread().getName());
	}

}
