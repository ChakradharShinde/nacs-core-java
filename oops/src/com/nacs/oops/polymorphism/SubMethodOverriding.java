package com.nacs.oops.polymorphism;

public class SubMethodOverriding extends MethodOverridingDemo {
	
//	@Override
//	MethodOverridingDemo printData(String data) throws RuntimeException {
//		System.out.println("Sub class : " + data);
//		return new MethodOverridingDemo();
//	}
	@Override
	public MethodOverridingDemo printData(String data) {
		System.out.println("Sub class: " + data);
		return new MethodOverridingDemo();
	}
}
