package com.nacs.miniproject2;

import java.util.Scanner;

import com.nacs.miniproject2.utilities.StudentUtil;
import com.nacs.miniproject2.utilities.impl.StudentUtilImpl;

public class App {
	public static void main(String[] args) {
		StudentUtil util = new StudentUtilImpl();
		try (Scanner scanner = new Scanner(System.in);) {
			util.start(scanner);
		}
	}
}
