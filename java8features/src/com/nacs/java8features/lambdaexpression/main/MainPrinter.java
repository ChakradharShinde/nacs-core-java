package com.nacs.java8features.lambdaexpression.main;

import com.nacs.java8features.lambdaexpression.Printer;

public class MainPrinter {
	public static void main(String[] args) {
		Printer stringPrinter = data -> System.out.println(data);

		stringPrinter.printData("NACS");
	}
}
