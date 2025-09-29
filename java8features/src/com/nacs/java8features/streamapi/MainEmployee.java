package com.nacs.java8features.streamapi;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.stream.Stream;

import com.nacs.java8features.streamapi.entities.Employee;

public class MainEmployee {
	public static void main(String[] args) {
		Employee[] employees = {
				new Employee(1, "Shruti", "Delhi Gate", 40000F, "HR"),
				new Employee(2, "Sakshi", "Maliwada", 35000F, "Developer"),
				new Employee(3, "Sakshi", "Savedi", 21000F, "Accounts"),
				new Employee(4, "Shraddha", "Professor Chowk", 40000F, "HR"),
				new Employee(5, "Pranjal", "Tarakpur", 30000, "Developer"),
				new Employee(6, "Pranali", "Maliwada", 43000F, "HR"),
				new Employee(7, "Sakshi", "Market Yard", 50000F, "Manager"),
				new Employee(8, "Sakshi", "Saras Nagar", 42000F, "HR"),
				new Employee(9, "Babita", "Dsp Chowk", 33000F, "Developer"),
				new Employee(10, "Priyanka", "Maliwada", 40000F, "Accounts"),
				new Employee(11, "Kajal", "Kedgao", 35000F, "Developer"),
		};
		
		try(Stream<Employee> employeeStream = Arrays.stream(employees);
				){
			DoubleSummaryStatistics stats=employeeStream
					.mapToDouble(e->e.getSalary())
					.summaryStatistics();
			System.out.println(stats);
		}
	}
}
