package com.nacs.exceptions.basics;

public class Handlers {
	public static void main(String[] args) {
		int number=0;
		String name="Tejas";
		try {
			number=10/1;
			name.length();
			try {
				name.charAt(10);
			}catch(ArithmeticException e) {
				e.printStackTrace();
			}
			
			System.out.println("After Inner Try catch block");
			
		}catch(ArithmeticException e) {
			//e.printStackTrace();
			//System.out.println(e);
			System.out.println(e.getMessage());
			
		}catch(NullPointerException e) {
			e.printStackTrace();
		}catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("result: " + number);
	}
}
