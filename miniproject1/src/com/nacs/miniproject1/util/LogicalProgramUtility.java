package com.nacs.miniproject1.util;

import java.util.Scanner;

import com.nacs.logicalprograms.CheckNumbers;
import com.nacs.logicalprograms.PatternPrinting;

public class LogicalProgramUtility {
	public void printLogicalProgramMenu(Scanner scanner) {
		int choice = 0;
		do {
			choice = printMenu(scanner);
			switch (choice) {
			case 1 -> checkPerfectNumber(scanner);
			case 2 -> checkPrimeNumber(scanner);
			case 3 -> checkArmstrongNumber(scanner);
			case 4 -> checkPalindromeNumber(scanner);
			case 5 -> printSquare(scanner);
			case 6 -> printTriangle(scanner);
			case 0 -> System.out.println("Bye.. Bye..");
			default -> System.out.println("Invalid Input..");
			}
		} while (choice != 0);
	}

	private void checkPerfectNumber(Scanner scanner) {
		CheckNumbers checkNumber = new CheckNumbers();
		System.out.println("Enter a Number to check whether it is Perfect or Not");
		checkNumber.setNumber(scanner.nextInt());
		if (checkNumber.isPerfect())
			System.out.println(checkNumber.getNumber() + " is a Perfect Number");
		else
			System.out.println(checkNumber.getNumber() + " is not a Perfect Number");
	}

	private void checkPrimeNumber(Scanner scanner) {
		CheckNumbers checkNumber = new CheckNumbers();
		System.out.println("Enter a Number to check whether it is Prime or Not");
		checkNumber.setNumber(scanner.nextInt());
		if (checkNumber.isPrime())
			System.out.println(checkNumber.getNumber() + " is a Prime Number");
		else
			System.out.println(checkNumber.getNumber() + " is not a Prime Number");
	}

	private void checkPalindromeNumber(Scanner scanner) {
		CheckNumbers checkNumber = new CheckNumbers();
		System.out.println("Enter a Number to check whether it is Palindrome or Not");
		int number = scanner.nextInt();
		checkNumber.setNumber(number);
		if (checkNumber.isPalindrome())
			System.out.println(number + " is a Palindrome Number");
		else
			System.out.println(number + " is not a Palindrome Number");
	}

	private void checkArmstrongNumber(Scanner scanner) {
		CheckNumbers checkNumber = new CheckNumbers();
		System.out.println("Enter a Number to check whether it is Armstrong or Not");
		checkNumber.setNumber(scanner.nextInt());
		if (checkNumber.isArmstrong())
			System.out.println(checkNumber.getNumber() + " is a Armstrong Number");
		else
			System.out.println(checkNumber.getNumber() + " is not a Armstrong Number");
	}

	private void printSquare(Scanner scanner) {
		PatternPrinting patternPrint = new PatternPrinting();
		System.out.println("Enter no of row and columns to be printed for Square");
		patternPrint.setRow(scanner.nextInt());
		patternPrint.printSquareWithAlphabetsAndDigits();
	}

	private void printTriangle(Scanner scanner) {
		PatternPrinting patternPrint = new PatternPrinting();
		System.out.println("Enter no of row and columns to be printed for Triangle");
		patternPrint.setRow(scanner.nextInt());
		patternPrint.printTriangle();
	}

	private int printMenu(Scanner scanner) {
		System.out.println("Logical Programs");
		System.out.println("1. Perfect Number");
		System.out.println("2. Prime Number");
		System.out.println("3. Armstrong Number");
		System.out.println("4. Palindrome Number");
		System.out.println("5. Print Square");
		System.out.println("6. Print Triangle");
		System.out.println("0. Exit...");
		return scanner.nextInt();
	}

}
