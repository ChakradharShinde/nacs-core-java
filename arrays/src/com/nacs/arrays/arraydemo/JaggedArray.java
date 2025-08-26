package com.nacs.arrays.arraydemo;

public class JaggedArray {
	public static void main(String[] args) {
		int[][] jaggedArray = new int[3][];
		
		jaggedArray[0]=new int[]{1};
		jaggedArray[1]=new int[]{1,2};
		jaggedArray[2]=new int[]{1,2,3};
		
		int[][] jaggedArray1 = {{1},{1,2},{1,2,3}};
	}
}
