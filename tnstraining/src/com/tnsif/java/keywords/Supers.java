package com.tnsif.java.keywords;

public class Supers {
	int a=45;
	Supers(int a){
		System.out.println("this is a constructor");
		
	}
	public void show() {
		System.out.println("this is a demo class");
		
	}
	
}
class Pan extends Supers{
	Pan(){
		super(30);
	}
	int a=40;
	public void display() {
		System.out.println(super.a);
		super.show();
		System.out.println("thus is a demo class");
	}
}
