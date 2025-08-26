package com.nacs.miniproject1.util;

import java.util.Scanner;

import com.nacs.datatypes.typecasting.TypeCasting;

public class DataTypeProgramUtility {
	public void printDataTypeMenu(Scanner scanner) {
		int choice = 0;
		do {
			choice = printMenu(scanner);
			switch (choice) {
			case 1 -> wideningToFloat(scanner);
			case 2 -> narrowingToChar(scanner);
			case 0 -> System.out.println("Bye.. Bye..");
			default -> System.out.println("Invalid Input..");
			}
		} while (choice != 0);

	}

	private int printMenu(Scanner scanner) {
		System.out.println("Data Type Menu");
		System.out.println("1. Widening To Float");
		System.out.println("2. Narrowing To Char");
		System.out.println("0. Exit");
		return scanner.nextInt();
	}

	private void wideningToFloat(Scanner scanner) {
		TypeCasting typeCasting = new TypeCasting();
		System.out.println("Enter a Character to type caste into Float");
		typeCasting.wideningToFloat(scanner.next().charAt(0));
		System.out.println("Float result is: " + typeCasting.getNumber());
	}

	private void narrowingToChar(Scanner scanner) {
		TypeCasting typeCasting = new TypeCasting();
		System.out.println("Enter a Number to Type caste into Char");
		typeCasting.narrowingToChar((char) scanner.nextInt());
		System.out.println("Char result is: " + typeCasting.getCharVariable());
	}

}
