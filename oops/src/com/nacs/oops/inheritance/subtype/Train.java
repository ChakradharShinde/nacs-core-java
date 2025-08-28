package com.nacs.oops.inheritance.subtype;

import com.nacs.oops.inheritance.supertype.Vehicle;

public class Train extends Vehicle {
	private int noOfBoggies;

	public Train() {}

	public Train(int noOfBoggies) {
		this.noOfBoggies = noOfBoggies;
	}

	public int getNoOfBoggies() {
		return noOfBoggies;
	}

	public void setNoOfBoggies(int noOfBoggies) {
		this.noOfBoggies = noOfBoggies;
	}
	
	@Override
	public void setNoOfTyres(int noOfTyres) {
		System.out.println("this is train class");
//		int noOfTyresWithEngine=(noOfBoggies+2)*4;
//		int noOfTyresWithoutEngine=(noOfBoggies)*4;
//		if(noOfTyresWithoutEngine<=noOfTyres && noOfTyresWithEngine>=noOfTyres)
//			super.setNoOfTyres(noOfTyres);
//		else
//			super.setNoOfTyres(noOfTyresWithoutEngine);
	}

	@Override
	public String toString() {
		return "Train [noOfBoggies=" + noOfBoggies + "], " 
				+ super.toString();
	}
	
}
