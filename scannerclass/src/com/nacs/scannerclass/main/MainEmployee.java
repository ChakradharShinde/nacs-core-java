package com.nacs.scannerclass.main;

import java.util.Scanner;

import com.nacs.scannerclass.Employee;

public class MainEmployee {
	public static void main(String[] args) {
		Employee employee1=new Employee();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter employee id:");
		employee1.setEmployeeId(scanner.nextInt());
		scanner.nextLine();
		System.out.println("Enter employee Name:");
		employee1.setEmployeeName(scanner.nextLine());
		System.out.println("Enter employee salary:");
		employee1.setEmployeeSalary(scanner.nextFloat());
		System.out.println("Enter employee Gender as M or F:");
		employee1.setEmployeeGender(scanner.next().charAt(0));
		
		scanner.close();
	}
}
