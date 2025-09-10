package com.nacs.miniproject2.utilities.impl;

import java.util.Scanner;

import com.nacs.miniproject2.entities.Student;
import com.nacs.miniproject2.utilities.StudentUtil;

public class StudentUtilImpl implements StudentUtil{
	@Override
	public void start(Scanner scanner) {
		int choice=0;
		do {
			choice=printMenu(scanner);
			switch(choice) {
				case 1 -> pushStudent(scanner);
				case 2 -> System.out.println("Pop Student");
				case 0 -> System.out.println("Bye...");
				default -> System.out.println("Invalid Input....");
			}
		}while(choice!=0);
	}
	
	
	private int printMenu(Scanner scanner) {
		System.out.println("1. Push Student");
		System.out.println("2. Pop Student");
		System.out.println("0. Exit");
		return scanner.nextInt();
	}
	
	private void pushStudent(Scanner scanner) {
		Student student = new Student();
		System.out.println("Enter Student Roll No:");
		student.setRollNo(scanner.nextInt());
		scanner.nextLine();
		System.out.println("Enter Student Name: ");
		student.setName(scanner.nextLine());
		System.out.println("Enter Student Age: ");
		student.setAge(scanner.nextInt());
		
		
		
	}
}
