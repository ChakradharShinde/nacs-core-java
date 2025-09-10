package com.nacs.exceptions.basics;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionBasicsDemo {
	public static void main(String[] args) {
		// syntacticle constraint voilation
//		StringBuilder sb = new StringBuilder();
//		
//		int var1=10;
//		
//		System.out.println(var1);
//		
////		semantic constraint voilation
//		String name="Abc";
//		int[] intArray= {1,2,3};

//		name.charAt(5);

//		intArray[3]=10;

//		Integer intVar = Integer.parseInt("99999999999");

		Object result = "Name";

		String stringResult = (String) result;

//		Integer intResult = (Integer)result;

//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("After 3 second..");

//		try {
//			FileReader reader = new FileReader("demo.txt");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		try {
//			Class.forName("com.example.Demo");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		divideByZero();

	}

	public static void divideByZero() {
		System.out.println("Method Started...");

		int no = 10 / 0;

		System.out.println("Method Ends here...");
	}

}
