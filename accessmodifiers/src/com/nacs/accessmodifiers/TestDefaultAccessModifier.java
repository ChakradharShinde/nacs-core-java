package com.nacs.accessmodifiers;

public class TestDefaultAccessModifier {
	public int getNumberFromDefaultClass() {
		DefaultAccessModifier defaultAccessModifier
		    = new DefaultAccessModifier();
		
		return defaultAccessModifier.getNumber();
	}
}
