package com.nacs.oops.encapsulation;

public class Student {
	private int rollNo;
	private String name;

	public Student() {}

	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		if(rollNo>0)
			this.rollNo = rollNo;
		else rollNo=0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
