package com.threads.scjp.examples;

public class Threader extends Thread {
	
	Threader(String name) {
		super(name);
	}

	public void run() throws IllegalStateException {
		System.out.println(Thread.currentThread().getName());
		throw new IllegalStateException();
	}

	public static void main(String[] args) {
		new Threader("|T1|").start();
	}
}
