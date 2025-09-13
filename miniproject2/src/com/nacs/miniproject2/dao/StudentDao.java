package com.nacs.miniproject2.dao;

import com.nacs.miniproject2.entities.Student;
import com.nacs.miniproject2.exceptions.InvalidStackIndexException;

public interface StudentDao {
	
	String pushStudent(Student student) throws InvalidStackIndexException;
	
	String popStudent() throws InvalidStackIndexException;
	
	String printStack();
}
