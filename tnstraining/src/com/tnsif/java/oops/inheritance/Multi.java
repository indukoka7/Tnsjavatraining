package com.tnsif.java.oops.inheritance;

public class Multi {
	public void show1() {
		System.out.println("this is multilevel inheritance");
	}

}
class Back extends Multi{
	public void show2(){
		System.out.println("this is B class");
	}
}
class Cab extends Back{
	public void show3() {
		System.out.println("this is C class");
	}
}
