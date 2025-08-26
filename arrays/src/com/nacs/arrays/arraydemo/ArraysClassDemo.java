package com.nacs.arrays.arraydemo;

import java.util.Arrays;

public class ArraysClassDemo {
	public static void main(String[] args) {
		int[] array = {50,20,30,10,40};
		
//		Arrays.fill(array, 7);
//		Arrays.fill(array, 2, 4, 7);
		
//		int[] result=Arrays.copyOf(array, 7);
		int[] result=Arrays.copyOfRange(array, 2, 4);
		
		System.out.println(Arrays.toString(result));
		
	}
}
