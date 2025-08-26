package com.nacs.miniproject1.util.main;

import java.util.Scanner;

import com.nacs.miniproject1.util.DataTypeProgramUtility;
import com.nacs.miniproject1.util.LogicalProgramUtility;
import com.nacs.miniproject1.util.OperatorProgramUtility;

public class MainApplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice=0;
		do {
			
			choice=printMenu(scanner);
			
			
			switch(choice) {
			case 1 -> {
							LogicalProgramUtility logicalUtility = new LogicalProgramUtility();
							logicalUtility.printLogicalProgramMenu(scanner);
						}
			case 2 -> {
							DataTypeProgramUtility dataTypeUtility = new DataTypeProgramUtility();
							dataTypeUtility.printDataTypeMenu(scanner);
						}
			case 3 -> {
							OperatorProgramUtility operatorUtility = new OperatorProgramUtility();
							operatorUtility.printOperatorProgramMenu(scanner);
						}
			case 0 -> System.out.println("Bye.. Bye..");
			default -> System.out.println("Invalid Input");
			}
		}while(choice!=0);
		scanner.close();
	}
	
	public static int printMenu(Scanner scanner) {
		char ch='\u0C68';
		System.out.println(ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "");
		System.out.println("1. Logical Programs");
		System.out.println("2. Data Types Program");
		System.out.println("3. Operators Program");
		System.out.println("0. Exit");
		System.out.println(ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "" + ch + "");
		return scanner.nextInt();
	}
}
