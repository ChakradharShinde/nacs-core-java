package com.nacs.miniproject2.services;

import com.nacs.miniproject2.entities.Student;
import com.nacs.miniproject2.exceptions.InvalidAgeException;
import com.nacs.miniproject2.exceptions.InvalidNameException;
import com.nacs.miniproject2.exceptions.InvalidRollNoException;
import com.nacs.miniproject2.exceptions.InvalidStackIndexException;

public interface StudentService {
	String pushStudent(Student student) throws InvalidStackIndexException,InvalidRollNoException, InvalidAgeException, InvalidNameException;
	
	String popStudent() throws InvalidStackIndexException;
	
	String printStack();
}