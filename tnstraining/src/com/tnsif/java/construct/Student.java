package com.tnsif.java.construct;

public class Student {
	int sid =101;
	String sname ="indu";
	Student(){
		System.out.println("the student name:" +sname);
	}
	Student(int a){
		System.out.println("marks :" +a + "got to :" +sname);
	}
	Student(int a, int b){
		System.out.println("value1  : " +a + "value2 :" +b);
	}

}
