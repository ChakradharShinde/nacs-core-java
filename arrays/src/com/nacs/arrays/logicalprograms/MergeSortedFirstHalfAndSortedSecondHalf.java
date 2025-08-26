package com.nacs.arrays.logicalprograms;

public class MergeSortedFirstHalfAndSortedSecondHalf {
	public static void main(String[] args) {
		int[] array = { 40, 50, 80, 20, 30 };
		mergeArray(0, array.length - 1, array);
	}

	public static void mergeArray(int left, int right, int... array) {
		int mid = (left + right) / 2;
		int[] result = new int[array.length];
		int f = left;
		int s = mid + 1;
		int r = left;

		while (f <= mid && s <= right)
			if (array[f] < array[s])
				result[r++] = array[f++];
			else
				result[r++] = array[s++];
		// result[r++] = (array[f]<array[s])?array[f++]:array[s++]);

		while (f <= mid)
			result[r++] = array[f++];
		while (s <= right)
			result[r++] = array[s++];

		for (int ele : result)
			System.out.print(ele + " ");
	}

}
