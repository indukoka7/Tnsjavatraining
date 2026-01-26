package com.tnsif.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class DemoColl {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(101);
		al.add("Hello");
		al.add(23.4f);
		al.add('c');
		System.out.println(al);
		al.add(101);
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		LinkedList li =new LinkedList();
		li.addFirst(101);
		li.addFirst("Tns");
		li.addFirst(10.24);
		li.addFirst('H');
		li.addFirst(128);
		System.out.println(li);
		li.addLast(67);
		li.addLast("hi");
		System.out.println(li);
		li.removeFirst();
		System.out.println(li);
		
		
		

	}

}
