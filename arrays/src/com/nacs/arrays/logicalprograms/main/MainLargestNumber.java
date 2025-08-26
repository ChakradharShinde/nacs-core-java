package com.nacs.arrays.logicalprograms.main;

import com.nacs.arrays.logicalprograms.LargestNumbers;

public class MainLargestNumber {
	public static void main(String[] args) {
		int[] array = {9, 6, 1, 8, 2, 6};
		
		LargestNumbers.findLargestNumber(new int[] {5, 6, 1, 8, 2, 9});
		
		LargestNumbers.findFirstAndSecondLargestNumber(array);
	}
}
