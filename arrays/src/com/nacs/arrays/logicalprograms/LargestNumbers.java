package com.nacs.arrays.logicalprograms;

public class LargestNumbers {
	public static void findLargestNumber(int[] array) {
		int largest = array[0];
		for (int i = 1; i < array.length; i++)
			if (largest < array[i])
				largest = array[i];

		System.out.println("Largest Number in given array is " + largest);
	}

	public static void findFirstAndSecondLargestNumber(int[] array) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (largest < array[i]) {
				secondLargest = largest;
				largest = array[i];
			} else if (largest > array[i] && array[i] > secondLargest) {
				secondLargest = array[i];
			}
		}
		System.out.println("First and Second largest number in given array are: " + largest + ", " + secondLargest);
	}

}
