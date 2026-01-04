package com.tnsif.Assignment.A1;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =153;
		int original =num;
		int sum =0;
		while(num!=0) {
			int digit =num%10;
			sum =sum+(digit*digit*digit);
			num =num/10;
			
		}
		if(original==sum) {
			System.out.println("the number is armstrong"+ " "+original);
		}
		else {
			System.out.println("the number is not armstrong"+ " "+original);
		}

	}

}
