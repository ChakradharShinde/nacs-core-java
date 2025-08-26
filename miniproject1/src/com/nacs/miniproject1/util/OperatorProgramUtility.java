package com.nacs.miniproject1.util;

import java.util.Scanner;

import com.nacs.operators.BinaryOperation;
import com.nacs.operators.BitwiseShiftOperation;
import com.nacs.operators.UnaryOperation;

public class OperatorProgramUtility {
	public void printOperatorProgramMenu(Scanner scanner) {
		int choice = 0;
		do {
			choice = printMenu(scanner);
			switch (choice) {
			case 1 -> calculateOnesComplement(scanner);
			case 2 -> leftShiftByPosition(scanner);
			case 3 -> rightShiftByPosition(scanner);
			case 4 -> addTwoNumbers(scanner);
			case 0 -> System.out.println("Bye.. Bye..");
			default -> System.out.println("Invalid Input..");
			}
		} while (choice != 0);
	}

	private int printMenu(Scanner scanner) {
		System.out.println("Operator Programs Menu");
		System.out.println("1. 1's Complement");
		System.out.println("2. Left Shift");
		System.out.println("3. Right Shift");
		System.out.println("4. Add two Numbers");
		System.out.println("0. Exit.");
		return scanner.nextInt();
	}

	private void calculateOnesComplement(Scanner scanner) {
		UnaryOperation unaryOperation = new UnaryOperation();
		System.out.println("Enter a Number to Calculate it's 1's complement");
		unaryOperation.setOperand1(scanner.nextInt());
		unaryOperation.calculateOnesComplement();
		System.out.println("1's complement result is: " + unaryOperation.getOperand1());
	}

	private void leftShiftByPosition(Scanner scanner) {
		BitwiseShiftOperation bitwiseShifting = new BitwiseShiftOperation();
		System.out.println("Enter a Number..");
		bitwiseShifting.setOperand1(scanner.nextInt());
		System.out.println("Enter a Position value to left Shift a Number");
		System.out.println("Left shift result is " + bitwiseShifting.leftShiftWithPosition(scanner.nextInt()));
	}

	private void rightShiftByPosition(Scanner scanner) {
		BitwiseShiftOperation bitwiseShifting = new BitwiseShiftOperation();
		System.out.println("Enter a Number..");
		bitwiseShifting.setOperand1(scanner.nextInt());
		System.out.println("Enter a Position value to right Shift a Number");
		System.out.println("Right shift result is " + bitwiseShifting.rightShiftWithPosition(scanner.nextInt()));
		;
	}

	private void addTwoNumbers(Scanner scanner) {
		BinaryOperation binaryOperation = new BinaryOperation();
		System.out.println("Enter Operand 1..");
		binaryOperation.setOperand1(scanner.nextInt());
		System.out.println("Enter Operand 2..");
		binaryOperation.setOperand2(scanner.nextInt());
		System.out.println("Addition Result is: " + binaryOperation.addTwoNumbers());
	}

}
