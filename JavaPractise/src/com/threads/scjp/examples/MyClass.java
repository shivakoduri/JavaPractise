package com.threads.scjp.examples;

public class MyClass extends Thread {
	
	public MyClass(String s) {
		msg = s;
	}

	String msg;

	public void run() {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		new MyClass("Hello").run();
		new MyClass("World");
		
	}
}
