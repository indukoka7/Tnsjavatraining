package com.tnsif.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Studentsdemo {

	public static void main(String[] args) {
		ArrayList<Students> ob = new ArrayList<Students>();
		Students s = new Students(101,"john", 98.2);
		ob.add(s);
		s = new Students(102, "nail", 78.3);
		ob.add(s);
		s = new Students(102, "cat", 78.2);
		ob.add(s);
		s = new Students(102, "benny", 78.2);
		ob.add(s);
		System.out.println("Before sorting.....");
		System.out.println(ob);
		System.out.println("After sorting.....");
		Collections.sort(ob);
		System.out.println(ob);
		
		

	}

}
