package com.tnsif.accessmodifiers.different;
import com.tnsif.accessmodifiers.samepackage.Accessmodifiers;

public class Differentclass {
	public void display() {
		System.out.println("Different Class in Different Package");
		Accessmodifiers obj=new Accessmodifiers();
		System.out.println("d="+obj.d);
	}

}
