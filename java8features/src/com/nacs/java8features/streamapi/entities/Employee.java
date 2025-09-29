package com.nacs.java8features.streamapi.entities;

public class Employee {
	private int id;
	private String name;
	private String area;
	private float salary;
	private String department;

	public Employee() {}

	public Employee(int id, String name, String area, float salary, String department) {
		this.id = id;
		this.name = name;
		this.area = area;
		this.salary = salary;
		this.department = department;
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

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", area=" + area + ", salary=" + salary + ", department="
				+ department + "]";
	}

}
