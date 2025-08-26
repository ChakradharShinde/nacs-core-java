package com.nacs.accessmodifiers;

public class PrivateAccessModifier {
	private int number;

	private PrivateAccessModifier() {

	}

	public PrivateAccessModifier(int number) {
		if(isValid(number))
			this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		if(isValid(number))
			this.number = number;
	}
	
	private boolean isValid(int number) {
		return number>=18 && number<=21;
	}

}
