package com.nacs.generics.classes;

public class Calculation<T extends Number> {
	public double add(T t1, T t2) {
		return t1.doubleValue()+t2.doubleValue();
	}
}
