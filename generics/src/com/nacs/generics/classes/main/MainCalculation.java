package com.nacs.generics.classes.main;

import com.nacs.generics.classes.Calculation;

public class MainCalculation {
	public static void main(String[] args) {
		Calculation<Integer> intCalculation = new Calculation<>();
		
		double result = intCalculation.add(10, 20);
		System.out.println(result);
		
		Calculation<Float> floatCalculation = new Calculation<>();
		result=floatCalculation.add(10.23F, 20.32F);
		
		System.out.println(result);
	
	}
}
