package com.tnsif.Exception;

public class Exceptiondemo {

	public static void main(String[] args) {
		try {
			int a,b;
			a=10;
			b=0;
			int c=a/b;
		}
		catch(Exception e) {
			System.out.println("the division is not possible");
		}
		try {
			int[ ] arr= {1,2,3,4};
			System.out.println(arr[2]);
		}
		catch(Exception e1) {
			System.out.println("you can't read the value of arr[4]");
		}
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(Exception e) {
			System.out.println("the string value is null");
		}

	}

}
