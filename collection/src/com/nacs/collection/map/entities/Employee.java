package com.nacs.collection.map.entities;

import java.util.Objects;

public class Employee {
	private int id;
	private String name;
	private String department;
	private String area;

	public Employee() {}

	public Employee(int id, String name, String department, String area) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.area = area;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null || obj.getClass()!=this.getClass())
			return false;
		
		Employee temp = (Employee)obj;
		return this.id==temp.id 
				&& this.name.equals(temp.name) 
				&& this.department.equals(temp.department)
				&& this.area.equals(temp.area);
	}

	@Override
	public int hashCode() {
//		int hash=17;
//		hash = hash * 13 + id;
//		hash = hash * 13 + name.hashCode();
//		hash = hash * 13 + department.hashCode();
//		hash = hash * 13 + area.hashCode();
//		
//		return hash;
		
		return Objects.hash(id, name, department, area);
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", area=" + area + "]";
	}

}
