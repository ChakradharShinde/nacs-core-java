package com.nacs.exceptions.basics;

public class UncheckedToCheckedExceptionDemo {
	public static void main(String[] args) {
		try {
			nullPointerExceptionDemo();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void nullPointerExceptionDemo() throws Exception{
		String name = null;

		try {
			System.out.println(name.length());
		} catch (NullPointerException e) {
			throw new Exception("Checked Exception..");
		}
	}
}
