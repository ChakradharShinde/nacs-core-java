package com.nacs.oops.abstraction;

public interface ArithematicOperation {
	
	int DEMO_VARIABLE=10;
	
	int addition(int number1, int number2);

	int substraction(int number1, int number2);

	int multiplication(int number1, int number2);

	int division(int number1, int number2);
	 
	// static methods are allowed in Interface after java 1.8 SE version
	static int modulo(int number1, int number2) {
		
//		return decrementByOne(number1);
		return number1%number2;
	}
	
	// default methods are allowed in Interface after java 1.8 SE version
	default int incrementByOne(int number1) {
		return number1+1;
	}
	
	// private methods are allowed in Interface after java 1.9 SE version
	private int decrementByOne(int operand1) {
		return --operand1;
	}
	
	
	default int testDecrementByOne(int operand1) {
		return decrementByOne(operand1);
	}
}
