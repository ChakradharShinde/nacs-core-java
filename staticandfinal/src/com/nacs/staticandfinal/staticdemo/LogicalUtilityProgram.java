package com.nacs.staticandfinal.staticdemo;

public class LogicalUtilityProgram {
	
	static final int number=10;
	
	private LogicalUtilityProgram() {}
	
	public static final int calculateFactorial(int number) {
		int factorial=1;
		for(int i=1;i<=number; i++)
			factorial*=i;
		
		return factorial;
	}
	
	public static int calculatePower(int base, int exponent) {
		int power=1;
		for(int i=0;i<exponent;i++)
			power*=base;
		
		return power;
	}
}
