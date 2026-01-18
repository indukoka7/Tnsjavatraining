package com.tnsif.synchronisation;

public class Thread2  extends Thread {
	Threaddemo obj;
	
	Thread2(Threaddemo obj)
	{
		this.obj=obj;
		
	}

	public void run() {
		
		for(int y=1;y<5;y++)
		{
			obj.receiver();
		}
	}
}
	
