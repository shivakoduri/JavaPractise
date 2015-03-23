package com.threads.scjp;

public class FirstThread{

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				
				System.out.println("Thread 1 started.");
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				
				System.out.println("Thread 2 started.");
			}
		});
		
		
		t2.start();
		t1.run();
		//t1.setDaemon(true);
		
		t2.run();
		
		
	}

}
