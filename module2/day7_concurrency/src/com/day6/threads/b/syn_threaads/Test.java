package com.day6.threads.b.syn_threaads;

//What is volatile key word does?

class Test extends Thread {

   volatile boolean keepRunning = true;

    public void run() {
    	
        while (keepRunning) {
        }
        
        System.out.println("Thread terminated.");
    }

    public static void main(String[] args) throws InterruptedException {
    	//2 threads : main and other is t
    	
    	System.out.println(Runtime.getRuntime().availableProcessors());
        Test t = new Test();
        t.start();
        Thread.sleep(1000);
        t.keepRunning = false;
        System.out.println("keepRunning set to false.");
    }
}