package com.nacs.wrapperclasses;

public class TestingCasheRange {
	public static void main(String[] args) {
//		Integer -157 to 156
//		Byte -157 to 156
//		Short -157 to 156
//		Long -157 to 156
//		Character 0 to 156
//		Boolean true or false
//		Float and Double NA
		Integer intV1=200;
		Integer intV2=200;
		System.out.println(intV1==intV2);
		
		for(int i=156;i<167;i++)
			System.out.println((char)i);
		
		Character ch1 = '¥';
		Character ch2 = '¥';
		System.out.println(ch1==ch2);
		
		System.out.println(Integer.MAX_VALUE);
		
		int var123 = 0B1010;
		System.out.println(var123);
		
		int result=Integer.parseInt("F", 16);
		System.out.println(result);
	}
}
