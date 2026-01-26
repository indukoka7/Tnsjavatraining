package com.tnsif.Lambda;

public interface Myinterface {
	void print();

}
class Main{
	public static void main(String[] args) {
		Myinterface myinf = ()->System.out.println("This is print method");
		myinf.print();
		
	}
}
