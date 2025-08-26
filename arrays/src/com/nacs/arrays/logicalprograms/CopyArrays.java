package com.nacs.arrays.logicalprograms;

public class CopyArrays {

	private CopyArrays() {
	}

	public static void copyFirstHalf(int... array) {
		int mid = ((0 + array.length - 1) / 2) + 1;
		int[] firstHalf = new int[mid];
		for (int i = 0; i < mid; i++)
			firstHalf[i] = array[i];

		for (int i = 0; i < firstHalf.length; i++)
			System.out.print(firstHalf[i] + " ");

		System.out.println();
	}

	public static void copySecondHalf(int... array) {
		int mid = ((0 + array.length - 1) / 2) + 1;
		int size = array.length - mid;
		int[] secondHalf = new int[size];
		int j = 0;
		for (int i = mid; i < array.length; i++) {
			secondHalf[j] = array[i];
			j++;
		}

		for (int i = 0; i < secondHalf.length; i++)
			System.out.print(secondHalf[i] + " ");

	}
	
}
