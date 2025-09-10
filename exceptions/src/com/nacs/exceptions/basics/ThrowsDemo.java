package com.nacs.exceptions.basics;

public class ThrowsDemo {
	public static void main(String[] args) throws InterruptedException{
		divideByZero();
	}
	
	public static void divideByZero() throws InterruptedException{
		Thread.sleep(3000);
	}
}
