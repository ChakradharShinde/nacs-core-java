package com.nacs.generics.classes.main;

import com.nacs.generics.classes.MyFunction;

public class MainMyFunction {
	public static void main(String[] args) {
		MyFunction<String, Integer> strLength = String::length;
		
		System.out.println(strLength.myApply("ABC"));
	}
}
