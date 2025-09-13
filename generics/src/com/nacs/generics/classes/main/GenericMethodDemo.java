package com.nacs.generics.classes.main;

import com.nacs.generics.entities.Book;

public class GenericMethodDemo {
	public static void main(String[] args) {
		Book[] intArray = {
							new Book(100, "Who Moved my Cheese"),
							new Book(50, "Do Epic Shit"),
							new Book(200, "Automic Habbits"),
							new Book(30, "Let Us C")
							};
		System.out.println("Before Sorting");
		printArray(intArray);
		sortArray(intArray);
		System.out.println("\nAfter Sorting");
		printArray(intArray);
		
	}

	public static <T> void printArray(T... tArray) {
		for (int i = 0; i < tArray.length; i++)
			System.out.print(tArray[i]+ " ");
	}

	public static <T extends Comparable<T>> void sortArray(T[] tArray) {
		int minIndex;
		for (int i = 0; i < tArray.length; i++) {
			minIndex = i;
			for (int j = i + 1; j < tArray.length; j++) {
				if (tArray[minIndex].compareTo(tArray[j]) > 0) {
					minIndex = j;
				}
			}
			T temp = tArray[i];
			tArray[i] = tArray[minIndex];
			tArray[minIndex] = temp;
		}
	}

}
