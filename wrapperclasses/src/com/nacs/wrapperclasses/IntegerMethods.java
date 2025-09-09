package com.nacs.wrapperclasses;

import java.util.function.IntUnaryOperator;

import com.nacs.wrapperclasses.interfaces.Expression;

public class IntegerMethods {
	public static void main(String[] args) {
		Integer var1 = 200;
		Integer var2 = 209;
		
		System.out.println(var1.equals(var2));
		
		
//		System.out.println(var1.compareTo(var2));
//	
//		System.out.println(Integer.compare(var1, var2));
		
//		BinaryOperator<Integer> greaterObject = (number1,number2) -> number1.compareTo(number2);
//		
//		System.out.println(greaterObject.apply(var1, var2));
		
		IntUnaryOperator compareResult = var1::compareTo;
		
		System.out.println(compareResult.applyAsInt(var2));
		
		
		
		System.out.println(Expression.greaterObject.applyAsInt(var1, var2));
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
