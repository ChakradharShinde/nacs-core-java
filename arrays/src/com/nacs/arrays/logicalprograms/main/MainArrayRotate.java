package com.nacs.arrays.logicalprograms.main;

import com.nacs.arrays.logicalprograms.ArrayRotate;

public class MainArrayRotate {
	public static void main(String[] args) {
		int[] array= new int[]{10,20,30,40,50};
		for(int i=0;i<2;i++)
			ArrayRotate.rotateLeft(array);
		for(int i=0;i<2;i++)
			ArrayRotate.rotateRight(array);
	}
}
