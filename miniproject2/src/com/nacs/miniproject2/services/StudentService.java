package com.nacs.miniproject2.services;

import com.nacs.miniproject2.entities.Student;
import com.nacs.miniproject2.exceptions.InvalidAgeException;
import com.nacs.miniproject2.exceptions.InvalidNameException;
import com.nacs.miniproject2.exceptions.InvalidRollNoException;

public interface StudentService {
	String pushStudent(Student student) throws InvalidRollNoException, InvalidAgeException, InvalidNameException;
	
	String popStudent();
}
