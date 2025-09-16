package com.nacs.java8features.streamapi;

import java.util.Arrays;

import com.nacs.java8features.streamapi.entities.Student;

public class MainStudent {
	public static void main(String[] args) {
		Student[] studentArray = { 
				new Student(1, "Abc"), 
				new Student(1, "Abc"), 
				new Student(1, "Abc"), 
			};
		
		Arrays.stream(studentArray).distinct().forEach(System.out::println);
			
	}
}
