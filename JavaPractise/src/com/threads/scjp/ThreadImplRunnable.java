package com.threads.scjp;

/*
 * object that implements the Runnable interface, will execute the code defined in the public method run(). 		
 * main/daemon thread will run first followed by user threads if exists.
 */

// An object of this class is a Runnable object.
public class ThreadImplRunnable implements Runnable{

	/* defines an independent path of execution
	 entry and the exits for the thread.*/
	@Override
	public void run() {
		System.out.println("Runnable object created by Runnable Interface."+ Thread.currentThread());
	}
	
	public static void main(String[] args) {
		ThreadImplRunnable thread1 = new ThreadImplRunnable();
		thread1.run();
		
		// Thread object now has a Runnable object.
		Thread thread2 = new Thread(thread1, "Chiru");
		
		// Can set the thread to daemon when it is runnable object or Thread object created using runnable object.
		// generally main thread will terminate on its own and user treads will execute even after main thread terminates.
		// On setting daemon to true on a thread, the user threads will terminate at any point if main thread terminates.
		thread2.setDaemon(true);
		
		/* executes run() of Runnable Object.
		 the call to the start() method is asynchronous.*/
		// synchronized so it is Threadsafe and It throws an IllegalThreadStateException if the thread is already started.
		thread2.start();
		
		// setName() can be used to set the name for Thread object.
		// getName() can be used to get the name of Thread Object.
		thread2.setName("Gopi");
		System.out.println(thread2.getName());
		
		// Checking whether the current thread is daemon thread
		System.out.println("Is Daemon thread : "+thread2.isDaemon());
		
		// throws IllegalThreadStateException if the thread status is changed after thread is started.
		thread2.setDaemon(true);
		
		// code cannot reach here since in the previous line it has thrown an exception.
		System.out.println("Is Daemon thread : "+thread2.isDaemon());
		
	}
}
