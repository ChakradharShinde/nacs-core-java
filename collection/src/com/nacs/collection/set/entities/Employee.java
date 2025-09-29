package com.nacs.collection.set.entities;

public class Employee implements Comparable<Employee>{
	private String name;
	private String city;
	private float salary;

	public Employee() {}

	public Employee(String name, String city, float salary) {
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public int compareTo(Employee obj2) {
		return this.city.compareTo(obj2.city);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}
}








