package com.nacs.generics.classes.main;

import com.nacs.generics.classes.GenericArray;

public class MainGenericArray {
	public static void main(String[] args) {
		GenericArray<Integer> intArray = new GenericArray<>();
		
		intArray.setTArray(new Integer[] {1,2,3,4,5});
		
		intArray.printTArray();
		
		GenericArray<String> stringArray = new GenericArray<>();
		
		stringArray.setTArray(new String[] {"Shivani", "Pranali", "Sakshi", "Pranjal"});
		
		stringArray.printTArray();
	}
}
