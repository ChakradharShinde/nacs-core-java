package com.nacs.logicalprograms;

public class SwapTwoNumbers {
	int number1;
	int number2;

	public SwapTwoNumbers() {

	}

	public SwapTwoNumbers(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public int getNumber1() {
		return number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public void swapTwoNumbersUsingThirdVariable() {
		int temp;
		temp = number1;
		number1 = number2;
		number2 = temp;
	}

	public void swapTwoNumbersWithoutUsingThirdVariable() {
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
	}
}
