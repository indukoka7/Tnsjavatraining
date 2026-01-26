package com.tnsif.Lambda;
interface myinterface{
	void print();
}

public class Main {

	public static void main(String[] args) {
		myinterface myinf = ()->System.out.println("This is print method");
		myinf.print();

	}

}
