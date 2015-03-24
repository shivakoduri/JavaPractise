package com.threads.scjp;

/**
 * Created by Chiranjeevi on 3/23/15.
 */
public class Counter implements Runnable {

    private int counter;

    Counter(){
        counter = 0;
    }

    public int getCounter(){
        return counter;
    }

    @Override
    public void run() {

        try{
            while(counter < 5){
                System.out.println("Current Thread : "+Thread.currentThread().getName()+ " " + counter++);
                
                // Other threads will run while a thread is sleeping
                Thread.sleep(250);
            }
        }catch (InterruptedException e){
            System.out.println("Current Thread : "+Thread.currentThread().getName());
        }
        System.out.println("Exit from Thread : "+Thread.currentThread().getName());

    }
}
