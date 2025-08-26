package com.nacs.arrays.logicalprograms;

public class Search {

	private Search() {
	}

	public static int linearSearch(int target, int... array) {
		for (int i = 0; i < array.length; i++)
			if (array[i] == target)
				return i;

		return -1;
	}
	
	
	public static int binarySearch(int left, int right, int target, int... array) {
		int mid;
		if(left<=right) {
			mid=(left+right)/2;
			if(target==array[mid])
				return mid;
			if(target<array[mid])
				return binarySearch(left, mid-1, target, array);
			if(target>array[mid])
				return binarySearch(mid+1, right, target, array);
		}
		return -1;
	}
}
