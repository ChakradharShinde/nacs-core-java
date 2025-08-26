package com.nacs.scannerclass;
import java.util.Scanner;
public class MainScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter a Number:");
		byte var1=scanner.nextByte();
		System.out.println(var1);
		
		
		System.out.println("Enter boolean data:");
		boolean flag=scanner.nextBoolean();
		System.out.println("flag =" + flag);
		
		
		
		System.out.println("Enter Your Name:");
		scanner.nextLine();
		String name=scanner.nextLine();
		System.out.println("name = " + name);
		
		
		System.out.println("Enter Gender as M or F: ");
		char gender=scanner.next().charAt(0);
		System.out.println("Gender =" + gender);
		scanner.close();
	}
}
