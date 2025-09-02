package com.nacs.oops.abstraction;

public interface Shape {

	float calculateArea();
	
	default void printArea() {
		System.out.println("Area = " + calculateArea());
	}

}
