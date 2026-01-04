package com.tnsif.Assignment.A3;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] words= {"TEAM","WORK"};
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}
		for(String word:words) {
			char[] ch=word.toCharArray();
			for(int i=ch.length-1;i>=0;i--)
			{
				System.out.print(ch[i]);
			}
			System.out.println();
			
		}

	}

}
