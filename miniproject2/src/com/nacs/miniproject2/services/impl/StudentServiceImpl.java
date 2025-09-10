package com.nacs.miniproject2.services.impl;

import com.nacs.miniproject2.entities.Student;
import com.nacs.miniproject2.exceptions.InvalidAgeException;
import com.nacs.miniproject2.exceptions.InvalidNameException;
import com.nacs.miniproject2.exceptions.InvalidRollNoException;
import com.nacs.miniproject2.services.StudentService;

public class StudentServiceImpl implements StudentService{
	@Override
	public String pushStudent(Student student) throws InvalidRollNoException, InvalidAgeException, InvalidNameException{
		if(isValid(student)) {
			System.out.println("Dao");
		}else
			System.out.println("return Presentation");
		return null;
	}
	
	private boolean isValid(Student student) throws InvalidRollNoException, InvalidAgeException, InvalidNameException{
		if(student.getRollNo()<=0)
			throw new InvalidRollNoException("Roll No must be Greater than 0");
		else if(!student.getName().matches("[]"))
			throw new InvalidNameException("Name must follow []");
		else if(student.getAge()<=15)
			throw new InvalidAgeException("Age must be greater than 15");
		
		return true;
	}
	
	@Override
	public String popStudent() {
		return null;
	}
}
