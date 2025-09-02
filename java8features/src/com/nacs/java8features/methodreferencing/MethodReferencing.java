package com.nacs.java8features.methodreferencing;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;

public class MethodReferencing {
	
	public static void main(String[] args) {
//		Consumer<String> printer = msg -> System.out.println(msg);
		
		Consumer<String> printer = System.out::println;
		
		printer.accept("Sakshi");
		
//		Function<String, Integer> strLength = str -> str.length();
		Function<String, Integer> strLength = String::length;
		System.out.println(strLength.apply("Babita"));
		
		
		String[] names = {"Rohit", "Tejas", "Yash", "Pratik", "Jay"};
		Function<String, String> toUpper = MethodReferencing::toUpper;
		
		for(String name:names)
			System.out.println(toUpper.apply(name));
		
		MethodReferencing obj = new MethodReferencing();
		
//		IntPredicate evenOrOdd = number -> obj.isEven(number);
		IntPredicate evenOrOdd = obj::isEven;
		if(evenOrOdd.test(10)) {
			System.out.println("10 is a Even Number");
		}else
			System.out.println("10 is a Odd Number");
	}
	
	
	
	public static String toUpper(String str) {
		return str.toUpperCase();
	}
	
	public boolean isEven(int number) {
		return number%2==0;
	}
	
	
	
	
	
	
	
}
