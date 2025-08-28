package com.nacs.oops.polymorphism;

public class MethodOverridingDemo {
	
//	public MethodOverridingDemo() {
//		System.out.println("this is Super default constructor");
//	}
	
	public MethodOverridingDemo printData(String data) throws RuntimeException {
		System.out.println("Super class : " + data);
		
		return new MethodOverridingDemo();
	}
	
	// duplicate method
//	public void printData(String data) {
//		
//	}
}
