package com.nacs.recursion;

public class RecursionDemo {
	
//	
//	
//	public static void main(String[] args) {
//		System.out.println(print(5));
//	}
//	
//	public static int print(int number) {
// //		if(number<=1)
// //			return 1;
// //		
// //		return print(number-1)*number;
//		
//		return (number<=1)?1:print(number-1)*number;
//		
//	}
	
	public static void main(String[] args) {
		int result=print(7);
		System.out.println(result);
	}
	
	public static int print(int number) {
		return (number<=1)?number:print(number-1)+print(number-2);
	}
	
	
	
}
