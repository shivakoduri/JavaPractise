package com.threads.scjp.examples;

public class Implementer implements Runnable{
	@Override
	public void run() {
		System.out.println("implementor");
	}
	
	public static void main(String[] args) {
		new Extender().start();
		new Extender(new Implementer()).start();
		new Thread(new Implementer()).start();
	}
}
