package com.nacs.accessmodifiers;

public class ProtectedAccessModifier {
	protected int number;

	protected ProtectedAccessModifier() {

	}

	protected ProtectedAccessModifier(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
