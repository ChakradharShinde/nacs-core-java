package com.nacs.arrays.arraydemo;

public class VarargsDemo {
	public static void main(String... args) {
		int[] array = {1,2,3,4,5};
		
		printArray(1,2,3,4,5,6);
	}
	
	public static void printArray(int length, int... array) {
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]);
	}
}
