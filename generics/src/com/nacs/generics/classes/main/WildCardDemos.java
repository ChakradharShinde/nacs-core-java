package com.nacs.generics.classes.main;

import com.nacs.generics.classes.Box;

public class WildCardDemos {
	public static void main(String[] args) {
		Box<Number> objectBox = new Box<>();
//		objectBox.setData(100);
//		printData(objectBox);
		
		
		objectBox.setData(1000F);
		
	}
	
	public static <T> void printData(Box<? super Integer> box) {
		
//		? super Integer will accept Integer and Null
		Integer number=10;
		Number number1=20;
		Object number2=20;
		box.setData(number);
	}
	
	public static <T> Number getData(Box<? extends Number> obj) {
		return obj.getData();
	}
}
