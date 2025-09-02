package com.nacs.oops.abstraction.impl;

import com.nacs.oops.abstraction.Shape;

public class Circle implements Shape {
	private final float PI;
	private int radius;
	public Circle() {
		PI=3.14F;
	}
	public Circle(int radius, float pi) {
		PI=pi;
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public float getPi() {
		return PI;
	}
	
	@Override
	public void printArea() {
		System.out.println("Area of Circle = " + calculateArea());
	}
	
	@Override
	public float calculateArea() {
		return PI*radius*radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
