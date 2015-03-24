package com.threads.scjp.examples;

public class Extender extends Thread {
	
	public Extender(){
		
	}
	
	public Extender(Runnable runnable){
		super(runnable);
	}
	
	@Override
	public void run() {
		System.out.println("Extender");
	}

}
