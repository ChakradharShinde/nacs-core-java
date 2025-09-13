package com.nacs.miniproject2.dao.impl;

import com.nacs.miniproject2.dao.StudentDao;
import com.nacs.miniproject2.entities.Student;
import com.nacs.miniproject2.exceptions.InvalidStackIndexException;

public class StudentDaoImpl implements StudentDao {
	
	private int top;
	
	private Student[] studentsStack;
	
	public StudentDaoImpl() {
		top=-1;
		studentsStack = new Student[3];
	}
	
	@Override
	public String pushStudent(Student student) throws InvalidStackIndexException {
		top++;
		try {
			studentsStack[top]=student;
		}catch(ArrayIndexOutOfBoundsException e) {
			
			top=studentsStack.length-1;
			throw new InvalidStackIndexException("Stack Overflow",e);
		}
		
		return "Student Data Pushed to Stack Successfully...";
	}
	
	@Override
	public String popStudent() throws InvalidStackIndexException{
		try {
			studentsStack[top]=null;
		}catch(ArrayIndexOutOfBoundsException e) {
			throw new InvalidStackIndexException("Stack is Empty", e);
		}
		top--;
		return "Student Data Popped from Stack Successfully...";
	}
	
	public String printStack() {
//		String stack="";
//		for(int i=studentsStack.length-1;i>=0;i++)
//			stack = stack + studentsStack[i]+"\n";
		StringBuilder sb = new StringBuilder();
		sb.append("-------------------------------------------------");
		for(int i=studentsStack.length-1;i>=0;i--) {
			sb.append("\n"+studentsStack[i]+"\n");
			sb.append("-------------------------------------------------");
		}
			
		return sb.toString();
	}
}
