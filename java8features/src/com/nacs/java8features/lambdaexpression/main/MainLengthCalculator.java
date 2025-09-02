package com.nacs.java8features.lambdaexpression.main;

import com.nacs.java8features.lambdaexpression.LengthCalculator;

public class MainLengthCalculator {
	public static void main(String[] args) {
		LengthCalculator lengthCalculator=str ->  str.length();
		
		System.out.println(lengthCalculator.calculateLength("Jay"));
	}
}
