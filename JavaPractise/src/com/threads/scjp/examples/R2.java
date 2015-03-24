package com.threads.scjp.examples;

public class R2 implements Runnable {
	@Override
	public void run() {
		new Thread(new R1(),"|R1a|").run();
		new Thread(new R1(),"|R1b|").start();
		System.out.print(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		new Thread(new R2(), "|R2|").start();
	}
}


/*Output:
 * |R1a|
 * |R1b|
 * |R2|
 * */
