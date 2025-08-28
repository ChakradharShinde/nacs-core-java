package com.nacs.oops.polymorphism;

public class MethodOverloadingDemo {
	private static void printData() {
		System.out.println("Empty Parameters List");
	}
	
	public int printData(int data) {
		System.out.println("Int parameter : " + data);
		return 0;
	}
	
	public void printData(String data) {
		System.out.println("String parameter : " + data);
	}
	
	public void printData(int data1, float data2) {
		
	}
	
	public void printData(float data1, int data2) {
		System.out.println();
	}
	
}
