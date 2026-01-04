package com.tnsif.Assignment.A1;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		int n=2;
		while(count<20) {
			boolean isprime=true;
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				isprime=false;
				break;
			}	
			}
		if(isprime) {
			System.out.println(n);
			count++;
		}
		n++;
			
		}

	}

}
