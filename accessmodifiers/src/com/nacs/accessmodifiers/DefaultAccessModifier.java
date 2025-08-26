package com.nacs.accessmodifiers;

class DefaultAccessModifier {
	int number;

	DefaultAccessModifier() {

	}

	DefaultAccessModifier(int number) {
		this.number = number;
	}

	int getNumber() {
		return number;
	}

	void setNumber(int number) {
		this.number = number;
	}

}
