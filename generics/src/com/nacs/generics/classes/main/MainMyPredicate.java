package com.nacs.generics.classes.main;

import com.nacs.generics.classes.MyPredicate;

public class MainMyPredicate {
	public static void main(String[] args) {
		MyPredicate<Integer> oddOrEven = number -> number%2==0;
		
		if(oddOrEven.myTest(100))
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
}
