package com.tnsif.Lambda;

import java.util.function.Predicate;

public class Predicates {

	public static void main(String[] args) {
		Predicate<Integer> p = (n)->n%2==0;
		System.out.println(p.test(3));
		System.out.println(p.test(8));
		Predicate<Integer> isEven=a->a%2==0;
		System.out.println(isEven.test(98));
		System.out.println(isEven.test(11));

	}

}
