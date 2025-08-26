package com.nacs.accessmodifiers.anotherpackage;
import com.nacs.logicalprograms.CheckNumbers;
public class MainAccessClassFromAnotherModule {
	public static void main(String[] args) {
		CheckNumbers checkNumber = new CheckNumbers();
		checkNumber.setNumber(103);
		if(checkNumber.isPrime())
			System.out.println(103 + " is a prime Number");
	}

}
