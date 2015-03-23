package com.threads.scjp;

/**
 * Created by Chiranjeevi on 3/23/15.
 */
public class ThreadImplementingRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Starting Thread1");
    }

    public static void main(String[] args) {
        ThreadImplementingRunnable t1 = new ThreadImplementingRunnable();
        t1.run();

        Thread t2 = new Thread(t1);
        t2.run();

        Thread t3 = new Thread(t1, "t3");
        t3.start();
        System.out.println(t3.getName());

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Starting Thread4");
            }
        });

        t4.run();
        t2.setName("Thread2");
        System.out.println(t2.getName());

        t1.run();
        t2.isDaemon();
    }
}
