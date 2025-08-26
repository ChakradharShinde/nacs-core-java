package com.nacs.logicalprograms;

public class Factorial {
	int number;

	public Factorial() {

	}

	public Factorial(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double calculateFactorial() {
		double fact = 1;
		for (int i = 1; i <= number; i++)
//			fact=fact*i;
			fact *= i;

		return fact;
	}

}
