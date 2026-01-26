package com.tnsif.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Personmain {

	public static void main(String[] args) {
		List<Person> ob = new ArrayList<Person>();
		Person p = new Person("yesh", "Mumbai");
		ob.add(p);
		p = new Person("Teja", "Hyd");
		ob.add(p);
		p = new Person("sneha", "Pune");
		ob.add(p);
		
		System.out.println(ob);
		System.out.println("Sorting of Names..");
		Collections.sort(ob,new SortByName());
		System.out.println(ob);
		
		System.out.println("Sorting of Cities..");
		Collections.sort(ob,new SortByCity());
		System.out.println(ob);

	}

}
