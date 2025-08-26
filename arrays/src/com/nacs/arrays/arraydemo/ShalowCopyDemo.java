package com.nacs.arrays.arraydemo;

import java.util.Scanner;

public class ShalowCopyDemo {
	public static void main(String[] args) {
//		int[] array = {1,2,3,4,5};
//		
//		int[] array2 = new int[5];
//		
//		
//		for(int i=0;i<array.length;i++)
//			array2[i]=array[i];
		
//		addTen(array);
//		
//		for(int i=0;i<array.length;i++)
//			System.out.println(array[i]);
		Scanner scanner = new Scanner(System.in);
		useScanner(scanner);
		int data=10;
		usePrimitive(data);
		scanner.close();
		
	}
	
	public static void usePrimitive(int data) {
		data=data+10;
	}
	
	
	public static void useScanner(Scanner scanner) {
		System.out.println("Enter Name:");
		System.out.println(scanner.next());
	}
	
	public static void addTen(int... array) {
		
		for(int i=0;i<array.length;i++)
			array[i]=array[i]+10;
		
	}
}
