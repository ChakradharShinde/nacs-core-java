package com.nacs.logicalprograms.main;

import com.nacs.logicalprograms.SwapTwoNumbers;

public class MainSwapTwoNumbers {
	public static void main(String[] args) {
		SwapTwoNumbers swapTwoNumbers = new SwapTwoNumbers(10,20);
		System.out.println("Before Swapping Number1 = " 
							+ swapTwoNumbers.getNumber1()
							+ " and Number2 = " 
							+ swapTwoNumbers.getNumber2()
							);
		
		swapTwoNumbers.swapTwoNumbersUsingThirdVariable();
		
		System.out.println("After Swapping Number1 = " 
				+ swapTwoNumbers.getNumber1()
				+ " and Number2 = " 
				+ swapTwoNumbers.getNumber2()
				);
		
		System.out.println("Before Swapping Number1 = " 
				+ swapTwoNumbers.getNumber1()
				+ " and Number2 = " 
				+ swapTwoNumbers.getNumber2()
				);
		
		swapTwoNumbers.swapTwoNumbersWithoutUsingThirdVariable();
		
		System.out.println("After Swapping Number1 = " 
				+ swapTwoNumbers.getNumber1()
				+ " and Number2 = " 
				+ swapTwoNumbers.getNumber2()
				);
		
	}
}
