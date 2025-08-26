package com.nacs.arrays.logicalprograms.main;

import com.nacs.arrays.logicalprograms.StringSorting;

public class MainStringSorting {
	public static void main(String[] args) {
		String[] nameArray = {"Rohit", "Tejas", "Pratik", "Yash", "Priyanka", "Rutuja", "Kajal"};
		StringSorting.insertionSort(nameArray);
		
//		for(int i=0;i<nameArray.length;i++)
//			System.out.print(nameArray[i] + " ");
		
		for(String name:nameArray)
			System.out.println(name+" ");
	}
}
