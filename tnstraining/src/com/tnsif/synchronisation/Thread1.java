package com.tnsif.synchronisation;

public class Thread1 extends Thread {
	Threaddemo obj;
	
	Thread1(Threaddemo obj)
	{
		this.obj=obj;
		
	}
	public void run() {
		
		for(int x=1;x<5;x++)
		{
			obj.delivery(x);
			
		}
	}
	

}
