package com.tnsif.thread;

public class Rundemo {

	public static void main(String[] args) {
		Runthread r=new Runthread();
		Thread t=new Thread(r);
		t.start();
		

	}

}
