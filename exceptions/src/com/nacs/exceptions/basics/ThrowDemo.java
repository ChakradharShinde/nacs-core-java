package com.nacs.exceptions.basics;

public class ThrowDemo {
	public static void main(String[] args) throws Exception {
		demoMethod();
	}
	
	public static void demoMethod() throws Exception {
		throw new Exception("not divide by zero");
	}
}
