package com.nacs.oops.abstraction.impl;

import com.nacs.oops.abstraction.ArithematicOperation;

public class ArithematicOperationImpl implements ArithematicOperation {
	@Override
	public int addition(int number1, int number2) {
		return number1+number2;
	}
	
	@Override
	public int substraction(int number1, int number2) {
		return number1-number2;
	}
	
	@Override
	public int multiplication(int number1, int number2) {
		return number1*number2;
	}
	
	public int division(int number1, int  number2) {
		return number1/number2;
	}
	
	@Override
	public int incrementByOne(int number1) {
		return ++number1;
	}
}
