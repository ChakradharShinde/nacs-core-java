package com.nacs.java8features.lambdaexpression.main;

import com.nacs.java8features.lambdaexpression.Expression;

public class MainExpression {
	public static void main(String[] args) {
		Expression intExpression = (var1)->{ return (var1%2==0);};
		
		if(intExpression.test(100))
			System.out.println("100 is a even number");
		else
			System.out.println("100 is a odd number");
	}
}
