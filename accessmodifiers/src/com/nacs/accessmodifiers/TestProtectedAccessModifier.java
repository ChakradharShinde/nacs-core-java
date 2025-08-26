package com.nacs.accessmodifiers;

public class TestProtectedAccessModifier {
	public static void main(String[] args) {
		ProtectedAccessModifier testProtected = new ProtectedAccessModifier();
		testProtected.number=20;
		testProtected.setNumber(10);
		System.out.println(testProtected.getNumber());
	}
}
