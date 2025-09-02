package com.nacs.oops.abstraction.main;

import com.nacs.oops.abstraction.ArithematicOperation;
import com.nacs.oops.abstraction.impl.ArithematicOperationImpl;

public class MainArithematicOperationImpl {
	public static void main(String[] args) {
//		ArithematicOperation operation = new ArithematicOperationImpl();
//		int result=operation.addition(10, 20);
//		System.out.println(result);
//		int result=ArithematicOperation.modulo(10,3);
//		System.out.println(result);
		
		ArithematicOperation operation = new ArithematicOperationImpl();
		int result=operation.incrementByOne(10);
		System.out.println(result);
		System.out.println(ArithematicOperation.DEMO_VARIABLE);
	}
}
