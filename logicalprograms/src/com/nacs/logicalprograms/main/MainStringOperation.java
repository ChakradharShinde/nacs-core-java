package com.nacs.logicalprograms.main;

import com.nacs.logicalprograms.StringOperation;

public class MainStringOperation {
	public static void main(String[] args) {
		StringOperation stringOperation = new StringOperation();
		stringOperation.setData("Babita");
		System.out.println(stringOperation.reverseData());
		
		stringOperation.setData("I am from Laltaki Ahilya Nagar");
		System.out.println(stringOperation.reverseLineOfData());
	}
}
