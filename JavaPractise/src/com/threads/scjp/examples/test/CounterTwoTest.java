package com.threads.scjp.examples.test;

import com.threads.scjp.examples.CounterTwo;

public class CounterTwoTest {

	public static void main(String[] args) {
		System.out.println("Method main() runs in thread "+ Thread.currentThread().getName()); // (5) Current thread
		CounterTwo counterA = new CounterTwo("Counter A"); // (6) Create a thread.
		CounterTwo counterB = new CounterTwo("Counter B"); // (7) Create a thread.
		System.out.println("Exit from main() method.");
	}

}
