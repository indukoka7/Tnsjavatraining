package com.tnsif.Exception;

public class Exceptsdemo {

	public static void main(String[] args) {
		
		int age=17;
		
		if(age>=18) 
		{
			System.out.println("eligible for voting");
		}
		else {
			throw new ArithmeticException("the age is less than 18 ,not eligible for voting");
		}

	}

}
