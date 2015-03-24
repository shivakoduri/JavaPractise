package com.threads.scjp;

public class ExtendingThread extends Thread{
	
	public ExtendingThread() {
		// Calls the Thread class constructor.
		super();
		System.out.println("In ExtendingThread constructor");
	}
	
	@Override
	public void run() {
		System.out.println("Running ExtendingThread");
		super.run();
	}

}
