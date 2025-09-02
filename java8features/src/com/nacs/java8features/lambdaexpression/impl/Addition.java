package com.nacs.java8features.lambdaexpression.impl;

import com.nacs.java8features.lambdaexpression.ArithematicOperation;

public class Addition implements ArithematicOperation{
	@Override
	public int operation(int number1, int number2) {
		return number1+number2;
	}
}
