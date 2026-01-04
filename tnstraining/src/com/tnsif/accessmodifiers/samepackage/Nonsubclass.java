package com.tnsif.accessmodifiers.samepackage;

public class Nonsubclass {
	public void display() {
		System.out.println("Different Class in Same Package");
		Accessmodifiers obj=new Accessmodifiers();
		System.out.println("b="+obj.b);
		System.out.println("c="+obj.c);
		System.out.println("d="+obj.d);
	}

}
