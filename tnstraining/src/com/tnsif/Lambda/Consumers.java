package com.tnsif.Lambda;

import java.util.function.Consumer;

public class Consumers {

	public static void main(String[] args) {
		Consumer<String> con =(name)->System.out.println(name.toUpperCase());
		con.accept("sri");
		Consumer<String> len=str->System.out.println(str.length());
		String[] arr= {"sri","indu","lilly","laxmi"};
		for(String k:arr)
			len.accept(k);
		len.accept("String[] arr");
		con.accept("indu");
		

	}

}
