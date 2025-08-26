package com.nacs.logicalprograms;

public class Power {
	int base;
	int exponent; 
	
	public Power() {
		
	}
	
	public Power(int base, int exponent) {
		this.base=base;
		this.exponent=exponent;			
	}
	
	public int getBase() {
		return base;
	}
	
	public int getExponent() {
		return exponent;
	}
	
	public void setBase(int base) {
		this.base=base;
	}
	
	public void setExponent(int exponent) {
		this.exponent=exponent;
	}
	
	public int calculatePower() {
		int power=1;
		for(int i=0;i<exponent;i++)
//			power=power*base;
			power*=base;
		
			return power;
	}
}
