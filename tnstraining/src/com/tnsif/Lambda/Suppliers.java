package com.tnsif.Lambda;

import java.util.function.Supplier;

public class Suppliers {

	public static void main(String[] args) {
		Supplier<String> sp=()->{
			String s="";
			for(int i=1;i<=10;i++)
				s=s+(int)(Math.random()*10);
			return s;
		};
		System.out.println(sp.get());
		
		Supplier<Double> sup =()->Math.random();
		System.out.println(sup.get());
		

	}

}
