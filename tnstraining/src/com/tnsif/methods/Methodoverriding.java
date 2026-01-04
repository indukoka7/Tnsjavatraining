package com.tnsif.methods;

public class Methodoverriding {
	public void hello() {
		System.out.println("parent class ");
	}

}
class Demo extends Methodoverriding {

public void hello1() {
	System.out.println("child class ");
}

}
