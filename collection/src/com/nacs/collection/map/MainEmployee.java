package com.nacs.collection.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import com.nacs.collection.map.entities.Employee;

public class MainEmployee {
	public static void main(String[] args) {
		Map<Employee, Float> empSalary = new LinkedHashMap<>();
		empSalary.put(new Employee(1,"Shruti", "Develpment", "Lal Taki"), 30000F);
		empSalary.put(new Employee(2,"Sakshi", "HR", "Savedi"), 40000F);
		empSalary.put(new Employee(3,"Sakshi", "Account", "Delhi Gate"), 25000F);
		empSalary.put(new Employee(4,"Sakshi", "Manager", "DSP Chowk"), 70000F);
		
		Employee[] employees = {
				new Employee(5,"Shraddha", "HR", "Savedi"),
				new Employee(6,"Babita", "Development", "Ked Gaon"),
				new Employee(7,"Priyanka", "Account", "Saras Nagar"),
				new Employee(8, "kajal", "Manager", "Nale Gaon"),
				new Employee(1,"Shruti", "Develpment", "Lal Taki"),
				new Employee(2,"Sakshi", "HR", "Savedi"),
				new Employee(3,"Sakshi", "Account", "Delhi Gate"),
				new Employee(4,"Sakshi", "Manager", "DSP Chowk")
		};
		
		for(Employee employee:employees) {

//			empSalary.computeIfPresent(employee, (k,v)-> v+(v*0.1F));
//			empSalary.computeIfAbsent(employee, k->30000F);
			empSalary.merge(employee, 30000F, (o,n)->o+(o*0.1F));
		}
		
		Iterator<Map.Entry<Employee,Float>> empIterator=empSalary.entrySet().iterator();
		while(empIterator.hasNext()) {
			Map.Entry<Employee, Float> employeeEntry = empIterator.next();
			System.out.println(employeeEntry.getKey() + " : " + employeeEntry.getValue() );
		}
		
		Float salary=empSalary.getOrDefault(new Employee(3,"Sakshi", "Account", "Delhi Gate"),30000F);
		System.out.println(salary);
		
		
	}
}







