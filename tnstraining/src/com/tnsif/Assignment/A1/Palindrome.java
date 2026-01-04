package com.tnsif.Assignment.A1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 121;
		int original =num;
		int reverse = 0; 
		while(num != 0) {
			int digit = num%10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}
		if(original == reverse) {
			System.out.println( "the number is a palindrome"+ " " +original );
		}
		else {
			 
			System.out.println("the number is not a palindrome"+ " " +original);
		}
			
			
		    
		
			

	}

}

