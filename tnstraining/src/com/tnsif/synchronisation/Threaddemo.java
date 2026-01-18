package com.tnsif.synchronisation;

public class Threaddemo {
	int i;
	boolean flag =false;
	synchronized void delivery(int i)
	{
		if(flag)
			try {
				wait();
			}catch(Exception e) {
				System.err.println(e);
			}
		this.i=i;
		flag=true;
		System.out.println("The msg is delivered" +i);
		notify();
	}
	synchronized int receiver()
	{
		if(!flag)
			try {
				wait();
			}catch(Exception e) {
				System.err.println(e);
			}
		System.out.println("the msg is received" +i);
		flag =false;
		notify();
		return i;
	}
}
