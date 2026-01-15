package com.tnsif.java.practice;

import java.util.Scanner;

public class Numberguessinggame {
	
	public static void NumberGuessingGame() 
	{
		Scanner sc =new Scanner(System.in);
	
	//generates the random number between 1 and 100
	int number =1 + (int)(100 * Math.random());
	//number attempts
	int n =7;
	System.out.println("the number is choosen between 1 and 100");
	System.out.println("you hava"+ n +" " +"attempts to guess the number correctly ");
	
	for(int i=1;i<n;i++) {
		System.out.println("enter your guess: ");
		int guess = sc.nextInt();
		if(guess == number) {
			System.out.println("congratulation! you guessed correct number");
			sc.close();
			
			return;
		}
		else if(guess < number) {
			System.out.println("the number is greater than:" +guess);
		}
		else {
			System.out.println("the number is less than:" +guess);
		}
	}
	System.out.println("you've exhausted all attempts. The currect number was:" +number);
	sc.close();
	}
}
		
		

	

	


