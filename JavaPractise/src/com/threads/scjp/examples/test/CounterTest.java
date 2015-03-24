package com.threads.scjp.examples.test;

import com.threads.scjp.examples.Counter;

/**
 * Created by Chiranjeevi on 3/24/15.
 */
public class CounterTest {
    public static void main(String[] args) {
        Counter counterA = new Counter();
        Thread worker = new Thread(counterA, "Counter A");
        System.out.println(worker);
        worker.start();
        try {
            int val;
            do {
                val = counterA.getCounter();
                System.out.println("Counter value read by " + Thread.currentThread().getName() + ": " + val
                );
                Thread.sleep(1000);
            } while (val < 5);
        } catch (InterruptedException e) {
            System.out.println("The main thread is interrupted.");
        }
        System.out.println("Exit from main() method.");
    }

}



