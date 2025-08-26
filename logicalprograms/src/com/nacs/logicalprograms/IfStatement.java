package com.nacs.logicalprograms;

public class IfStatement {
	
	public static void main(String[] args) {
		byte age=21;
		if(age>17)
			System.out.println("Candidate is Illegible for Voting.");
		
		int number=1000;
		if(number%2==0)
			System.out.println(number + " is a Even Number");
		else
			System.out.println(number + " is a Odd Number");
		
		byte marks=73;
		char grade='F';
		if(marks>=90)
			grade='A';
		else if(marks>=80)
			grade='B';
		else if(marks>=70)
			grade='C';
		else if(marks>=60)
			grade='D';
		else if(marks>=50)
			grade='E';
		else
			grade='F';
		
		System.out.println(grade);
			
		
	}
}
