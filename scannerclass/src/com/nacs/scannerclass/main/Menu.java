package com.nacs.scannerclass.main;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		do {
			
			choice = printMenu(scanner);

			switch (choice) {
			case 1 -> System.out.println("Execute Logical Program..");
			case 2 -> System.out.println("Execute Data Type Program..");
			case 3 -> System.out.println("Execute Operator Program..");
			case 0 -> System.out.println("Bye.. Bye..");
			default -> System.out.println("Invalid Input...");
			}
		} while (choice != 0);

		scanner.close();
	}
	
	
	public static int printMenu(Scanner scanner) {
		System.out.println("1. Logical Programs");
		System.out.println("2. Data Types Program");
		System.out.println("3. Operators Program");
		System.out.println("0. Exit");
		return scanner.nextInt();
	}
	
	
	
	
}
