package com.nacs.oops.inheritance.subtype;

import com.nacs.oops.inheritance.supertype.Vehicle;

public class Car extends Vehicle {
	private boolean automatic;
	private int noOfAirBags;

	public Car() {}

	public Car(int noOfTyres, String engine) {
		super(noOfTyres, engine);
	}

	public Car(boolean automatic, int noOfAirBags) {
		super();
		this.automatic = automatic;
		this.noOfAirBags = noOfAirBags;
	}

	public boolean isAutomatic() {
		return automatic;
	}

	public void setAutomatic(boolean automatic) {
		this.automatic = automatic;
	}

	public int getNoOfAirBags() {
		return noOfAirBags;
	}

	public void setNoOfAirBags(int noOfAirBags) {
		this.noOfAirBags = noOfAirBags;
	}
	
	public void setNoOfTyres(int no) {
		System.out.println("this is car class");
	}
	

	@Override
	public String toString() {
		return "Car [automatic=" + automatic 
				+ ", noOfAirBags=" + noOfAirBags + "], " 
				+ super.toString();
	}

}
