package com.tnsif.Exception;

public class Exceptsdemo {

	public static void main(String[] args) {
		
		int age=17;
		try {
		
		if(age<18) 
		{
			throw new IllegalArgumentException("not eligible for voting");
		}
		System.out.println("eligible for voting");
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}


	}

}
