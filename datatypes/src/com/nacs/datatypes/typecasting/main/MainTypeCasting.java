package com.nacs.datatypes.typecasting.main;

import com.nacs.datatypes.typecasting.TypeCasting;

public class MainTypeCasting {
	public static void main(String[] args) {
		TypeCasting typeCasting = new TypeCasting();
		int number=10;
		char charVariable='A';
		byte byteVariable=65;
		typeCasting.wideningToFloat(number);
		typeCasting.narrowingToChar((char)byteVariable);
	}
}
