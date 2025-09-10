package com.nacs.exceptions.basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinally {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		printData(scanner, 3);
		System.out.println("After print Data...");
		scanner.close();
	}
	
	public static void printData(Scanner scanner, int attempts) {
		int number=0;
		System.out.println("Enter a Integer Number: remaining attempts " + attempts);
		try {
			number = scanner.nextInt();
			number=10/0;
		}catch(InputMismatchException e) {
			scanner.nextLine();
			if(attempts>1)
				printData(scanner, attempts-1);
			
			System.out.println(e);
		}finally {
			System.out.println("this is finally block..");
			scanner.close();
		}
		System.out.println(number);
		
	}
}
