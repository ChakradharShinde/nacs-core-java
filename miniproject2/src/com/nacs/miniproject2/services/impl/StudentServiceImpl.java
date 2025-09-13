package com.nacs.miniproject2.services.impl;

import com.nacs.miniproject2.dao.StudentDao;
import com.nacs.miniproject2.dao.impl.StudentDaoImpl;
import com.nacs.miniproject2.entities.Student;
import com.nacs.miniproject2.exceptions.InvalidAgeException;
import com.nacs.miniproject2.exceptions.InvalidNameException;
import com.nacs.miniproject2.exceptions.InvalidRollNoException;
import com.nacs.miniproject2.exceptions.InvalidStackIndexException;
import com.nacs.miniproject2.services.StudentService;

public class StudentServiceImpl implements StudentService{
	
	private StudentDao dao = new StudentDaoImpl();
	
	@Override
	public String pushStudent(Student student) throws InvalidRollNoException, InvalidAgeException, InvalidNameException, InvalidStackIndexException{
		String msg="";
		if(isValid(student)) {
			msg=dao.pushStudent(student);
		}else
			msg="Invalid Student Data Input..";
		return msg;
	}
	
	private boolean isValid(Student student) throws InvalidRollNoException, InvalidAgeException, InvalidNameException{
		if(student.getRollNo()<=0)
			throw new InvalidRollNoException("Roll No must be Greater than 0");
		else if(!student.getName().matches("[A-Z][a-z]{1,14}( [A-Z][a-z]{1,14}){1,2}"))
			throw new InvalidNameException("Name must follow [A-Z][a-z]{1,14}( [A-Z][a-z]{1,14}){1,2}");
		else if(student.getAge()<=15)
			throw new InvalidAgeException("Age must be greater than 15");
		
		return true;
	}
	
	@Override
	public String popStudent() throws InvalidStackIndexException {
		String msg="";
		msg=dao.popStudent();
		return msg;
	}
	
	public String printStack() {
		String msg=dao.printStack();
		return msg;
	}
}
