package com.tnsif.Assignment.hw.map;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<Integer, String> lh = new HashMap<>();
		lh.put(1, "indu");
		lh.put(2, "naveen");
		lh.put(3, "sneha");
		lh.put(4, "chinny");
		lh.put(5, "bunny");
		lh.put(6, "honey");
		System.out.println(lh);
		System.out.println(lh.get(1));
		lh.remove(5);
		System.out.println(lh);
		System.out.println(lh.containsKey(3));
		System.out.println(lh.containsValue("sneha"));
		System.out.println(lh.isEmpty());
		for (Map.Entry<Integer, String> entry : lh.entrySet()) {
			if(entry.getKey()==4) {
		    	entry.setValue("sri");
		    }
		    System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println(lh);

	}

}
