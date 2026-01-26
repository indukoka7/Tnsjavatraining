package com.tnsif.collections;

public class Students implements Comparable<Students>{
	int sid;
	String sname;
	double marks;
	
	public Students(int sid, String sname, double marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Students [sid=" + sid + ", sname=" + sname + ", marks=" + marks + "]";
	}
	public int compareTo(Students s) {
		return this.sname.compareTo(s.sname);
		
		
	}
	
	
	

}
