package com.nacs.generics.classes.main;

import com.nacs.generics.classes.Box;
import com.nacs.generics.classes.Box1;
import com.nacs.generics.entities.Student;

public class MainBox {
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.setData("ABC");

		System.out.println(box.getData());

		Box<Student> studentBox = new Box<>();

		studentBox.setData(new Student());

		System.out.println(studentBox.getData());

		add(10, 20);
		add(20, 30);

//		can not instantiate Generic Array;
//		Box1<Integer>[] boxArray = new Box[3];
	}

	public static void add(int number1, int number2) {
		System.out.println(number1 + number2);
	}

}
