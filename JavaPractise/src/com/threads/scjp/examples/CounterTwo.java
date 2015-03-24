package com.threads.scjp.examples;

public class CounterTwo extends Thread {

	private int currentValue;

	public CounterTwo(String threadName) {
		super(threadName);
		currentValue = 0;
		System.out.println(this);
		//setDaemon(true);
		start();
	}

	public int getValue() {
		return currentValue;
	}

	public void run() { 
		try {
			while (currentValue < 5) {
				System.out.println(getName() + ": " + (currentValue++));
				Thread.sleep(250); 
			}
		} catch (InterruptedException e) {
			System.out.println(getName() + " interrupted.");
		}
		System.out.println("Exit from thread: " + getName());
	}
}
