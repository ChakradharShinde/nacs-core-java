package com.nacs.generics.classes.main;

import com.nacs.generics.classes.ObjectClass;

public class MainObjectClass {
	public static void main(String[] args) {
		ObjectClass objDemo = new ObjectClass();
		
		objDemo.setObject(10);
		
		Integer no=(Integer)objDemo.getObject();
		
		String data = (String)objDemo.getObject();
	}
}
