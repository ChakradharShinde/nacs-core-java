package com.nacs.wrapperclasses;

import java.util.Arrays;
import java.util.Scanner;

public class WrapperClassDemo {
	public static void main(String[] args) {
//		int var1 = 10;
////		Deprecated from java 9 SE
//		Integer intObject = new Integer(10);
//
////		Boxing Wrapping primitive type into Wrapper class object
//		Integer intObject1 = Integer.valueOf(var1);
//		
////		Auto Boxing
//		Integer intObject2 = var1;
//		
////		UnBoxing unwrap Wrapper class object into primitive type
//		int var2 = intObject.intValue();
//		
////		Auto UnBoxing
//		int var3 = intObject;
//		
//		Float floatVariable = 12.3F;
//		
//		byte intVariable123 = floatVariable.byteValue();	
//		
//		
//		Float floatVariable1 = Float.parseFloat("12.34");
//		
//		
//		System.out.println(floatVariable.equals(floatVariable1));
//		
//		System.out.println(floatVariable1.compareTo(floatVariable));
//		
//		Double[] doubleArray = {12.3D,12.2D,11.5D,10.3D};
//		System.out.println("Before Sorting : " + Arrays.toString(doubleArray));
//		Double[] sortedArray=sort(doubleArray);
//		
//		System.out.println("After Sorting : " + Arrays.toString(sortedArray));
//		
//		
//		Boolean booleanVariable = false;
//		
//		boolean booleanVariable1 = booleanVariable;
		Scanner scanner = new Scanner(System.in);
//		
//		Boolean booleanVariable2 = Boolean.parseBoolean(scanner.next());
//		System.out.println(booleanVariable2);
//		
//		System.out.println("Enter Your Name:");
//		String name = scanner.next();
//		
//		System.out.println(Character.toLowerCase('A'));
		
		System.out.println("Enter your Name");
		String name=scanner.next();
		
		if(name.matches("[A-Z][a-z]+")) {
			System.out.println("Valid Name");
		}else
			System.out.println("Invalid name");
		
		char[] charArray = new char[name.length()];
		
		for(int i=0;i<name.length();i++)
			if(i%2==0)
				charArray[i]=Character.toUpperCase(name.charAt(i));
			else
				charArray[i]=Character.toLowerCase(name.charAt(i));
		
//		String result = new String(charArray);
		
		
		StringBuilder result = new StringBuilder();
		for(char ch:charArray)
			result.append(ch);
		
		System.out.println(charArray);
		scanner.close();
	}
	
	
	public static Double[] sort(Double... doubleArray) {
		
		for(int i=0;i<doubleArray.length;i++)
			for(int j=0;j<doubleArray.length-1;j++)
				if(doubleArray[j].compareTo(doubleArray[j+1])>0) {
					Double temp = doubleArray[j];
					doubleArray[j]=doubleArray[j+1];
					doubleArray[j+1]=temp;
					
				}
					
		
		return doubleArray;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
