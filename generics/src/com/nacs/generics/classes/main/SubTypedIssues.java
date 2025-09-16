package com.nacs.generics.classes.main;

import com.nacs.generics.demos.GenericExample;

public class SubTypedIssues {
	public static void main(String[] args) {
		GenericExample<String> stringGeneric = new GenericExample<>();
		
		GenericExample<Object> objectGeneric = new GenericExample<>();
		
//		Both object are of Type GenericExample not of Type String and Object to upcaste or subcaste
//		objectGeneric = stringGeneric;
	}
}
