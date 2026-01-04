package com.tnsif.accessmodifiers.samepackage;
import com.tnsif.accessmodifiers.different.Differentclass;
import com.tnsif.accessmodifiers.different.Sameclass;
import com.tnsif.accessmodifiers.samepackage.Nonsubclass;
import com.tnsif.accessmodifiers.samepackage.Subclass;

public class Accessmodifiersdemo {
	public static void main(String[] args) {
		Subclass sc=new Subclass();
		sc.display();
		Nonsubclass nsc=new Nonsubclass();
	    nsc.display();
	    Sameclass s=new Sameclass(); 
	    s.display();
	    Differentclass dc=new Differentclass();
	    dc.display();
	    
		

	}

}
