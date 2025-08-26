package com.nacs.scannerclass;

public class Employee {
	private int employeeId;
	private String employeeName;
	private float employeeSalary;
	private char employeeGender;

	public Employee() {

	}

	public Employee(int employeeId, String employeeName, float employeeSalary, char employeeGender) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeGender = employeeGender;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public float getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public char getEmployeeGender() {
		return employeeGender;
	}

	public void setEmployeeGender(char employeeGender) {
		this.employeeGender = employeeGender;
	}

}
