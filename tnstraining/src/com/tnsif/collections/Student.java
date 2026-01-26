package com.tnsif.collections;

import java.util.ArrayList;

public class Student {
	int sid;
	String sname;
	double marks;
	public Student(int sid, String sname, double marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
	
	

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", marks=" + marks + "]";
	}



	public static void main(String[] args) {
		ArrayList ob = new ArrayList();
		ob.add(101);
		ob.add("hello");
		System.out.println(ob);
		//Generic declaration
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(101);
		al.add(123);
		System.out.println(al);
		// user define generic
		ArrayList<Student> ga = new ArrayList<Student>();
		Student s = new Student(101, "indu",98.2);
		ga.add(s);
		s = new Student(102, "sneha", 67.8);
		ga.add(s);
		s = new Student(103, "neha", 89.7);
		ga.add(s);
		System.out.println(ga);
		
		
		
		
		
		
		

	}





	

}
