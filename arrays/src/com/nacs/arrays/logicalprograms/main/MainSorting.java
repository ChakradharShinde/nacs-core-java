package com.nacs.arrays.logicalprograms.main;

import com.nacs.arrays.logicalprograms.Sorting;

public class MainSorting {
	public static void main(String[] args) {
//		int[] intArray = { 8, 4, 1, 9, 10};
//		System.out.println("Before Sorting");
//		printArray(intArray);
//
////		Sorting.bubbleSort(intArray);
////		Sorting.selectionSort(intArray);
//		Sorting.insertionSort(intArray);
//		System.out.println();
//
//		System.out.println("After Sorting");
//		printArray(intArray);
		int[] array= {90, 20, 40, 10, 80};
		System.out.print("Before Sorting: ");
		for(int ele:array)
			System.out.print(ele + " ");
		Sorting.divide(0, array.length-1, array);
		System.out.println();
		System.out.print("After Sorting: ");
		for(int ele:array)
			System.out.print(ele + " ");

	}

	public static void printArray(int... array) {
		for (int no : array)
			System.out.print(no + " ");
	}
}
