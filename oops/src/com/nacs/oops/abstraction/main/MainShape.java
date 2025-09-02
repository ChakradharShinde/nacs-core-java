package com.nacs.oops.abstraction.main;

import com.nacs.oops.abstraction.impl.Circle;
import com.nacs.oops.abstraction.impl.Rectangle;

public class MainShape {
	public static void main(String[] args) {
//		Upcasting is not used because setHeight and setWidth Method available in sub class only
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(10);
		rectangle.setWidth(10);
		
		System.out.println(rectangle.calculateArea());
		rectangle.printArea();
		
		Circle circle = new Circle(10, 3.14F);
		System.out.println(circle.calculateArea());
		circle.printArea();
	}
	
	
	
	
	
	
	
	
}
