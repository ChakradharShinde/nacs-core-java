package com.nacs.accessmodifiers;

public class TestPrivateAccessModifier {
	public static void main(String[] args) {
		int number=10;
		PrivateAccessModifier privateAccessModifier = 
				new PrivateAccessModifier(19);
		
		System.out.println(privateAccessModifier.getNumber());
	}
}
