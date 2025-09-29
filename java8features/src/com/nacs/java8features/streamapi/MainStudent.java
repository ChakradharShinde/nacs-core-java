package com.nacs.java8features.streamapi;

import java.util.Comparator;
import java.util.stream.Stream;

import com.nacs.java8features.streamapi.entities.Student;

public class MainStudent {
	public static void main(String[] args) {
		Student[] studentArray = { 
				new Student(3, "Abc"), 
				new Student(2, "Bbc"), 
				new Student(1, "Cbc"), 
			};
		
//		Comparator<Student> sortByName = (s1,s2) -> s1.getName().compareTo(s2.getName());
//		Comparator<Student> sortByRollNo = (s1,s2) -> s1.getRollNo()-s2.getRollNo();
//		
		try(Stream<Student> studentStream = Stream.of(studentArray);){
			studentStream
			.sorted((o1,o2)->o1.getName().compareTo(o2.getName()))
			.forEach(System.out::println);
		}
			
	}
	
	
}
