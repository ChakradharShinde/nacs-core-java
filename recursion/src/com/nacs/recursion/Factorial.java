package com.nacs.recursion;

public class Factorial {
	
	private Factorial() {}
	
	public static int calculateFactorial(int number) {
		return (number<=1)?1:calculateFactorial(number-1)*number;
	}
}
