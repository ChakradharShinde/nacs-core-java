package com.nacs.logicalprograms.main;

import com.nacs.logicalprograms.CheckNumbers;

public class MainCheckNumbers {
	public static void main(String[] args) {
		CheckNumbers checkNumber = new CheckNumbers();
		for (int i = 1; i <= 100; i++) {
			checkNumber.setNumber(i);
			if (checkNumber.isPerfect())
				System.out.println(i + " is a Perfect Number");
//			else
//				System.out.println(temp + " is not a Perfect Number");
		}
		
		checkNumber.setNumber(123);
		System.out.println(checkNumber.getReverseNumber());
		
		checkNumber.setNumber(152);
		if(checkNumber.isPalindrome())
			System.out.println(152 + " is a Palindrome Number");
		else
			System.out.println(152 + " is not a Palindrome Number");
		
		
		checkNumber.setNumber(16);
		if(checkNumber.isPrime())
			System.out.println(17 + " is a Prime Number ");
		else
			System.out.println(17 + " is not a Prime Number ");
		
		for(int i=1;i<=1000;i++) {
			checkNumber.setNumber(i);
			if(checkNumber.isArmstrong())
				System.out.println(i + " is a Armstrong Number.");
//			else
//				System.out.println(i + " is not a Armstrong Number");
		}
	}
}
