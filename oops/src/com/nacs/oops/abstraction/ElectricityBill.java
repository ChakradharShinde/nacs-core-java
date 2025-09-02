package com.nacs.oops.abstraction;

public interface ElectricityBill {
	float generateBill(int units);
	
	default void printBill(int units) {
		System.out.println("Bill = " + generateBill(units));
	}
}
