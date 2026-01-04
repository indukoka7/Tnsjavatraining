package com.tnsif.Assignment.A1;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String str="indu";
				String reverse="";
				for(int i=str.length()-1;i>=0;i--) {
					reverse=reverse+str.charAt(i);
				}
				System.out.println("indu:"+str);
				System.out.println("indu:"+reverse);
			}

	}

