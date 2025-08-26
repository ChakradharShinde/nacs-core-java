package com.nacs.arrays.arraydemo;
import java.util.Scanner;
public class ArrayDemo {
	public static void main(String[] args) {
		int[] subjects = new int[5];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<subjects.length;i++) {
			System.out.println("Enter marks for Subject " + (i+1));
			subjects[i]=scanner.nextInt();
		}
		
		
		int totalSum=0;
		for(int i=0;i<subjects.length;i++)
			totalSum=totalSum+subjects[i];
		
		System.out.println("Total Sum = " + totalSum);
		
		int averageMarks = totalSum/subjects.length;
		System.out.println("Average marks for each subject is = " + averageMarks);
		
		scanner.close();
		
		
		
		
		
		
		
		
		
		
	}
}
