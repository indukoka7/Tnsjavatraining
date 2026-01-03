package com.tnsif.java.setgetmd;

public class StudentDemo {

	public static void main(String[] args) {
		Student s =new Student();
		s.getsname("harika");
		s.getsid(101);
		s.getsmarks(90);
		System.out.println("the student name:" +s.setsname());
		System.out.println("the student Id:" +s.setsid());
		System.out.println("the student marks:" +s.setsmarks());
		
		

	}

}
