package com.tnsif.java.oops.inheritance;

public class Hierarchical {
	public void show() {
		System.out.println("this is hierarchical inheritance");
	}

}
class Be extends Hierarchical{
	public void show1() {
		System.out.println("this is class B");
	}
}
class Ce extends Hierarchical{
	public void show2() {
		System.out.println("this is class C");
	}
}
class De extends Hierarchical{
	public void show3() {
		System.out.println("this is class D");
	}
}
