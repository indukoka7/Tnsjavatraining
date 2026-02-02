package com.tnsif.java.annotations;

public class Annotationdemo {
	
	public void show() {
		System.out.println("Parent");		
		}

}
class B extends Annotationdemo{
	@Override
	public void show() {
		System.out.println("child");
	}
}
