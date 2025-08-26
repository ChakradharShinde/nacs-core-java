package com.nacs.arrays.logicalprograms;

public class MergeTwoSortedArray {
	public static void main(String[] args) {
		int[] array1 = { 40, 50, 80 };
		int[] array2 = { 10, 20, 90 };

		mergeArrays(array1, array2);
	}

	public static void mergeArrays(int[] array1, int[] array2) {
		int firstArrayLength = array1.length;
		int secondArrayLength = array2.length;

		int[] result = new int[firstArrayLength + secondArrayLength];
		int f = 0;
		int s = 0;
		int r = 0;

		while (f < firstArrayLength && s < secondArrayLength)
			if (array1[f] < array2[s])
				result[r++] = array1[f++];
			else
				result[r++] = array2[s++];

		while (f < firstArrayLength)
			result[r++] = array1[f++];
		while (s < secondArrayLength)
			result[r++] = array2[s++];

		for (int ele : result)
			System.out.print(ele + " ");

	}

}
