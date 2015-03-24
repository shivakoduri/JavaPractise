package com.threads.scjp;


/* Threads - java.lang.Thread
1. Thread-based multitasking allows parts of the same program to run concurrently on the computer.
2. Each task in concurrent access defines a separate path of execution, and is called a Thread.
3. Threads share the same memory space and can share data and code.
4. When the objects are used concurrently by multiple threads and if the state of the objects
is always consistent then it is called as Thread-safe.
5. Threads make runtime environment asynchronous.
6. Two type of Threads:
    - User threads
    - Daemon threads
7. Daemon threads exist only to serve User threads.
8. Main thread - thread which runs main method.
9. setDaemon(boolean) : Thread - is used to set User thread as daemon thread or user.
10. It needs to be done before the thread is started.
11. Any attempt to change the status after the thread has been started, throws an IllegalThreadStateException.
12. Thread creation:
    - implementing java.lang.Runnableinterface
    - extending the java.lang.Threadclass
13. The Object that implements Runnable interface will execute the code defined in run().
 */



public class FirstThread extends Thread{

    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread();

        // Calling setDaemon before start
       firstThread.setDaemon(true);

        firstThread.start();

        // Calling setDaemon after start
        //firstThread.setDaemon(true);

    }

}
