package com.nacs.java8features.lambdaexpression.main;

import com.nacs.java8features.lambdaexpression.ArithematicOperation;
import com.nacs.java8features.lambdaexpression.impl.Addition;

public class MainArithematicOperation {
	public static void main(String[] args) {
		// 1. physical class
		ArithematicOperation addition = new Addition();
		System.out.println(addition.operation(10, 20));
		// 2. anonymous class
		ArithematicOperation substraction = new ArithematicOperation() {
			@Override
			public int operation(int number1, int number2) {
				return number1-number2;
			}
		};
		
		System.out.println(substraction.operation(30,20));
		// 3. lambda expression
		ArithematicOperation multiplication =(number1, number2)->  number1*number2;
		System.out.println(multiplication.operation(5, 5));
		
		ArithematicOperation division = (number1, number2)->number1/number2;
		System.out.println(division.operation(50, 5));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
