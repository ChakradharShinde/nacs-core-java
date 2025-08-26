package com.nacs.arrays.logicalprograms;

public class StringSorting {

	private StringSorting() {

	}

	public static void insertionSort(String... nameArray) {
		String key;
		int j;
		for (int i = 1; i < nameArray.length; i++) {
			key = nameArray[i];
			j = i - 1;
			while (j >= 0 && key.compareTo(nameArray[j]) < 0) {
				nameArray[j + 1] = nameArray[j];
				j--;
			}

			nameArray[j + 1] = key;
		}
	}
}
