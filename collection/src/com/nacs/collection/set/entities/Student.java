package com.nacs.collection.set.entities;

import java.util.Objects;

public class Student {
	private String name;
	private long mobile;
	private float contry;

	public Student() {}

	public Student(String name, long mobile, float contry) {
		this.name = name;
		this.mobile = mobile;
		this.contry = contry;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public float getContry() {
		return contry;
	}

	public void setContry(float contry) {
		this.contry = contry;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null || obj.getClass()!=this.getClass())
			return false;
		
		Student temp=(Student)obj;
		return temp.name.equals(this.name) 
			&& temp.mobile==this.mobile 
			&& temp.contry==this.contry;
	}
	
	@Override
	public int hashCode() {
//		return Objects.hash(name, contry, mobile);
		int hash=23;
		hash = hash * 17 + name.hashCode();
		hash = hash * 17 + (int)contry;
		hash = hash * 17 + (int)mobile;
		
		return hash;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", mobile=" + mobile + ", contry=" + contry + "]";
	}

}
