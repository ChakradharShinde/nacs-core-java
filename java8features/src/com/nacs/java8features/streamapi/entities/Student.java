package com.nacs.java8features.streamapi.entities;

import java.util.Objects;

public class Student{
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
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null || obj.getClass()!=this.getClass())
			return false;
		
		Student temp=(Student)obj;
		
		return this.rollNo==temp.rollNo && this.name.equals(temp.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(rollNo, name);
	}
	

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

}
