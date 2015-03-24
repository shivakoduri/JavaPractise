package com.threads.scjp.examples;

class R1 implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
