package com.tnsif.synchronisation;

public class Threadmain {

	public static void main(String[] args) {
		Threaddemo obj =new Threaddemo();
		Thread1 t1 =new Thread1(obj);
		Thread2 t2 =new Thread2(obj);
		
		t1.start();
		t2.start();

	}

}
