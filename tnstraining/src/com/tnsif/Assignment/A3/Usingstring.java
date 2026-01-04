package com.tnsif.Assignment.A3;

public class Usingstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="TEAM WORK";
		String [] words=str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			for(int  j=word.length()-1;j>=0;j--)
			{
				System.out.print(word.charAt(j));
			}
			System.out.println();
		}

	}

}
