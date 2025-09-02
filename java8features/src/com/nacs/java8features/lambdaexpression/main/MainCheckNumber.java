package com.nacs.java8features.lambdaexpression.main;

import com.nacs.java8features.lambdaexpression.CheckNumber;

public class MainCheckNumber {
	public static void main(String[] args) {
		CheckNumber checkNumber = number->{
			for(int i=2;i*i<=number;i++)
				if(number%i==0)
					return false;
			return true;
		};
		
		if(checkNumber.isPrime(12))
			System.out.println("13 is a Prime Number");
		else
			System.out.println("13 is not a Prime Number");
		
	}
}
