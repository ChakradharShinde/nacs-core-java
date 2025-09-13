package com.nacs.generics.demos;

import com.nacs.generics.entities.IntClass;
import com.nacs.generics.entities.StringClass;
import com.nacs.generics.entities.Student;
import com.nacs.generics.entities.StudentClass;

public class GenericDemo {
	public static void main(String[] args) {
		IntClass intData = new IntClass();
		intData.setData(10);
		System.out.println(intData.getData());
		
		StringClass stringData = new StringClass();
		
		stringData.setData("ABC");
		
		System.out.println(stringData.getData());
		
		StudentClass studentData = new StudentClass();
		
		studentData.setStudent(new Student(1,"ABC"));
		System.out.println(studentData.getStudent());
		
	}
}
