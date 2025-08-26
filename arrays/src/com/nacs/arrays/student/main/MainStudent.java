package com.nacs.arrays.student.main;

import java.util.Scanner;

import com.nacs.arrays.student.Student;

public class MainStudent {
	public static void main(String[] args) {
		Student[] students = new Student[5];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
			System.out.println("Roll No:");
			students[i].setRollNo(scanner.nextInt());
			System.out.println("Name:");
			scanner.nextLine();
			students[i].setName(scanner.nextLine());
			System.out.println("Fees:");
			students[i].setFees(scanner.nextFloat());
			System.out.println("Area:");
			scanner.nextLine();
			students[i].setArea(scanner.nextLine());
		}
		
		Student.sortByRollNo(students);

		for (Student student : students)
//			if(student.getName().charAt(0)=='S')
				System.out.println(student);
		scanner.close();
	}
}
