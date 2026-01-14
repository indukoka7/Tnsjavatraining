package com.tnsif.thread;

public class Currentthreaddemo {

	public static void main(String[] args) throws InterruptedException {
		for(int i=1;i<7;i++) {
		Currentthread c =new Currentthread();
		c.start();
		Thread.sleep(5000);
		}
		

	}

}
