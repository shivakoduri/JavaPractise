package com.threads.scjp.examples;

public class Worker extends Thread {

	public void run() {
		System.out.println("|work|");
	}

	public static void main(String[] args) {
		Worker worker = new Worker();
		worker.start();
		worker.run();
		//worker.run();
		worker.start();
	}

}
