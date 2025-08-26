package com.nacs.recursion;

public class Power {

	private Power() {
	}

	public static int calculatePower(int base, int exponent) {
//		if (exponent < 1)
//			return 1;
//		return calculatePower(base, exponent - 1) * base;
		
		
		return (exponent<1)?1:calculatePower(base, exponent-1)*base;
	}
}
