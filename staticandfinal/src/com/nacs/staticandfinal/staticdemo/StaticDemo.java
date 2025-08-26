package com.nacs.staticandfinal.staticdemo;

public class StaticDemo {
	
	{
		System.out.println("this is instance block..");
	}
	
	static {
		System.out.println("this is static block from StaticDemo..");
	}
	
	String organizationName="NACS";
	String employeeName;
	public StaticDemo(String employeeName) {
		System.out.println("this is constructor..");
		this.employeeName = employeeName;
	}
	
	public static void addNumbers(int number1, int number2) {
		System.out.println(number1+number2);
	}
	
	public void printHello() {
		
	}
	
	public static void printOrganizationName() {
		
	}
	
	@Override
	public String toString() {
		return "organizationName=" + organizationName + ",\nemployeeName=" + employeeName + "]";
	}

	
}
