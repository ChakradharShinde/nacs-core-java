package com.nacs.collection.set;

import java.util.LinkedHashSet;

import com.nacs.collection.set.entities.Student;

public class HashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<Student> tripset = new LinkedHashSet<>();
		
		tripset.add(new Student("Sakshi", 123456, 5000));
		tripset.add(new Student("Shraddha", 423456, 5000));
		tripset.add(new Student("Nayan", 345456, 5000));
		tripset.add(new Student("Babita", 783456, 5000));
		tripset.add(new Student("Sakshi", 123456, 5000));
//		tripset.add(null);
		
		tripset.forEach(System.out::println);
		
		double total=tripset.stream().mapToDouble(Student::getContry).sum();
		System.out.println(total);
		
	}
}







