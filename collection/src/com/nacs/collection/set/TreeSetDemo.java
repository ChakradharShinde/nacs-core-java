package com.nacs.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

import com.nacs.collection.set.entities.Employee;

public class TreeSetDemo {
	public static void main(String[] args) {
		
		Comparator<Employee> namebased = (e1,e2) -> e1.getName().compareTo(e2.getName());
		Comparator<Employee> salarybased = (e1,e2) -> (int) (e1.getSalary()-e2.getSalary());
		
//		TreeSet<String> intSet = new TreeSet<>();
//		
//		intSet.add("Shruti");
//		intSet.add("Pranali");
//		intSet.add("Sakshi");
//		intSet.add("Babita");
//		intSet.add("Nayan");
//		intSet.add("Shraddha");
//		intSet.add("Sakshi");
////		intSet.add(null);
//		
//		System.out.println(intSet);
		
		TreeSet<Employee> byCity = new TreeSet<>(namebased);
		byCity.add(new Employee("Priyanka","Ahilya Nagar", 45000));
		byCity.add(new Employee("Kajal","Pune", 45000));
		byCity.add(new Employee("Abhijit","Mumbai", 45000));
		byCity.add(new Employee("Vaibhav","Hyderabad", 45000));
		byCity.add(new Employee("Ganesh","Gurgaon", 45000));
		byCity.add(new Employee("Yash","Bangluru", 45000));
		byCity.add(new Employee("Yash","Ahilya Nagar", 45000));
		
		byCity.forEach(System.out::println);
		System.out.println("------------------------------------------------------------");
		
//		TreeSet<Employee> bySalary = new TreeSet<>(salarybased);
//		bySalary.add(new Employee("Priyanka","Ahilya Nagar", 45000));
//		bySalary.add(new Employee("Kajal","Pune", 45000));
//		bySalary.add(new Employee("Abhijit","Mumbai", 45000));
//		bySalary.add(new Employee("Vaibhav","Hyderabad", 45000));
//		bySalary.add(new Employee("Ganesh","Gurgaon", 45000));
//		bySalary.add(new Employee("Yash","Bangluru", 45000));
//		bySalary.add(new Employee("Yash","Ahilya Nagar", 45000));
//		
//		bySalary.forEach(System.out::println);
		
		System.out.println(byCity.last());
		
	}
}











