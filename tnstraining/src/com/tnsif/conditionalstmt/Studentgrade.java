package com.tnsif.conditionalstmt;

public class Studentgrade {

	public static void main(String[] args) {
		int smarks =95;
		if(smarks>90) {
			System.out.println("the sgrade is A");
		}
		else if(smarks>75) {
			System.out.println("the sgrade is B");
		}
		else if(smarks>65) {
			System.out.println("the sgrade is C");
		}
		else if(smarks>45) {
			System.out.println("the sgrade is D");
		}
		else {
			System.out.println("the sgrade is F");
		}

	}

}
