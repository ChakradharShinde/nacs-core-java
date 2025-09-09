package com.nacs.java8features.methodreferencing;

import java.util.Arrays;
import java.util.function.Consumer;

public class MethodReferencing {

	public static void main(String[] args) {
//		Bound object example
//		Student student = new Student();
//
//		Consumer<String> setName = student::setName;
//
//		setName.accept("Vaibhav");
//
//		IntConsumer setRollNo = student::setRollNo;
//
//		setRollNo.accept(101);
//
//		System.out.println(student);
//
//		IntSupplier getRollNo = student::getRollNo;
//
//		System.out.println(getRollNo.getAsInt());
//
//		Supplier<String> getName = student::getName;
//
//		System.out.println(getName.get());
//		
//		Arbitry object example
//
//		Function<Student, String> getString = Student::toString;
//
//		Student[] students = { new Student(1, "Ganesh"), new Student(2, "Om"), new Student(3, "Tejas"),
//				new Student(4, "Vaibhav") };
//
//		for (Student student1 : students)
//			System.out.println(getString.apply(student1));
//		
//		
//		Supplier<Student> getStudentObject = Student::new;
//		
//		Student student3=getStudentObject.get();
//		
//		Consumer<String> printStr = MethodReferencing::printData;
//		
//		printStr.accept("Yash");

//		Consumer<Student> printRollNo = Student::printRollNo;
//		Consumer<Student> printName = Student::printName;
//		
//		Consumer<Student> printAll = printRollNo.andThen(printName);
//		Student student5 = new Student(107,"Yash"); 
//		
//		printAll.accept(student5);

		Consumer<int[]> sortArray = Arrays::sort;

		int[] intArray = { 4, 3, 5, 1, 2 };

		System.out.println("Before Sorting : " + Arrays.toString(intArray));

		sortArray.accept(intArray);

		System.out.println("After Sorting : " + Arrays.toString(intArray));

	}

	public static void printData(String data) {
		System.out.println(data);
	}

}
