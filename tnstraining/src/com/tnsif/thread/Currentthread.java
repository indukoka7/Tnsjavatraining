package com.tnsif.thread;

public class Currentthread  extends Thread {
	public void run() {
		
		try {
			System.out.println("the current thread running is:" +Thread.currentThread().getId());
			System.out.println("the Thread is running ");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("exception caught");
		}
		
	}

}
